package com.dacarpas.histainability

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.github.mikephil.charting.animation.Easing
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.google.gson.GsonBuilder
import kotlinx.android.synthetic.main.graph_display.*
import okhttp3.*
import java.io.IOException
import java.util.concurrent.CountDownLatch

class DisplayGraph : AppCompatActivity() {
    private var axis: Array<Float> = arrayOf(13f, 20f, 5f, 40f, 20f, 15f, 33f)
    private var content: String = "sustainable"
    private val yearStart = 1900
    private val yearEnd = 2019
    private var eventGoals: List<EventData> = listOf(EventData(1950, "Sample", "Sample desc", 1))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.graph_display)

        // back button
        val actionBar = supportActionBar
        actionBar!!.title = "Histainability"
        actionBar.setHomeAsUpIndicator(R.drawable.back_arrow)
        actionBar.setDisplayHomeAsUpEnabled(true)

        // receive data sent by intent
        val bundle: Bundle? = intent.extras
        content = bundle!!.getString("content").toString()

        eventGoals = when (bundle.getString("goalNumber").toString()) {
            "1" -> Supplier2.eventsGoal1
            "2" -> Supplier2.eventsGoal2
            else -> Supplier2.eventsGoal17
        }

        makeCards()
//        Toast.makeText(this, "i receive: $content", Toast.LENGTH_LONG).show()

        fetchJson()

//        Log.i("JSON", "Update axis[0] ${axis[0]}")

        makeGraph()


    }

    private fun makeCards() {

        // layout type for recycler view : linear, grid, staggered
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        rvHistoryEvents.layoutManager = layoutManager

        // calling the adapter, passing this activity as context and the array of data


        val adapter = GraphAdapter(this, this.eventGoals)
        rvHistoryEvents.adapter = adapter
        rvHistoryEvents.setHasFixedSize(true) // use for performance
    }

    private fun fetchJson() {
        val URL =
            "https://books.google.com/ngrams/json?content=$content&year_start=$yearStart&year_end=$yearEnd&corpus=26&smoothing=3&direct_url=t1%3B%2C$content%3B%2Cc0"
//        val URL = "https://books.google.com/ngrams/json?content=sustainable%2C+lol&year_start=1800&year_end=2019&corpus=26&smoothing=3&direct_url=t1%3B%2Csustainable%3B%2Cc0%3B.t1%3B%2Clol%3B%2Cc0"

        val request = Request.Builder().url(URL).build()

        // create client object for calling
        val client = OkHttpClient()

        val countDownLatch = CountDownLatch(1)
        client.newCall(request).enqueue(object : Callback {

            override fun onResponse(call: Call, response: Response) {
                val resBody = response.body?.string()

                val gson = GsonBuilder().create()
                // convert from JSON to object array
                val graphFeed = gson.fromJson(resBody, Array<GraphFeed>::class.java)

                for (g in graphFeed) {
                    axis = g.timeseries

                    // refresh graph with new data
                    lineChart.notifyDataSetChanged()
                    lineChart.invalidate()
                }
                countDownLatch.countDown()
            }

            override fun onFailure(call: Call, e: IOException) {
//                Toast.makeText(this@DisplayGraph, "Internet Issue", Toast.LENGTH_SHORT).show()
                Log.i("JSON", "Error receiving json object")
                return
            }
        })
        countDownLatch.await()

    }

    private fun makeGraph() {

        val entries = ArrayList<Entry>()
        var year = 1f + yearStart
        for (i in axis.indices) {
            entries.add(Entry(year, axis[i]))
            year += 1
        }

        val vl = LineDataSet(entries, "Event Data Points")


        vl.setDrawValues(false)
        vl.setDrawFilled(true)
        vl.lineWidth = 2f
        vl.fillColor = R.color.teal_200
        vl.fillAlpha = R.color.design_default_color_error

        lineChart.xAxis.labelRotationAngle = -30f
        lineChart.xAxis.position = XAxis.XAxisPosition.BOTTOM

        lineChart.data = LineData(vl)
        lineChart.axisRight.isEnabled = false
        lineChart.xAxis.axisMaximum = year + 0.1f
        lineChart.setTouchEnabled(true)
        lineChart.setPinchZoom(true)

        lineChart.description.text = "Historical Event"
        lineChart.setNoDataText("No forex yet!")

        lineChart.animateX(1000, Easing.EaseInExpo)


//        button6.setOnClickListener {
//            val intent = Intent(this, temp::class.java)
//            startActivity(intent)
//        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}


// data object obtained from google ngram json
class GraphFeed(val ngram: String, val timeseries: Array<Float>)

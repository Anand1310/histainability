package com.dacarpas.histainability

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.github.mikephil.charting.animation.Easing
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


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.graph_display)

        fetchJson()
        Log.i("JSON", "Update2 axis[0] ${axis[0]}")
        makeGraph()
    }

    private fun fetchJson() {
        val content = "sustainable"
        val yearStart = 1800
        val yearEnd = 2019
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
                countDownLatch.countDown();
            }

            override fun onFailure(call: Call, e: IOException) {
                Toast.makeText(this@DisplayGraph, "Internet Issue", Toast.LENGTH_SHORT).show()
                Log.i("JSON", "Error receiving json object")
                return
            }
        })
        countDownLatch.await();

    }

    private fun makeGraph() {

        val entries = ArrayList<Entry>()
        var j = 1f
        for (i in axis.indices) {
            entries.add(Entry(j, axis[i]))
            j += 1
        }

        val vl = LineDataSet(entries, "Events")

        vl.setDrawValues(false)
        vl.setDrawFilled(true)
        vl.lineWidth = 3f
        vl.fillColor = R.color.purple_700
        vl.fillAlpha = R.color.white

        lineChart.xAxis.labelRotationAngle = 0f

        lineChart.data = LineData(vl)

        lineChart.setTouchEnabled(true)
        lineChart.setPinchZoom(true)

        lineChart.description.text = "Historical Event"
        lineChart.setNoDataText("No forex yet!")

        lineChart.animateX(1800, Easing.EaseInExpo)


        button6.setOnClickListener{
            val intent = Intent(this, temp::class.java)
            startActivity(intent)
        }
    }
}


class GraphFeed(val ngram: String, val timeseries: Array<Float>)

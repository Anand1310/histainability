package com.dacarpas.histainability

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.mikephil.charting.animation.Easing
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import kotlinx.android.synthetic.main.graph_display.*

class DisplayGraph : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.graph_display)

        val axis = arrayOf(10f,20f,5f,40f,20f,15f,33f)

        val entries = ArrayList<Entry>()
        var j = 1f
        for(i in axis.indices)
        {
            entries.add(Entry(j,axis[i]))
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



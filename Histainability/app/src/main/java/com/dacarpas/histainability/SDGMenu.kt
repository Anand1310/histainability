package com.dacarpas.histainability

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.menu_sdg.*

class SdgMenu : AppCompatActivity() {
    private val sdgGoals = listOf<String>("poverty", "hunger", "health", "education", "gender equality",
        "sanitation", "clean energy", "economic growth", "infrastructure", "inequality", "sustainable cities",
        "responsible consumption", "climate", "waterlife", "landlife", "peace", "partnerships")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_sdg)

        // back button
        val actionBar = supportActionBar
        actionBar!!.title = "Histainability"
        actionBar.setHomeAsUpIndicator(R.drawable.back_arrow)
        actionBar.setDisplayHomeAsUpEnabled(true)


        sdg1.setOnClickListener {
            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, DisplayGraph::class.java)
            intent.putExtra("content", sdgGoals[1])
            startActivity(intent)
        }
        sdg2.setOnClickListener {
            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, DisplayGraph::class.java)
            intent.putExtra("content", sdgGoals[2])
            startActivity(intent)
        }

        sdg3.setOnClickListener {
            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, DisplayGraph::class.java)
            intent.putExtra("content", sdgGoals[3])
            startActivity(intent)
        }

        sdg4.setOnClickListener {
            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, DisplayGraph::class.java)
            intent.putExtra("content", sdgGoals[4])
            startActivity(intent)
        }

        sdg5.setOnClickListener {
            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, DisplayGraph::class.java)
            intent.putExtra("content", sdgGoals[5])
            startActivity(intent)
        }

        sdg6.setOnClickListener {
            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, DisplayGraph::class.java)
            intent.putExtra("content", sdgGoals[6])
            startActivity(intent)
        }

        sdg7.setOnClickListener {
            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, DisplayGraph::class.java)
            intent.putExtra("content", sdgGoals[7])
            startActivity(intent)
        }

        sdg8.setOnClickListener {
            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, DisplayGraph::class.java)
            intent.putExtra("content", sdgGoals[8])
            startActivity(intent)
        }

        sdg9.setOnClickListener {
            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, DisplayGraph::class.java)
            intent.putExtra("content", sdgGoals[9])
            startActivity(intent)
        }

        sdg10.setOnClickListener {
            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, DisplayGraph::class.java)
            intent.putExtra("content", sdgGoals[10])
            startActivity(intent)
        }

        sdg11.setOnClickListener {
            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, DisplayGraph::class.java)
            intent.putExtra("content", sdgGoals[11])
            startActivity(intent)
        }

        sdg12.setOnClickListener {
            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, DisplayGraph::class.java)
            intent.putExtra("content", sdgGoals[12])
            startActivity(intent)
        }

        sdg13.setOnClickListener {
            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, DisplayGraph::class.java)
            intent.putExtra("content", sdgGoals[13])
            startActivity(intent)
        }

        sdg14.setOnClickListener {
            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, DisplayGraph::class.java)
            intent.putExtra("content", sdgGoals[14])
            startActivity(intent)
        }

        sdg15.setOnClickListener {
            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, DisplayGraph::class.java)
            intent.putExtra("content", sdgGoals[15])
            startActivity(intent)
        }

        sdg16.setOnClickListener {
            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, DisplayGraph::class.java)
            intent.putExtra("content", sdgGoals[16])
            startActivity(intent)
        }

        sdg17.setOnClickListener {
            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, DisplayGraph::class.java)
            intent.putExtra("content", sdgGoals[17])
            startActivity(intent)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
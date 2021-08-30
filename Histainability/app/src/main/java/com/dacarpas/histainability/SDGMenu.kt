package com.dacarpas.histainability

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.menu_sdg.*

class SdgMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_sdg)

        // back button
        val actionBar = supportActionBar
        actionBar!!.title = "Histainability"
        actionBar.setHomeAsUpIndicator(R.drawable.back_arrow)
        actionBar.setDisplayHomeAsUpEnabled(true)

//        backBtn.setOnClickListener{
//            val intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)
//        }

        sdg1.setOnClickListener {
            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, DisplayGraph::class.java)
            intent.putExtra("content", sdg1.text)
            startActivity(intent)
        }
        sdg2.setOnClickListener {
            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, DisplayGraph::class.java)
            intent.putExtra("content", sdg2.text)
            startActivity(intent)
        }

        sdg3.setOnClickListener {
            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, DisplayGraph::class.java)
            intent.putExtra("content", sdg3.text)
            startActivity(intent)
        }

        sdg4.setOnClickListener {
            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, DisplayGraph::class.java)
            intent.putExtra("content", sdg4.text)
            startActivity(intent)
        }

        sdg5.setOnClickListener {
            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, DisplayGraph::class.java)
            intent.putExtra("content", sdg5.text)
            startActivity(intent)
        }

        sdg6.setOnClickListener {
            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, DisplayGraph::class.java)
            intent.putExtra("content", sdg6.text)
            startActivity(intent)
        }

        sdg7.setOnClickListener {
            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, DisplayGraph::class.java)
            intent.putExtra("content", sdg7.text)
            startActivity(intent)
        }

        sdg8.setOnClickListener {
            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, DisplayGraph::class.java)
            intent.putExtra("content", sdg8.text)
            startActivity(intent)
        }

        sdg9.setOnClickListener {
            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, DisplayGraph::class.java)
            intent.putExtra("content", sdg9.text)
            startActivity(intent)
        }

        sdg10.setOnClickListener {
            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, DisplayGraph::class.java)
            intent.putExtra("content", sdg10.text)
            startActivity(intent)
        }

        sdg11.setOnClickListener {
            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, DisplayGraph::class.java)
            intent.putExtra("content", sdg11.text)
            startActivity(intent)
        }

        sdg12.setOnClickListener {
            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, DisplayGraph::class.java)
            intent.putExtra("content", sdg12.text)
            startActivity(intent)
        }

        sdg13.setOnClickListener {
            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, DisplayGraph::class.java)
            intent.putExtra("content", sdg13.text)
            startActivity(intent)
        }

        sdg14.setOnClickListener {
            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, DisplayGraph::class.java)
            intent.putExtra("content", sdg14.text)
            startActivity(intent)
        }

        sdg15.setOnClickListener {
            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, DisplayGraph::class.java)
            intent.putExtra("content", sdg15.text)
            startActivity(intent)
        }

        sdg16.setOnClickListener {
            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, DisplayGraph::class.java)
            intent.putExtra("content", sdg16.text)
            startActivity(intent)
        }

        sdg17.setOnClickListener {
            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, DisplayGraph::class.java)
            intent.putExtra("content", sdg17.text)
            startActivity(intent)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
//        return super.onNavigateUp()
        onBackPressed()
        return true
    }
}
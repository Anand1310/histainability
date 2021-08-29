package com.dacarpas.histainability

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.menu_sdg.*

class SdgMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_sdg)

        backBtn.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        sdg1.setOnClickListener{
            val intent = Intent(this, DisplayGraph::class.java)
            startActivity(intent)
        }
        sdg2.setOnClickListener{
            val intent = Intent(this, DisplayGraph::class.java)
            startActivity(intent)
        }
        sdg3.setOnClickListener{
            val intent = Intent(this, DisplayGraph::class.java)
            startActivity(intent)
        }
        sdg4.setOnClickListener{
            val intent = Intent(this, DisplayGraph::class.java)
            startActivity(intent)
        }
        sdg5.setOnClickListener{
            val intent = Intent(this, DisplayGraph::class.java)
            startActivity(intent)
        }
        sdg6.setOnClickListener{
            val intent = Intent(this, DisplayGraph::class.java)
            startActivity(intent)
        }
        sdg7.setOnClickListener{
            val intent = Intent(this, DisplayGraph::class.java)
            startActivity(intent)
        }
        sdg8.setOnClickListener{
            val intent = Intent(this, DisplayGraph::class.java)
            startActivity(intent)
        }
        sdg9.setOnClickListener{
            val intent = Intent(this, DisplayGraph::class.java)
            startActivity(intent)
        }
        sdg10.setOnClickListener{
            val intent = Intent(this, DisplayGraph::class.java)
            startActivity(intent)
        }
        sdg11.setOnClickListener{
            val intent = Intent(this, DisplayGraph::class.java)
            startActivity(intent)
        }
        sdg12.setOnClickListener{
            val intent = Intent(this, DisplayGraph::class.java)
            startActivity(intent)
        }
        sdg13.setOnClickListener {
            val intent = Intent(this, DisplayGraph::class.java)
            startActivity(intent)
        }
        sdg14.setOnClickListener{
            val intent = Intent(this, DisplayGraph::class.java)
            startActivity(intent)
        }
        sdg15.setOnClickListener{
            val intent = Intent(this, DisplayGraph::class.java)
            startActivity(intent)
        }
        sdg16.setOnClickListener{
            val intent = Intent(this, DisplayGraph::class.java)
            startActivity(intent)
        }
    }
}
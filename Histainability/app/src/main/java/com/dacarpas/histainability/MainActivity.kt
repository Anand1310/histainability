package com.dacarpas.histainability

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var graph: TextView
    private lateinit var settings : TextView
    private lateinit var quiz : TextView
    private lateinit var other_app : TextView
    private lateinit var logo : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        graph = findViewById(R.id.graph_text)
        settings = findViewById(R.id.settings_text)
        quiz = findViewById(R.id.quiz_text)
        other_app = findViewById(R.id.other_aap)
        logo = findViewById(R.id.App_Logo)



        graph.setOnClickListener {
            val intent = Intent(this,GraphActivity::class.java)
            startActivity(intent)
        }

        settings.setOnClickListener {
            val intent = Intent(this,SettingsActivity::class.java)
            startActivity(intent)
        }

        quiz.setOnClickListener {
            val intent = Intent(this,QuizActivity::class.java)
            startActivity(intent)
        }

        other_app.setOnClickListener {
            val intent = Intent(this,OtherAppsLinkActivity::class.java)
            startActivity(intent)
        }

        logo.setOnClickListener {
            Toast.makeText(this,"Made with ❤ by DACARPAS Group",Toast.LENGTH_LONG).show()
        }


    }
}
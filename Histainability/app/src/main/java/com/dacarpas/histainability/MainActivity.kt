package com.dacarpas.histainability

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        graph_text.setOnClickListener {
            val intent = Intent(this,SdgMenu::class.java)
            startActivity(intent)
        }


        settings_text.setOnClickListener {
            val intent = Intent(this,SettingsActivity::class.java)
            startActivity(intent)
        }

        quiz_text.setOnClickListener {
            val intent = Intent(this,QuizActivity::class.java)
            startActivity(intent)
        }

        other_app.setOnClickListener {
            val intent = Intent(this,LinkActivity::class.java)
            startActivity(intent)
        }

        App_Logo.setOnClickListener {
            Toast.makeText(this,"Made with ❤ by DACARPAS Group",Toast.LENGTH_LONG).show()
        }
    }

}


package com.dacarpas.histainability

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btngraphmenu.setOnClickListener{
            val intent = Intent(this, SdgMenu::class.java)
            startActivity(intent)

        }

        btnlinks.setOnClickListener{
            val intent = Intent(this, LinkActivity::class.java)
            startActivity(intent)
        }
    }

}


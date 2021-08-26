package com.dacarpas.histainability

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.menu_sdg.*

class SdgMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_sdg)

        graph.setOnClickListener{
            val intent = Intent(this, Graph::class.java)
            startActivity(intent)
        }
    }
}
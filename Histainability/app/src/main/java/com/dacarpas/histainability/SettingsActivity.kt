package com.dacarpas.histainability

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import kotlinx.android.synthetic.main.activity_settings.*

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)


        val actionBar = supportActionBar
        actionBar!!.title = "Histainability"
        actionBar.setHomeAsUpIndicator(R.drawable.back_arrow)
        actionBar.setDisplayHomeAsUpEnabled(true)

        switch1.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            }
            else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
        }

    }

    override fun onSupportNavigateUp(): Boolean {
//        return super.onNavigateUp()
        onBackPressed()
        return true
    }
}
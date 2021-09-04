package com.dacarpas.histainability

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class QuizMenu : AppCompatActivity() {

    private lateinit var sdg1 : Button
    private lateinit var sdg2 : Button
    private lateinit var sdg3 : Button
    private lateinit var sdg4 : Button
    private lateinit var sdg5 : Button
    private lateinit var sdg6 : Button
    private lateinit var sdg7 : Button
    private lateinit var sdg8 : Button
    private lateinit var sdg9 : Button
    private lateinit var sdg10 : Button
    private lateinit var sdg11 : Button
    private lateinit var sdg12 : Button
    private lateinit var sdg13 : Button
    private lateinit var sdg14 : Button
    private lateinit var sdg15 : Button
    private lateinit var sdg16 : Button
    private lateinit var sdg17 : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_quiz)


        sdg1 = findViewById(R.id.quiz_sdg1)
        sdg2 = findViewById(R.id.quiz_sdg2)
        sdg3 = findViewById(R.id.quiz_sdg3)
        sdg4 = findViewById(R.id.quiz_sdg4)
        sdg5 = findViewById(R.id.quiz_sdg5)
        sdg6 = findViewById(R.id.quiz_sdg6)
        sdg7 = findViewById(R.id.quiz_sdg7)
        sdg8 = findViewById(R.id.quiz_sdg8)
        sdg9 = findViewById(R.id.quiz_sdg9)
        sdg10 = findViewById(R.id.quiz_sdg10)
        sdg11 = findViewById(R.id.quiz_sdg11)
        sdg12 = findViewById(R.id.quiz_sdg12)
        sdg13 = findViewById(R.id.quiz_sdg13)
        sdg14 = findViewById(R.id.quiz_sdg14)
        sdg15 = findViewById(R.id.quiz_sdg15)
        sdg16 = findViewById(R.id.quiz_sdg16)
        sdg17 = findViewById(R.id.quiz_sdg17)

        // back button
        val actionBar = supportActionBar
        actionBar!!.title = "Histainability : Quiz"
        actionBar.setHomeAsUpIndicator(R.drawable.back_arrow)
        actionBar.setDisplayHomeAsUpEnabled(true)



        sdg1.setOnClickListener {
            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, QuizActivity::class.java)
            intent.putExtra("questions", "1")
            startActivity(intent)
        }
        sdg2.setOnClickListener {
            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, QuizActivity::class.java)
            intent.putExtra("questions", "2")
            startActivity(intent)
        }

        sdg3.setOnClickListener {
            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, QuizActivity::class.java)
            intent.putExtra("questions", "3")
            startActivity(intent)
        }

        sdg4.setOnClickListener {
            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, QuizActivity::class.java)
            intent.putExtra("questions", "4")
            startActivity(intent)
        }

        sdg5.setOnClickListener {
            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, QuizActivity::class.java)
            intent.putExtra("questions", "5")
            startActivity(intent)
        }

        sdg6.setOnClickListener {
            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, QuizActivity::class.java)
            intent.putExtra("questions", "6")
            startActivity(intent)
        }

        sdg7.setOnClickListener {
            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, QuizActivity::class.java)
            intent.putExtra("questions", "7")
            startActivity(intent)
        }

        sdg8.setOnClickListener {
            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, QuizActivity::class.java)
            intent.putExtra("questions", "8")
            startActivity(intent)
        }

        sdg9.setOnClickListener {
            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, QuizActivity::class.java)
            intent.putExtra("questions", "9")
            startActivity(intent)
        }

        sdg10.setOnClickListener {
            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, QuizActivity::class.java)
            intent.putExtra("questions", "10")
            startActivity(intent)
        }

        sdg11.setOnClickListener {
            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, QuizActivity::class.java)
            intent.putExtra("questions", "11")
            startActivity(intent)
        }

        sdg12.setOnClickListener {
            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, QuizActivity::class.java)
            intent.putExtra("questions", "12")
            startActivity(intent)
        }

        sdg13.setOnClickListener {
            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, QuizActivity::class.java)
            intent.putExtra("questions", "13")
            startActivity(intent)
        }

        sdg14.setOnClickListener {
            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, QuizActivity::class.java)
            intent.putExtra("questions", "14")
            startActivity(intent)
        }

        sdg15.setOnClickListener {
            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, QuizActivity::class.java)
            intent.putExtra("questions", "15")
            startActivity(intent)
        }

        sdg16.setOnClickListener {
            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, QuizActivity::class.java)
            intent.putExtra("questions", "16")
            startActivity(intent)
        }

        sdg17.setOnClickListener {
            Toast.makeText(this, "Loading...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, QuizActivity::class.java)
            intent.putExtra("questions", "17")
            startActivity(intent)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
//        return super.onNavigateUp()
        onBackPressed()
        return true
    }
}
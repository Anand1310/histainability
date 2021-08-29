package com.dacarpas.histainability

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class QuizActivity : AppCompatActivity() {

    private lateinit var quizQuestion : RecyclerView
    private lateinit var adapter : QuizAdapter
    private lateinit var Score : TextView
    private lateinit var Solved : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        quizQuestion = findViewById(R.id.quiz_questions)
        Score = findViewById(R.id.quiz_score)
        Solved = findViewById(R.id.quiz_solved)



        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL

        Score.text = "Hello Sire"
        Solved.text = "byr Sire"

        adapter= QuizAdapter(this, Supplier.questions)
        quizQuestion.adapter = adapter
        quizQuestion.setHasFixedSize(true)

        adapter.notifyDataSetChanged()
        quizQuestion.layoutManager = layoutManager




    }
}
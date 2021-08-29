package com.dacarpas.histainability

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class QuizActivity : AppCompatActivity() {

    private lateinit var quizQuestion : RecyclerView
    private lateinit var adapter : QuizAdapter
    private lateinit var Score : TextView
    private lateinit var Solved : TextView
    private lateinit var SubmitQuiz : Button
    private lateinit var RefreshQuiz : ImageButton
    private var SelectedOptions : Int = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        quizQuestion = findViewById(R.id.quiz_questions)
        Score = findViewById(R.id.quiz_score)
        Solved = findViewById(R.id.quiz_solved)
        SubmitQuiz = findViewById(R.id.submit_quiz)
        RefreshQuiz = findViewById(R.id.refresh_button)
        SelectedOptions = 0


        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL


        Score.text = "Submit to check score"
        Solved.text = "Solved: 0 / ${Supplier.questions.size}"

        adapter = QuizAdapter(this,
            Supplier.questions,
            object: QuizAdapter.AdapterOnClick{
                override fun onClick(pos: Int, option: Int) {

                    if(Supplier.questions[pos].user_choice == -1){
                        SelectedOptions ++
                    }

                    Supplier.questions[pos].user_choice = option


                    Solved.text = "Solved: ${SelectedOptions} / ${Supplier.questions.size}"


                    Log.i("quizz", Supplier.questions.toString())

                }

            }
        )
        quizQuestion.adapter = adapter
        quizQuestion.setHasFixedSize(true)

        adapter.notifyDataSetChanged()
        quizQuestion.layoutManager = layoutManager

        SubmitQuiz.setOnClickListener {
            var score : Int = 0

            Log.i("quizz", Supplier.questions.toString())

            for(question in Supplier.questions){
                if(question.correct_option == question.user_choice){
                    score ++
                }
            }

            var scoreInPer : Double = (score.toDouble() / Supplier.questions.size.toDouble()) * 100

            Score.text = "Score : ${scoreInPer} / 100 %"

        }

        RefreshQuiz.setOnClickListener {
            finish();
            startActivity(getIntent());
        }


    }

    override fun onResume() {
        super.onResume()

        for(question in Supplier.questions){
            question.user_choice = -1
        }

    }
}
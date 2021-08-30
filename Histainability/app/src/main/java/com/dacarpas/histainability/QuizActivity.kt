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

    private var questions : List<Question> = Supplier.questions_goal1




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        quizQuestion = findViewById(R.id.quiz_questions)
        Score = findViewById(R.id.quiz_score)
        Solved = findViewById(R.id.quiz_solved)
        SubmitQuiz = findViewById(R.id.submit_quiz)
        RefreshQuiz = findViewById(R.id.refresh_button)
        SelectedOptions = 0


        val bundle: Bundle? = intent.extras
        questions = when(bundle!!.getString("questions").toString()){
            "1" -> Supplier.questions_goal1
            "2" -> Supplier.questions_goal2
            "3" -> Supplier.questions_goal3
            "4" -> Supplier.questions_goal4
            "5" -> Supplier.questions_goal5
            "6" -> Supplier.questions_goal6
            "7" -> Supplier.questions_goal7
            "8" -> Supplier.questions_goal8
            "9" -> Supplier.questions_goal9
            "10" -> Supplier.questions_goal10
            "11" -> Supplier.questions_goal11
            "12" -> Supplier.questions_goal12
            "13" -> Supplier.questions_goal13
            "14" -> Supplier.questions_goal14
            "15" -> Supplier.questions_goal15
            "16" -> Supplier.questions_goal16

            else -> Supplier.questions_goal17
        }


        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL


        Score.text = "Score here"
        Solved.text = "Solved: 0 / ${questions.size}"

        adapter = QuizAdapter(this,
            questions,
            object: QuizAdapter.AdapterOnClick{
                override fun onClick(pos: Int, option: Int) {

                    if(questions[pos].user_choice == -1){
                        SelectedOptions ++
                    }

                    questions[pos].user_choice = option


                    Solved.text = "Solved: ${SelectedOptions} / ${questions.size}"


                    Log.i("quizz", questions.toString())

                }

            }
        )
        quizQuestion.adapter = adapter
        quizQuestion.setHasFixedSize(true)

        adapter.notifyDataSetChanged()
        quizQuestion.layoutManager = layoutManager

        SubmitQuiz.setOnClickListener {
            var score : Int = 0

            Log.i("quizz", questions.toString())

            for(question in questions){
                if(question.correct_option == question.user_choice){
                    score ++
                }
            }

            var scoreInPer : Double = (score.toDouble() / questions.size.toDouble()) * 100

            scoreInPer = String.format("%.2f", scoreInPer).toDouble()

            Score.text = "${scoreInPer} / 100 %"

        }

        RefreshQuiz.setOnClickListener {
            finish();
            startActivity(getIntent());
        }


    }

    override fun onResume() {
        super.onResume()

        for(question in questions){
            question.user_choice = -1
        }

    }
}
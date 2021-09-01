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
    private lateinit var score : TextView
    private lateinit var solved : TextView
    private lateinit var submitQuiz : Button
    private lateinit var refreshQuiz : ImageButton
    private var selectedOptions : Int = 0

    private var questions : List<Question> = Supplier.questions_goal1


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        quizQuestion = findViewById(R.id.quiz_questions)
        score = findViewById(R.id.quiz_score)
        solved = findViewById(R.id.quiz_solved)
        submitQuiz = findViewById(R.id.submit_quiz)
        refreshQuiz = findViewById(R.id.refresh_button)
        selectedOptions = 0

        val actionBar = supportActionBar
        actionBar!!.title = "Histainability"
        actionBar.setHomeAsUpIndicator(R.drawable.back_arrow)
        actionBar.setDisplayHomeAsUpEnabled(true)


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


        score.text = "Score here"
        solved.text = "Solved: 0 / ${questions.size}"

        adapter = QuizAdapter(this,
            questions,
            object: QuizAdapter.AdapterOnClick{
                override fun onClick(pos: Int, option: Int) {

                    if(questions[pos].user_choice == -1){
                        selectedOptions ++
                    }

                    questions[pos].user_choice = option


                    solved.text = "Solved: $selectedOptions / ${questions.size}"


//                    Log.i("Quiz", questions.toString())

                }

            }
        )
        quizQuestion.adapter = adapter
        quizQuestion.setHasFixedSize(true)

        adapter.notifyDataSetChanged()
        quizQuestion.layoutManager = layoutManager

        submitQuiz.setOnClickListener {
            var score : Int = 0

//            Log.i("Quiz", questions.toString())

            for(question in questions){
                if(question.correct_option == question.user_choice){
                    score ++
                }
            }

            var scoreInPer : Double = (score.toDouble() / questions.size.toDouble()) * 100

            scoreInPer = String.format("%.2f", scoreInPer).toDouble()

            this.score.text = "$scoreInPer / 100 %"

        }

        refreshQuiz.setOnClickListener {
            finish()
            startActivity(getIntent())
        }


    }

    override fun onResume() {
        super.onResume()

        for(question in questions){
            question.user_choice = -1
        }

    }
    override fun onSupportNavigateUp(): Boolean {
//        return super.onNavigateUp()
        onBackPressed()
        return true
    }
}
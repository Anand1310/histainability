package com.dacarpas.histainability

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView

class QuizAdapter(val context: Context,
                  private val questionsList: List<Question>,
                  val adapterOnClick: AdapterOnClick ) :
    RecyclerView.Adapter<QuizAdapter.MyViewHolder>() {

    interface AdapterOnClick {
        fun onClick(pos: Int, option : Int)
    }

    override fun getItemCount(): Int {
        return questionsList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.quiz_question, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val question = questionsList[position]


        holder.setData(question, position)
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private var currentQuestion: Question? = null
        private var currentPosition: Int = 0

        private var questionStatement: TextView = itemView.findViewById<TextView>(R.id.question_statement)
        private var option1: RadioButton = itemView.findViewById<RadioButton>(R.id.option1)
        private var option2: RadioButton = itemView.findViewById<RadioButton>(R.id.option2)
        private var option3: RadioButton = itemView.findViewById<RadioButton>(R.id.option3)
        private var option4: RadioButton = itemView.findViewById<RadioButton>(R.id.option4)

        init {
            option1.setOnClickListener {

                adapterOnClick.onClick(currentPosition,0)

            }


            option2.setOnClickListener {


                adapterOnClick.onClick(currentPosition,1)
            }


            option3.setOnClickListener {


                adapterOnClick.onClick(currentPosition,2)
            }


            option4.setOnClickListener {


                adapterOnClick.onClick(currentPosition,3)
            }

        }

        fun setData(question: Question?, pos: Int){
            questionStatement.text = question!!.question
            option1.text = question.options[0]
            option2.text = question.options[1]
            option3.text = question.options[2]
            option4.text = question.options[3]


            this.currentPosition = pos
            this.currentQuestion = question

            if(question.user_choice == -1){
                option1.isChecked = false
                option2.isChecked = false
                option3.isChecked = false
                option4.isChecked = false
            }else{
                when(question.user_choice){
                    0 -> option1.isChecked = true
                    1 -> option2.isChecked = true
                    2 -> option3.isChecked = true
                    3 -> option4.isChecked = true

                }
            }

        }
    }
}
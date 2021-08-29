package com.dacarpas.histainability

data class Question(var question: String,var options: List<String>, var correct_option : Int, var user_choice : Int)

object Supplier {

    val questions = listOf<Question>(
        Question("What is life ?", listOf("Joke", "Pain", "Opposite of good","All of the above"), 0,-1),
        Question("What is life ?", listOf("Joke", "Pain", "Opposite of good","All of the above"), 1,-1),
        Question("What is life ?", listOf("Joke", "Pain", "Opposite of good","All of the above"), 2,-1),
        Question("What is life ?", listOf("Joke", "Pain", "Opposite of good","All of the above"), 3,-1),

    )
}
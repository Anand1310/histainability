package com.dacarpas.histainability

// data of the important events in history of SDG Goals
data class EventData (val title : String, val description : String, val starCount : Int)

object Supplier {
    val eventsGoal1 = listOf<EventData>(
        EventData("poverty", "poverty is bad and decreasing", 1),
        EventData("sustainable", "sus is good and increasing", 2),
    )

    val eventsGoal2 = listOf<EventData>(
        EventData("poverty", "poverty is bad and decreasing", 3),
        EventData("sustainable", "sus is good and increasing", 0),
    )

}
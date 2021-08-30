package com.dacarpas.histainability

// data of the important events in history of SDG Goals
data class EventData (val title : String, val description : String, val starCount : Int)

object Supplier2 {
    val eventsGoal1 = listOf<EventData>(
        EventData("Poverty", "poverty is bad and decreasing", 1),
        EventData("Sustainable", "sus is good and increasing", 2),
        EventData("Poverty", "poverty is bad and decreasing", 11),
        EventData("Poverty", "poverty is bad and decreasing!", 1),
        EventData("Sustainable", "sus is go3od and increasing", 2),
        EventData("Sustainable", "sus is good and 1increasing", 2),
    )

    val eventsGoal2 = listOf<EventData>(
        EventData("Poverty", "poverty is bad2 and decreasing", 3),
        EventData("Sustainable", "sus is good2 and increasing", 0),
    )
    val eventsGoal17 = listOf<EventData>(
        EventData("Poverty", "poverty is bad17 and decreasing", 3),
        EventData("Sustainable", "sus is good17 and increasing", 0),
    )

}
package com.dacarpas.histainability

// data of the important events in history of SDG Goals
data class EventData(val year: Int, val title: String, val description: String, val starCount: Int)

object Supplier2 {
    val eventsGoal1 = listOf<EventData>(
        EventData(
            1968,
            "Black American Athletes Raised Their Fists at the 1968 Olympics",
            "Wearing beads and scarves to oppose lynchings and black socks with no shoes to highlight poverty, African American sprinters Tommie Smith and John Carlos took to the podium during the October 16, 1968, Olympic medal ceremony in Mexico City to receive their respective gold and bronze medals in the 200-meter race. But it was a single accessory—a black glove—and an accompanying gesture—a raised fist during the American national anthem—that sparked an uproar. From that moment, the two athletes would be vilified, threatened and, in some circles, celebrated.",
            1
        ),
        EventData(
            2019,
            "Covid 19 effect",
            "Globally, the number of people living in extreme poverty declined from 36 per cent in 1990 to 10 per cent in 2015. But the pace of change is decelerating and the COVID-19 crisis risks reversing decades of progress in the fight against poverty. New research published by the UNU World Institute for Development Economics Research warns that the economic fallout from the global pandemic could increase global poverty by as much as half a billion people, or 8% of the total human population. This would be the first time that poverty has increased globally in thirty years, since 1990.",
            1
        ),
        EventData(
            2016,
            "UNDP at 50 – Leading the fight against poverty and inequality",
            "Since its inception in 1966, the UN Development Programme (UNDP) – the Organization’s largest provider of grants for sustainable human development worldwide – has been on the front lines of UN development efforts, partnering with countries and organizations to reduce poverty, empower women, create jobs, protect the environment and narrow the gap between the ‘haves’ and ‘have nots.’",
            1
        ),

    )

    val eventsGoal2 = listOf<EventData>(
        EventData(1930,"Poverty", "poverty is bad2 and decreasing", 3),
        EventData(1920,"Sustainable", "sus is good2 and increasing", 0),
    )

    val eventsGoal17 = listOf<EventData>(
        EventData(1999,"Poverty", "poverty is bad17 and decreasing", 3),
        EventData(1970,"Sustainable", "sus is good17 and increasing", 0),
    )

}
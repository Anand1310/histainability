package com.dacarpas.histainability

class Question(
    var question: String,
    var options: List<String>,
    var correct_option: Int,
    var user_choice: Int
)

object Supplier {

    val questions_goal1 = listOf<Question>(
        Question(
            "The black athletes are were from which nation who raised their hands to oppose racism and poverty ? ",
            listOf("Britain", "South Africa", "America", "Cuba"),
            2,
            -1
        ),
        Question(
            "What was the event in which those black athletes won?",
            listOf("400 M", "800 M", "Cycling", "Swimming"),
            0,
            -1
        ),
        Question(
            "When does the global poverty index was lowest ?",
            listOf("2020", "2019", "2015", "2014"),
            2,
            -1
        ),
        Question(
            "What is the full form of UNDP?",
            listOf(
                "United Nations Development Programme",
                "United Nations Developing Programme",
                "Union Nation Developing Programme",
                "Union National Developing Programme"
            ),
            0,
            -1
        ),
        Question(
            "From where great depression start?",
            listOf("India", "China", "USA", "Africa"),
            2,
            -1
        ),
        Question(
            "What does the day of great depression called?",
            listOf("Depressing Friday", "Black Tuesday", "Depressing Tuesday", "Black Friday"),
            1,
            -1
        ),
        Question(
            "Till which major event great depression stayed?",
            listOf("World War 2", "Green Revolution", "World War 1", "Globalization"),
            0,
            -1
        ),
        Question(
            "When does black monday happned ?",
            listOf("19 Oct 1987", "13 Oct 1930", "14 Oct 1969", "3 Dec 1989"),
            0,
            -1
        ),
        Question(
            "What does black monday signify ?",
            listOf("Global Market Crash", "Great Depression", "World War 1", "World War 2"),
            0,
            -1
        ),
        Question(
            "Who was responsible for Indian stock market scam?",
            listOf("Amit Kesari", "Harshad Mehta", "Anil Ambani", "Aditya Sharma"),
            1,
            -1
        ),
    )

    val questions_goal2 = listOf<Question>(
        Question(
            "Around how many people are facing food shortage according to UN report?",
            listOf("2.3 B", "2.3 M", "4.7 B", "4.7 M"),
            0,
            -1
        ),
        Question(
            "United Nations Secretary-General Ban Ki-Moon launched which programme?",
            listOf(
                "The Zero Hunger Challenge",
                "Green Revolution",
                "Donate the Food",
                "Let Everyone Eat"
            ),
            0,
            -1
        ),
        Question(
            "What does FAO stands for?",
            listOf(
                "Food and Architecture Organisation",
                "Future Agriculture Organisation",
                "Food and Agriculture Organisation",
                "Family Agriculture Organisation"
            ),
            2,
            -1
        ),
        Question(
            "Which is one of the major reason for food scarcity according to UN?",
            listOf("Poor Management", "Productivity", "Will", "Conflicts"),
            3,
            -1
        ),
        Question(
            "When did Gandhi ji started Ahemdabad mill campaign ?",
            listOf("1918", "1917", "1916", "1919"),
            0,
            -1
        ),
    )
    val questions_goal3 = listOf<Question>(
        Question(
            "What is UNICEF full form?",
            listOf(
                "United Nations Children’s Fund",
                "United Nations Children’s Foundation",
                "United Nations Children’s Fun",
                "United Nations Child’s Foundation"
            ),
            0,
            -1
        ),
        Question(
            "Which age grp suffers most hypertension?",
            listOf("14-18 years", "30-79 years", "18-30 years", "79-89 years"),
            1,
            -1
        ),
    )

    val questions_goal4 = listOf<Question>(
        Question(
            "Full form of WHD?",
            listOf(
                "World Health Day",
                "World Hungry Day",
                "World Humanitarian Day",
                "Worst Human Day"
            ),
            2,
            -1
        ),
        Question(
            "When is World Health Day?",
            listOf("19 Aug", "20 Aug", "19 jan", "20 Jan"),
            0,
            -1
        ),
    )
    val questions_goal5 = listOf<Question>(
        Question(
            "What are some harmful effects for women and girls who undergo Female Genital Mutilation (FGM)?",
            listOf(
                "Violation of Human Rights",
                "Health problems and difficulty giving birth",
                "Psychological impacts",
                "All of the Above"
            ),
            3,
            -1
        ),
        Question(
            "Which country has the highest number of woman representatives in national parliament?",
            listOf("Cuba", "Bolivia", "Rwanda", "United Arab Emirates"),
            2,
            -1
        ),
        Question(
            "What percentage of health and social workers are women?",
            listOf("70%", "75%", "80%", "85%"),
            3,
            -1
        ),

        )

    val questions_goal6 = listOf<Question>(
        Question(
            "What percentage of the world's water is potable?",
            listOf("<3%", ">40%", ">67%", "None of the above"),
            0,
            -1
        ),
        Question(
            "What are NOT natural water reservoirs?",
            listOf("Moors", "Irrigation canals", "Forest soils", "Dam"),
            1,
            -1
        ),
        Question(
            "Which city successfully fought against the privatisation of water supply in 2000?",
            listOf(
                "Cochabamba, Bolivia",
                "Hamburg, Germany",
                "Amsterdam, Netherlands",
                "Jaipur, India"
            ),
            0,
            -1
        ),
        Question(
            "Which world-famous spring water city does the Nestlé multinational corporation dig out the water from?",
            listOf("Vittel", "San Pelegrino", "Volvic", "Hyderabad"),
            3,
            -1
        )
    )
    val questions_goal7 = listOf<Question>(
        Question(
            "What is the largest source of renewable energy today ?",
            listOf("Modern bioenergy", "Solar energy", " Wind energy", "Underwater currents"),
            0,
            -1
        ),
        Question(
            "In the period of 2010–2018, which country was the top recipient of international public financing in support of clean energy ?",
            listOf("India", "China", "Turkey", "Finland"),
            0,
            -1
        ),
        Question(
            "In which country a food security and nutrition programme is promoting the use of solar energy in the food production? Farmers are able to produce at a lower \n" +
                    "cost and reduce their CO2 emissions.",
            listOf("South Korea", "New Zealand", "USA", "Bolivia"),
            3,
            -1
        ),
        Question(
            "Globally, how many people lacked access to electricity in 2019?",
            listOf("354 million", "759 million", "1.2 billion", "54 million"),
            1,
            -1
        ),


        )

    val questions_goal8 = listOf<Question>(
        Question(
            "The definiton of Sustainable Economic Growth 'Sustain per capita economic growth in accordance with national circumstances and, in particular, at least 7% gross domestic product growth per annum in the least developed countries.' is given by ?",
            listOf("UNESCO", "UN", "ILO", "WHO"),
            1,
            -1
        ),
        Question(
            "The National Skill Development Mission, officially launched by the Hon’ble Prime Minister on 15.07.2015 was on the occasion of ? ",
            listOf(
                "World Youth Skills Day",
                "World Yoga Day",
                "World labour Day",
                "World Clean Energy Day"
            ),
            0,
            -1
        ),
        Question(
            "The country having maximum Unemployment rate is (>25%) ?",
            listOf("Russia", "Pakistan", "India", "South Africa"),
            3,
            -1
        ),
        Question(
            "What is the idelogy at the core of this sustainable development agenda for 2030 and if economic growth is to build a fairer world, it must be inclusive is ?",
            listOf(
                "‘No one left behind’",
                "'Work or Starve'",
                "'Together we rise'",
                "'Towards each other for best'"
            ),
            0,
            -1
        ),
        Question(
            "Industry revolution 3.0 occurred in 1969 . What was the theme behind it ?",
            listOf(
                "Mass production, electricity",
                "Computers, automation and robotics",
                "Mass customisation",
                "Internet data analytics connectivity"
            ),
            0,
            -1
        ),

        )
    val questions_goal9 = listOf<Question>(
        Question(
            "During the 'little railway mania' of 1833-87 in Britain, the total railway lines built was?",
            listOf("1800 Miles", "1400 Miles", "700 Miles", "2000 Miles"),
            1,
            -1
        ),
        Question(
            "Who topped Global Innovation Index 2020?",
            listOf("Switzerland", "Paris", "Tokyo", "China"),
            0,
            -1
        ),
        Question(
            "Which state top the India Innovation Index 2020?",
            listOf("Karnataka", "Kerala", "Gujarat", "Delhi"),
            0,
            -1
        ),

        )

    val questions_goal10 = listOf<Question>(
        Question(
            "Who is the leader of Abolitionist Movement in the 1830's?",
            listOf("William Lloyd Garrison", "William Smith", "Mahatma Gandhi", "Lucifier"),
            0,
            -1
        ),
        Question(
            "Which section of the IPC makes sexual activities against the order of nature punishable by law and carries a life sentence?",
            listOf("Section 378", "Section 377", "Section 349", "Section 369"),
            1,
            -1
        ),
        Question(
            "Which state became the first state in India to provide reservation to transgender in all government services?",
            listOf("Karnataka", "Kerala", "Gujarat", "Delhi"),
            0,
            -1
        ),
    )
    val questions_goal11 = listOf<Question>(
        Question(
            "In which Indian city, metro was first introduced?",
            listOf("Karnataka", "Kolkata", "Gujarat", "Delhi"),
            1,
            -1
        ),
        Question(
            "Which mission was started on the vision of Clean India and when by BJP government?",
            listOf(
                "Safai Bharat Mission, 2nd Oct 2019",
                "Swacch Bharat Mission, 2nd Oct 2019",
                "Swacch Bharat Mission, 3rd Oct 2019",
                "Swacch Bharat Mission, 2nd Oct 2020"
            ),
            1,
            -1
        ),
        Question(
            "Which two city of India bagged top place in Smart City Award, India in 2020?",
            listOf("Jamshedpur, Jaipur", "Ranchi, Delhi", "Indore, Ahmedabad", "Indore, Surat"),
            3,
            -1
        ),
    )

    val questions_goal12 = listOf<Question>(
        Question(
            "When did India agreed to Paris Climate Agreement?",
            listOf("14 August 2015", "12 December 2015", "11 January 2015", "12 October 2015"),
            1,
            -1
        ),
        Question(
            "When was Paris Agreement adopted?",
            listOf("2016", "2015", "2017", "2014"),
            1,
            -1
        ),
    )
    val questions_goal13 = listOf<Question>(
        Question(
            "Where is Scripps Institution of Oceanography located?",
            listOf("Hawaii", "California", "Brazil", "Dubai"),
            0,
            -1
        ),
        Question(
            "What is life ?",
            listOf("Joke", "Pain", "Opposite of good", "All of the above"),
            1,
            -1
        ),
        Question(
            "What is life ?",
            listOf("Joke", "Pain", "Opposite of good", "All of the above"),
            2,
            -1
        ),

        )

    val questions_goal14 = listOf<Question>(
        Question(
            "What is life SDG14 ?",
            listOf("Joke", "Pain", "Opposite of good", "All of the above"),
            0,
            -1
        ),
        Question(
            "What is life ?",
            listOf("Joke", "Pain", "Opposite of good", "All of the above"),
            2,
            -1
        ),
        Question(
            "What is life ?",
            listOf("Joke", "Pain", "Opposite of good", "All of the above"),
            3,
            -1
        ),
        Question(
            "What is life ?",
            listOf("Joke", "Pain", "Opposite of good", "All of the above"),
            0,
            -1
        ),
        Question(
            "What is life ?",
            listOf("Joke", "Pain", "Opposite of good", "All of the above"),
            0,
            -1
        ),
        Question(
            "What is life ?",
            listOf("Joke", "Pain", "Opposite of good", "All of the above"),
            0,
            -1
        ),

        )
    val questions_goal15 = listOf<Question>(
        Question(
            "What is life SDG15 ?",
            listOf("Joke", "Pain", "Opposite of good", "All of the above"),
            0,
            -1
        ),
        Question(
            "What is life ?",
            listOf("Joke", "Pain", "Opposite of good", "All of the above"),
            1,
            -1
        ),
        Question(
            "What is life ?",
            listOf("Joke", "Pain", "Opposite of good", "All of the above"),
            2,
            -1
        ),

        )

    val questions_goal16 = listOf<Question>(
        Question(
            "What is life SDG16 ?",
            listOf("Joke", "Pain", "Opposite of good", "All of the above"),
            0,
            -1
        ),
        Question(
            "What is life ?",
            listOf("Joke", "Pain", "Opposite of good", "All of the above"),
            1,
            -1
        ),
        Question(
            "What is life ?",
            listOf("Joke", "Pain", "Opposite of good", "All of the above"),
            2,
            -1
        ),
        Question(
            "What is life ?",
            listOf("Joke", "Pain", "Opposite of good", "All of the above"),
            3,
            -1
        ),
        Question(
            "What is life ?",
            listOf("Joke", "Pain", "Opposite of good", "All of the above"),
            0,
            -1
        ),

        )
    val questions_goal17 = listOf<Question>(
        Question(
            "What is life SDG17 ?",
            listOf("Joke", "Pain", "Opposite of good", "All of the above"),
            0,
            -1
        ),
        Question(
            "What is life ?",
            listOf("Joke", "Pain", "Opposite of good", "All of the above"),
            1,
            -1
        ),
        Question(
            "What is life ?",
            listOf("Joke", "Pain", "Opposite of good", "All of the above"),
            2,
            -1
        ),
        Question(
            "What is life ?",
            listOf("Joke", "Pain", "Opposite of good", "All of the above"),
            3,
            -1
        ),
        Question(
            "What is life ?",
            listOf("Joke", "Pain", "Opposite of good", "All of the above"),
            0,
            -1
        ),

        )


}
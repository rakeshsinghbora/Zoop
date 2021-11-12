package com.example.zoop

object setData {

    const val name:String="name"
    const val score:String="score"

    fun getQuestion():ArrayList<QuestionData>{
        var que:ArrayList<QuestionData> = arrayListOf()

        var question1 = QuestionData(
            1,
            "How many hearts does an octopus have  ?",

            "9",
            "5",
            "3",
            "2",
            3
        )
        var question2 = QuestionData(
            2,
            "An earthworm breathe with the help of ",

            "Lungs",
            "Ears",
            "Nose",
            "Skin",
            4
        )
        var question3 = QuestionData(
            3,
            "Which bird can fly backwards ?",

            "Peacock",
            "Hummingbird",
            "Cardinal Bird",
            "Crimson Sunbird",
            2
        )
        var question4 = QuestionData(
            4,
            " Which species of bird flies at the highest elevation ?",

            "Bar-headed Goose",
            "Swift",
            "Canvasback",
            "Teal",
            1
        )

        var question5 = QuestionData(
            5,
            "Which animal has largest brain in the World ?",

            "Dolphin",
            "Octopus",
            "Blue Whale",
            "Sperm Whale",
            4
        )

        var question6 = QuestionData(
            6,
            "How many muscles in each ear of a cat?",

            "6",
            "12",
            "32",
            "41",
            3
        )
        var question7 = QuestionData(
            7,
            " Which animal exclusively eat only eucalyptus leaves and nothing else?",

            "Koala",
            "Greater Glider",
            "Common Wombat",
            "Kangaroo",
            1
        )
        var question8 = QuestionData(
            8,
            "How far can an owl rotate its head ?",

            "90 Degree",
            "160 Degree",
            "235 Degree",
            "270 Degree",
            4
        )
        var question9 = QuestionData(
            9,
            "The age of a lion can be determined from its ?",

            "Color of nose",
            "Length of tail",
            "Length of nails",
            "Color of its hair",
            1
        )
        var question10 = QuestionData(
            10,
            "One horn rhino is found in?",

            "Sumatra",
            "Africa",
            "India",
            "Sri Lanka",
            3
        )
        que.add(question1)
        que.add(question2)
        que.add(question3)
        que.add(question4)
        que.add(question5)
        que.add(question6)
        que.add(question7)
        que.add(question8)
        que.add(question9)
        que.add(question10)
        return que
    }
}
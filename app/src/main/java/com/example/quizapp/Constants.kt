package com.example.quizapp

object Constants {
    val USER_NAME: String = "user_name"
    val TOTAL_QUESTIONS: String = "total_questions"
    val SCORE: String = "score"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val questionOne = Question(
            1,
            "Que animal representa essa imagem?",
            R.drawable.lion_ai,
            arrayListOf("Giraffa", "Baleia", "Leão", "Cachorro"),
            2,
        )
        questionsList.add(questionOne)

        // 2
        val questionTwo = Question(
            2,
            "De que desenho é essa imagem?",
            R.drawable.phineas_ferb,
            arrayListOf("Phineas e Ferb", "Batman", "Barbie", "Ben 10"),
            0
        )
        questionsList.add(questionTwo)

        // 3
        val questionThree = Question(
            3,
            "Que país essa bandeira representa",
            R.drawable.brasil,
            arrayListOf("Bélgica", "Chile", "Colombia", "Brasil"),
            3
        )
        questionsList.add(questionThree)

        // 4
        val questionFour = Question(
            4,
            "Quem essa estátua representa?",
            R.drawable.iracema,
            arrayListOf("Padre Cícero", "Iracema Guardiã",
            "São Francisco", "Belchior"),
            1
        )
        questionsList.add(questionFour)

        // 5
        val questionFive = Question(
            5,
            "Que país essa bandeira representa?",
            R.drawable.fiji,
            arrayListOf("Gabão", "França",
            "Fiji", "Finlândia"),
            2
        )
        questionsList.add(questionFive)

        // 6
        val questionSix = Question(
            6,
            "Qual o nome desse super Herói?",
            R.drawable.invencible,
            arrayListOf("Super-homem", "Lanterna Verde",
            "Nenhum desses", "Invencível"),
            3
        )

        questionsList.add(questionSix)

        // 7
        val questionSeven = Question(
            7,
            "Qual é o nome desse anti-herói?",
            R.drawable.rorscharch,
            arrayListOf("Justiceiro", "Deadpool",
            "Rorschach", "Spawn"),
            2
        )
        questionsList.add(questionSeven)

        // 8
        val questionEight = Question(
            8,
            "Quantos anos tem o Cristo Redentor?",
            R.drawable.cristoredentor,
            arrayListOf("74 anos", "80 anos",
            "55 anos", "92 anos"),
            3
        )
        questionsList.add(questionEight)

        // 9
        val questionNine = Question(
            9,
            "Que país essa bandeira representa?",
            R.drawable.germany,
            arrayListOf("Nenhuma dessas opções", "Nova Zelândia",
            "Polônia", "Australia"),
            0
        )
        questionsList.add(questionNine)

        // 10
        val questionTen = Question(
            10,
            "Qual é o nome desse Jogador de Basquete?",
            R.drawable.jordan,
            arrayListOf("Michael Jordan", "Kyrie Irving",
            "LeBron James", "Stephen Curry"),
            0
        )
        questionsList.add(questionTen)

        return questionsList
    }
}
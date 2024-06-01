package com.example.quizapp.adm.dao

import com.example.quizapp.adm.models.Pergunta

class PerguntaDao {

    fun adiciona(pergunta: Pergunta){
        perguntas.add(pergunta)

    }

    companion object {
        fun adiciona(pergunta: Pergunta) {
            perguntas.add(pergunta)

        }

        private val perguntas = mutableListOf<Pergunta>()
    }
}
package com.example.quizapp.adm.dao

import com.example.quizapp.adm.models.Obra

class ObrasDao {

    fun adiciona(obra: Obra) {
        obras.add(obra)

    }

    fun buscaTodos(): List<Obra> {
        return obras.toList()

    }

    companion object {
        private val obras = mutableListOf<Obra>()
    }
}
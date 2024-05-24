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
        private val obras = mutableListOf<Obra>(
            Obra(
                nome = "MonaLisa",
                autor = "Leornado Da Vinci",
                data = "Entre 1503 e 1506",
                periodo = "Renascimento"
            )
        )
    }
}
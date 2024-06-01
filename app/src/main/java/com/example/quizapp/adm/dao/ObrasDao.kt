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
                periodo = "Lorem ipsum dolor sit amet, consectetur adipiscing eliliquet nces dui",
                imagem = "https://upload.wikimedia.org/wikipedia/commons/e/ec/Mona_Lisa%2C_by_Leonardo_da_Vinci%2C_from_C2RMF_retouched.jpg"
            ),
            Obra(
                nome = "O Pensador",
                autor ="Auguste Rodin",
                data = "1880",
                periodo = "Lorem ipsum",
                imagem = "https://images.pexels.com/photos/46174/strawberries-berries-fruit-freshness-46174.jpeg"
            ),
        )
    }
}
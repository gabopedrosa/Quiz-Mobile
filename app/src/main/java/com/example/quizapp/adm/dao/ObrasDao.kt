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
                periodo = "Renascimento",
                imagem = "https://upload.wikimedia.org/wikipedia/commons/e/ec/Mona_Lisa%2C_by_Leonardo_da_Vinci%2C_from_C2RMF_retouched.jpg"
            ),
            Obra(
                nome = "O Pensador",
                autor ="Auguste Rodin",
                data = "1880",
                periodo = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt " +
                        "ut labore et dolore magna aliqua. Donec ultrices tincidunt arcu non sodales neque. Pulvinar " +
                        "elementum integer enim neque volutpat ac. Vitae tempus quam pellentesque nec nam. Habitant " +
                        "morbi tristique senectus et netus et malesuada. Semper quis lectus nulla at. Sed enim ut sem " +
                        "viverra. Sed lectus vestibulum mattis ullamcorper velit sed ullamcorper morbi tincidunt. Faucibus " +
                        "vitae aliquet nec ullamcorper sit amet risus nullam. Rhoncus urna neque viverra justo nec ultrices " +
                        "dui. Amet massa vitae tortor condimentum lacinia quis vel eros donec. Diam quis enim lobortis " +
                        "scelerisque fermentum dui faucibus in ornare. Eget velit aliquet sagittis id consectetur. Neque " +
                        "vitae tempus quam pellentesque nec nam aliquam. Scelerisque fermentum dui faucibus in ornare quam " +
                        "viverra. Pellentesque dignissim enim sit amet venenatis urna cursus eget nunc. Mattis nunc sed " +
                        "blandit libero volutpat sed cras ornare arcu. Est ante in nibh mauris. Morbi enim nunc faucibus a. " +
                        "Ut faucibus pulvinar elementum integer enim.",
                imagem = "https://images.pexels.com/photos/46174/strawberries-berries-fruit-freshness-46174.jpeg"
            ),
        )
    }
}
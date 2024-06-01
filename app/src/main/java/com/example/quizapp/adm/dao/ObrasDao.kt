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
                periodo = "Mona Lisa (\"Senhora Lisa\"[2]) também conhecida como A Gioconda[3] (em italiano: La Gioconda, \"a sorridente\";[4] em francês, La Joconde) ou ainda Mona Lisa del Giocondo (\"Senhora Lisa esposa de Giocondo\") é a mais notável e conhecida obra de Leonardo da Vinci, um dos mais eminentes homens do Renascimento italiano.\n" +
                        "\n" +
                        "Sua pintura foi iniciada em 1503 (terminando-a três ou quatro anos mais tarde) e é nesta obra que o artista melhor concebeu a técnica do sfumato. O quadro representa uma mulher com uma expressão introspectiva e um pouco tímida. O seu sorriso restrito é muito sedutor, mesmo que um pouco conservador. O seu corpo representa o padrão de beleza da mulher na época de Leonardo. Este quadro é provavelmente o retrato mais famoso na história da arte, senão o quadro mais famoso e valioso de todo o mundo. Poucos outros trabalhos de arte são tão controversos, questionados, valiosos, elogiados, comemorados ou reproduzidos.\n" +
                        "\n" +
                        "Muitos historiadores da arte acreditam que a reverência de Leonardo da Vinci pela Mona Lisa nada tinha a ver com sua maestria artística; segundo muitos, devia-se a algo muito mais profundo: uma mensagem oculta nas camadas da pintura. A linha do horizonte à esquerda encontra-se num nível visivelmente mais baixo que a da direita, fazendo com que a Mona Lisa pareça muito maior vista da esquerda que da direita. Historicamente, os conceitos de masculino e feminino estão ligados aos lados — o esquerdo é feminino, o direito é o masculino.[5]\n" +
                        "\n" +
                        "A pintura a óleo sobre madeira de álamo encontra-se exposta no Museu do Louvre, em Paris, e é uma das suas maiores atrações.[1]",
                imagem = "https://upload.wikimedia.org/wikipedia/commons/e/ec/Mona_Lisa%2C_by_Leonardo_da_Vinci%2C_from_C2RMF_retouched.jpg"
            ),
            Obra(
                nome = "O Pensador",
                autor ="Auguste Rodin",
                data = "1880",
                periodo = "O Pensador (francês: Le Penseur) é uma das mais famosas esculturas de bronze do escultor francês Auguste Rodin. Retrata um homem em meditação soberba, lutando com uma poderosa força interna.\n" +
                        "\n" +
                        "Originalmente chamado de O Poeta, a peça era parte de uma comissão do Museu de Arte Decorativa em Paris para criar um portal monumental baseada na Divina Comédia, de Dante Alighieri. Cada uma das estátuas na peça representavam um dos personagens principais do poema épico. O Pensador originalmente procurava retratar Dante em frente dos Portões do Inferno, ponderando seu grande poema. A escultura está nua porque Rodin queria uma figura heroica à la Michelangelo para representar o pensamento assim como a poesia.",
                imagem = "https://upload.wikimedia.org/wikipedia/commons/7/78/Paris_2010_-_Le_Penseur.jpg"
            ),
        )
    }
}
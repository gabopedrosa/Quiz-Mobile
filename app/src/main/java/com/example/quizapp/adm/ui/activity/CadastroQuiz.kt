package com.example.quizapp.adm.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.quizapp.adm.models.Pergunta
import com.example.quizapp.databinding.ActivityCadastroQuizBinding
import com.example.quizapp.quiz.Constants

class CadastroQuiz : AppCompatActivity() {

    private val binding by lazy {
        ActivityCadastroQuizBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        configuraBotaoNovaPergunta()
        configuraBotaoFinalizar()
    }

    private fun configuraBotaoFinalizar() {
        val botaoFinalizar = binding.buttonFinalizar

        botaoFinalizar.setOnClickListener{
            startActivity(Intent(this, TelaLogin::class.java))
        }
    }

    private fun configuraBotaoNovaPergunta() {
        val botaoNovaPergunta = binding.buttonNovaPergunta
        botaoNovaPergunta.setOnClickListener{

            val campoPergunta = binding.editPergunta.text.toString()
            val campoItemA = binding.editItemA.text.toString()
            val campoItemB = binding.editItemB.text.toString()
            val campoItemC = binding.editItemC.text.toString()
            val campoItemD = binding.editItemD.text.toString()
            val campoItemCorreto = binding.editItemCorreto.text.toString().toInt()

            val novaPergunta = Pergunta(
                pergunta = campoPergunta,
                itemA = campoItemA,
                itemB = campoItemB,
                itemC = campoItemC,
                itemD = campoItemD,
                itemCorreto = campoItemCorreto
            )
//            Log.d("Nova Pergunta", "Pergunta: $campoPergunta, Item A: $campoItemA, Item B: $campoItemB, Item C: $campoItemC, Item D: $campoItemD")


           Constants.addQuestion(novaPergunta)

            limparCampos()
        }
    }

    private fun limparCampos() {
        binding.editPergunta.text.clear()
        binding.editItemA.text.clear()
        binding.editItemB.text.clear()
        binding.editItemC.text.clear()
        binding.editItemD.text.clear()
        binding.editItemCorreto.text.clear()

    }

}
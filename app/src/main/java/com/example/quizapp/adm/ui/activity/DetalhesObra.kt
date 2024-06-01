package com.example.quizapp.adm.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.quizapp.adm.extensions.tentaCarregarImagem
import com.example.quizapp.adm.models.Obra
import com.example.quizapp.databinding.ActivityDetalhesObraBinding

@Suppress("DEPRECATION")
class DetalhesObra : AppCompatActivity() {

    private val binding by lazy {
        ActivityDetalhesObraBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        tentaCarregarObra()
    }

    private fun tentaCarregarObra() {
        intent.getParcelableExtra<Obra>(CHAVE_OBRA)?.let { obraCarregada ->
            preencheCampos(obraCarregada)
        } ?: finish()
    }

//private fun tentaCarregarObra() {
//    val obraCarregada = if (SDK_INT >= TIRAMISU) {
//        intent.getParcelableExtra(CHAVE_OBRA, Obra::class.java)
//    } else {
//        @Suppress("DEPRECATION")
//        intent.getParcelableExtra<Obra>(CHAVE_OBRA)
//    }
//
//    obraCarregada?.let {
//        preencheCampos(it)
//    } ?: finish()
//}

    private fun preencheCampos(obraCarregada: Obra) {
        with(binding) {
            activityDetalhesObraImagem.tentaCarregarImagem(obraCarregada.imagem)
            activityDetalhesObraNome.text = obraCarregada.nome
            activityDetalhesObraDescricao.text = obraCarregada.periodo
        }

    }
}
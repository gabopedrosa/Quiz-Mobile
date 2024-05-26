package com.example.quizapp.adm.ui.dialog

import android.content.Context
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import com.example.quizapp.adm.extensions.tentaCarregarImagem
import com.example.quizapp.databinding.FormularioImageBinding

class FormularioImagemDialog(private val context: Context) {

    fun mostra(quandoImagemCarregar: (imagem: String) -> Unit) {
        val binding = FormularioImageBinding.inflate(LayoutInflater.from(context))

        binding.formularioBotaoCarregar.setOnClickListener {
            val url = binding.formularioImgUrl.text.toString()
            binding.formularioImageView.tentaCarregarImagem(url)

        }

        //caixa de diaologo
        AlertDialog.Builder(context)
            .setView(binding.root)
            .setPositiveButton("Confirmar") { _, _ ->
                val url = binding.formularioImgUrl.text.toString()
                quandoImagemCarregar(url)
                quandoImagemCarregar(url)

            }
            .setNegativeButton("Cancelar") { _, _ ->

            }
            .show()
    }
}
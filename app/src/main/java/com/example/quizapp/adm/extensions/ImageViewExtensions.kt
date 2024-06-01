package com.example.quizapp.adm.extensions

import android.widget.ImageView
import coil.load
import com.example.quizapp.R

fun ImageView.tentaCarregarImagem(
    url: String? = null,
    fallback: Int = R.drawable.imagem_padrao
){
    load(url) {
        fallback(fallback)
        error(com.example.quizapp.R.drawable.erro)
        placeholder(com.example.quizapp.R.drawable.placeholder)
    }
}

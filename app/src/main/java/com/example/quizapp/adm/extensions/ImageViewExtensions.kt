package com.example.quizapp.adm.extensions

import android.widget.ImageView
import coil.load

fun ImageView.tentaCarregarImagem(url: String? = null){
    load(url) {
        fallback(com.example.quizapp.R.drawable.erro)
        error(com.example.quizapp.R.drawable.erro)
        placeholder(com.example.quizapp.R.drawable.placeholder)
    }
}

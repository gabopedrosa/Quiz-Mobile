package com.example.quizapp.adm.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Obra(
    val nome: String,
    val autor: String,
    val data: String,
    val periodo: String,
    val imagem: String? = null
) : Parcelable
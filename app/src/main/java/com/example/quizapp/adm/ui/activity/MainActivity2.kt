package com.example.quizapp.adm.ui.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.quizapp.R
import com.example.quizapp.databinding.ActivityMain2Binding
import com.example.quizapp.quiz.MainActivity

class MainActivity2 : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnUsuario.setOnClickListener(this)
        binding.btnAdm.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v.id == R.id.btn_usuario) {
            startActivity(Intent(this, MainActivity::class.java))

        } else if (v.id == R.id.btn_adm) {
            startActivity(Intent(this, OpcoesAdministrador::class.java))
        }
    }
}
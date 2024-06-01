package com.example.quizapp.adm.ui.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.quizapp.R
import com.example.quizapp.databinding.ActivityTelaLoginBinding
import com.example.quizapp.quiz.MainActivity

class TelaLogin : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityTelaLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTelaLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonLogin.setOnClickListener(this)
        binding.buttonCadastrar.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        val campoEmail = binding.editEmail
        val email = campoEmail.text.toString()
        val campoSenha = binding.editSenha
        val senha = campoSenha.text.toString()

        if (v.id == R.id.button_login) {
            if (email == "admin" && senha == "admin"){
                startActivity(Intent(this, OpcoesAdministrador::class.java))
            } else if (email == "user" && senha == "user")
                startActivity(Intent(this, MainActivity::class.java))

        }

        if(v.id == R.id.button_cadastrar){
            startActivity(Intent(this, CadastroAdministrador::class.java))
        }

    }
}
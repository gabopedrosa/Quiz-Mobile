package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.quizapp.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnUsuario.setOnClickListener(this)
        binding.btnAdministrador.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if(v.id == R.id.btn_usuario){
            startActivity(Intent(this, MainActivity::class.java))
        }

        if(v.id == R.id.btn_administrador){
            Toast.makeText(this, "adm", Toast.LENGTH_SHORT).show()
        }
    }
}
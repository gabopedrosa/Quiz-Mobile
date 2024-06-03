package com.example.quizapp

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.quizapp.databinding.ActivityCadastroAdminBinding

class CadastroAdmin : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityCadastroAdminBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCadastroAdminBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnCadastrar.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        Toast.makeText(this, "cadastrado adm", Toast.LENGTH_SHORT).show()
        //teste
    }
}


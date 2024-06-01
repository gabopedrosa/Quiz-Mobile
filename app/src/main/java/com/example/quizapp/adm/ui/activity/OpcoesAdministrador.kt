package com.example.quizapp.adm.ui.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.quizapp.R
import com.example.quizapp.databinding.ActivityOpcoesAdministradorBinding

class OpcoesAdministrador : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityOpcoesAdministradorBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityOpcoesAdministradorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.activityOpcoesAdmObras.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v.id == R.id.activity_opcoes_adm_obras){
            startActivity(Intent(this, ListaObrasActivity::class.java))
        }

    }
}
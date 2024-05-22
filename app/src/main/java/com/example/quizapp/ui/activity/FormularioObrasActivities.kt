package com.example.quizapp.ui.activity

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.quizapp.R
import com.example.quizapp.dao.ObrasDao
import com.example.quizapp.databinding.ActivityCadastroDeObrasBinding
import com.example.quizapp.models.Obra

class FormularioObrasActivities : AppCompatActivity(R.layout.activity_cadastro_de_obras){

    private lateinit var binding: ActivityCadastroDeObrasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        configuraBotaoSalvar()
    }

    private fun configuraBotaoSalvar() {
        val botaoSalvar = findViewById<Button>(R.id.btn_cadastrar_obra)
        val dao = ObrasDao()
        botaoSalvar.setOnClickListener{
            val novaObra = criaObra()
            dao.adiciona(novaObra)
            finish()
        }
    }

    private fun criaObra(): Obra {
        val campoNome = findViewById<EditText>(R.id.activity_formulario_obra_nome)
        val nome = campoNome.text.toString()
        val campoAutor = findViewById<EditText>(R.id.activity_formulario_obra_autor)
        val autor = campoAutor.text.toString()
        val campoDataCriacao = findViewById<EditText>(R.id.activity_formulario_obra_data)
        val data = campoDataCriacao.text.toString()
        val campoPeriodoArtistico = findViewById<EditText>(R.id.activity_formulario_obra_periodo)
        val periodo = campoPeriodoArtistico.text.toString()

        return Obra (
            nome = nome,
            autor = autor,
            data = data,
            periodo = periodo

        )


    }


}
package com.example.quizapp.adm.ui.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import coil.load
import com.example.quizapp.R
import com.example.quizapp.adm.dao.ObrasDao
import com.example.quizapp.adm.models.Obra
import com.example.quizapp.databinding.ActivityCadastroDeObrasBinding
import com.example.quizapp.databinding.FormularioImageBinding

class FormularioObrasActivities :
    AppCompatActivity() {

    private val binding by lazy {
        ActivityCadastroDeObrasBinding.inflate(layoutInflater)
    }

    private var url: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        configuraBotaoSalvar()
        binding.activityFormularioImagem.setOnClickListener {
            val bindingFormularioImage = FormularioImageBinding.inflate(layoutInflater)

            bindingFormularioImage.formularioBotaoCarregar.setOnClickListener{
                val url = bindingFormularioImage.formularioImgUrl.text.toString()
                bindingFormularioImage.formularioImageView.load(url)

            }

            //caixa de diaologo
            AlertDialog.Builder(this)
                .setView(bindingFormularioImage.root)
                .setPositiveButton("Confirmar") { _, _ ->
                    url = bindingFormularioImage.formularioImgUrl.text.toString()
                    binding.activityFormularioImagem.load(url)

                }
                .setNegativeButton("Cancelar") { _, _ ->

                }
                .show()

        }


    }

    private fun configuraBotaoSalvar() {
        val botaoSalvar = findViewById<Button>(R.id.activity_formulario_obra_btn)
        val dao = ObrasDao()
        botaoSalvar.setOnClickListener {
            val novaObra = criaObra()
            dao.adiciona(novaObra)
            val intent = Intent(this, ListaObrasActivity::class.java)
            startActivity(intent)
//            finish()
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

        return Obra(
            nome = nome,
            autor = autor,
            data = data,
            periodo = periodo,
            imagem = url

        )
    }
}
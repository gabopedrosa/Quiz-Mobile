package com.example.quizapp.adm.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.quizapp.R
import com.example.quizapp.adm.dao.ObrasDao
import com.example.quizapp.adm.ui.recyclerview.adapter.ListaObrasAdapter
import com.example.quizapp.databinding.ActivityListaObrasBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListaObrasActivity : AppCompatActivity(R.layout.activity_lista_obras) {

    private val dao = ObrasDao()
    private val adapter = ListaObrasAdapter(context = this, obras = dao.buscaTodos())
    private val binding by lazy {
        ActivityListaObrasBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        configuraRecyclerView()
        configuraFab()
    }

    override fun onResume() {
        super.onResume()
        adapter.atualiza(dao.buscaTodos())
    }

    private fun configuraFab() {
        val fab = findViewById<FloatingActionButton>(R.id.activity_list_obras_fab)
        fab.setOnClickListener {
            vaiParaFormularioObra()
        }

    }

    private fun vaiParaFormularioObra() {
        val intent = Intent(this, FormularioObrasActivities::class.java)
        startActivity(intent)
    }

    private fun configuraRecyclerView() {
        val recyclerView = findViewById<RecyclerView>(R.id.activity_lista_obras_recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        adapter.quandoClicaNoItem = {
            val intent = Intent (this, DetalhesObra::class.java).apply {
                putExtra(CHAVE_OBRA, it)
            }
            startActivity(intent)
        }
    }
}
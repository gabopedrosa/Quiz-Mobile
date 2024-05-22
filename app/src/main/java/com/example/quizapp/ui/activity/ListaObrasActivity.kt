package com.example.quizapp.ui.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.quizapp.R
import com.example.quizapp.dao.ObrasDao
import com.example.quizapp.ui.recyclerview.adapter.ListaObrasAdapter

class ListaObrasActivity : AppCompatActivity(R.layout.activity_lista_obras) {

    private val dao = ObrasDao()
    private val adapter = ListaObrasAdapter(context = this, obras = dao.buscaTodos())
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
        val fab = findViewById<Button>(R.id.btn_cadastrar_obra)
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

    }
}
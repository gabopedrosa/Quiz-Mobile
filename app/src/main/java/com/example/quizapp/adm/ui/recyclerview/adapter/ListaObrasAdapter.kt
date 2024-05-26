package com.example.quizapp.adm.ui.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.quizapp.R
import com.example.quizapp.adm.models.Obra
import com.example.quizapp.databinding.ObraItemBinding

class ListaObrasAdapter(
    private val context: Context,
    obras: List<Obra>) : RecyclerView.Adapter<ListaObrasAdapter.ViewHolder>() {

    private val obras = obras.toMutableList()

    class ViewHolder(private val binding: ObraItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun vincula(obra: Obra) {
            val nome = itemView.findViewById<TextView>(R.id.obra_item_nome)
            nome.text = obra.nome
            val autor = itemView.findViewById<TextView>(R.id.obra_item_autor)
            autor.text = obra.autor
            val data = itemView.findViewById<TextView>(R.id.obra_item_data)
            data.text = obra.data
            val periodo = itemView.findViewById<TextView>(R.id.obra_item_periodo)
            periodo.text = obra.periodo
            binding.imageView.load(obra.imagem)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val binding = ObraItemBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return obras.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val obra = obras[position]
        holder.vincula(obra)
    }

    fun atualiza(obras: List<Obra>) {
        this.obras.clear()
        this.obras.addAll(obras)
        notifyDataSetChanged()
    }


}
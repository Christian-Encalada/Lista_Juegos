package com.example.recyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.Informacion
import com.example.recyclerview.R

class InformacionAdapter(private val info:List<Informacion>) : RecyclerView.Adapter<InformacionViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InformacionViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return InformacionViewHolder(layoutInflater.inflate(R.layout.item_info,parent,false))
    }

    override fun onBindViewHolder(holder: InformacionViewHolder, position: Int) {
        val item = info[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = info.size
}
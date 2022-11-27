package com.example.recyclerview.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.recyclerview.Informacion
import com.example.recyclerview.R

class InformacionViewHolder(view: View): ViewHolder(view) {

    val nombreper =  view.findViewById<TextView>(R.id.tvNombre)
    val añobreper =  view.findViewById<TextView>(R.id.tvaño)
    val categoriaper =  view.findViewById<TextView>(R.id.tvcategoria)
    val imagen = view.findViewById<ImageView>(R.id.ivImagen)
    val clasificacionper = view.findViewById<TextView>(R.id.tvclasificacion)

    fun render(infoModel: Informacion){
        nombreper.text = infoModel.nombre
        añobreper.text = infoModel.año.toString()
        categoriaper.text = infoModel.categoria
        clasificacionper.text = infoModel.clasificacion

        Glide.with(imagen.context).load(infoModel.imagen).into(imagen)


    }
}
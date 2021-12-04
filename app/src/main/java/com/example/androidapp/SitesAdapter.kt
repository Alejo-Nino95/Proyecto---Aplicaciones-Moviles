package com.example.androidapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class SitesAdapter : RecyclerView.Adapter<SitesAdapter.ViewHolder>() {

    private var cityText = arrayOf(
        "Ciudad 1: Bogota",
        "Ciudad 2: Medellin",
        "Ciudad 3: Cali",
        "Ciudad 4: Manizales",
        "Ciudad 5: Cartagena")

    private var imageFiles = intArrayOf(
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground)

    private var shortInfoText = arrayOf(
        "Info 1: Capital de Colombia",
        "Info 2: Ciudad de la eterna primavera",
        "Info 3: Sucursal del cielo",
        "Info 4: Region cafetera",
        "Info 5: Ciudad amurallada")

    private var punctuationText = arrayOf(
        "Puntuación 1: 5.0",
        "Puntuación 2: 4.5",
        "Puntuación 3: 4.5",
        "Puntuación 4: 4.8",
        "Puntuación 5: 5.0")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SitesAdapter.ViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.activity_item_ok, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.cityName.text = cityText[position]
        viewHolder.image.setImageResource(imageFiles[position])
        viewHolder.shortInfo.text = shortInfoText[position]
        viewHolder.punctuation.text = punctuationText[position]
    }

    override fun getItemCount(): Int = cityText.size

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val cityName = itemView.findViewById<TextView>(R.id.titleList)
        val image = itemView.findViewById<ImageView>(R.id.imageList)
        val shortInfo = itemView.findViewById<TextView>(R.id.textList)
        val punctuation = itemView.findViewById<TextView>(R.id.textPunct)

    }

}
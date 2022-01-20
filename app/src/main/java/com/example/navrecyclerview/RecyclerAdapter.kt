package com.example.navrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private val titulos = arrayOf("Capitulo1", "Capitulo2", "Capitulo3","Capitulo4","Capitlo5",
        "Capitulo6","Capitulo7","Capitulo8")

    private val detalles = arrayOf("Detalle del capitulo 1", "Detalle del capitulo 2", "Detalle del capitulo 3","Detalle del capitulo 4","Detalle del capitulo 5",
        "Detalle del capitulo 6","Detalle del capitulo 7","Detalle del capitulo 8")

    private val images = intArrayOf(R.drawable.android_image_1,
        R.drawable.android_image_2,
        R.drawable.android_image_3,R.drawable.android_image_4,R.drawable.android_image_5,
        R.drawable.android_image_6,R.drawable.android_image_7,R.drawable.android_image_8)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)

            return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.itemTitle.text = titulos[position]
        holder.itemDetail.text = detalles[position]
        holder.itemImage.setImageResource(images[position])
    }

    override fun getItemCount(): Int {
        return titulos.size
    }
    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView

        init{
            itemImage = itemView.findViewById(R.id.itemimage)
            itemTitle = itemView.findViewById(R.id.itemtitle)
            itemDetail = itemView.findViewById(R.id.itemdetail)

            itemView.setOnClickListener{
                //Todo:
            }

        }
    }
}
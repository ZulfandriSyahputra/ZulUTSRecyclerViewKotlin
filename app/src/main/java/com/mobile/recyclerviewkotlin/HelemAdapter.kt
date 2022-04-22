package com.mobile.recyclerviewkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HelemAdapter(private val context: Context, private val helem: List<Helem>, val listener: (Helem) -> Unit)
    : RecyclerView.Adapter<HelemAdapter.HelemViewHolder>(){

    class HelemViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgHelem = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameHelem= view.findViewById<TextView>(R.id.tv_item_name)
        val descHelem = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(helem: Helem, listener: (Helem) -> Unit){
            imgHelem.setImageResource(helem.imgHelem)
            nameHelem.text = helem.nameHelem
            descHelem.text = helem.descHelem
            itemView.setOnClickListener{
                (listener(helem))
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HelemViewHolder {
        return HelemViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_helem, parent, false)
        )
    }

    override fun onBindViewHolder(holder: HelemViewHolder, position: Int) {
     holder.bindView(helem[position], listener)
    }

    override fun getItemCount(): Int = helem.size
    }



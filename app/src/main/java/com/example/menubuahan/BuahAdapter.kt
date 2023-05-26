package com.example.menubuahan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BuahAdapter(private val buahList: ArrayList<com.example.menubuahan.Buah>): RecyclerView.Adapter<BuahAdapter.BuahViewHolder>() {
    class BuahViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val imageView : ImageView = itemView.findViewById(R.id.iv_img)
        val titleBuah : TextView = itemView.findViewById(R.id.tv_title)
        val descBuah : TextView = itemView.findViewById(R.id.tv_desc)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BuahViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_buah, parent, false)
        return BuahViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: BuahViewHolder, position: Int) {
        val currentItem = buahList[position]
        holder.imageView.setImageResource(currentItem.imageBuah)
        holder.titleBuah.text = (currentItem.titleBuah)
        holder.descBuah.text =  (currentItem.descBuah)
    }

    override fun getItemCount(): Int {
        return buahList.size
    }


}
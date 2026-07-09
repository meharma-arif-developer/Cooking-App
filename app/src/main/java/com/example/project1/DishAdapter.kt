package com.example.project1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Adapter class
class DishAdapter(
    private val dishList: List<Dish>,
    private val onItemClick: (Dish) -> Unit
) : RecyclerView.Adapter<DishAdapter.DishViewHolder>() {

    // View Holder class jo XML ke elements ko hold karti hai
    class DishViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imgDish: ImageView = view.findViewById(R.id.imgDish)
        val tvDishName: TextView = view.findViewById(R.id.tvDishName)
    }

    // Yahan hum item_dish.xml ko inflate (load) karte hain
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DishViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_dish, parent, false)
        return DishViewHolder(view)
    }

    // Yahan hum data ko views (ImageView, TextView) mein bind karte hain
    override fun onBindViewHolder(holder: DishViewHolder, position: Int) {
        val dish = dishList[position]
        holder.tvDishName.text = dish.name
        holder.imgDish.setImageResource(dish.imageRes)

        // Click listener
        holder.itemView.setOnClickListener {
            onItemClick(dish)
        }
    }

    // List ka size return karta hai
    override fun getItemCount(): Int = dishList.size
}
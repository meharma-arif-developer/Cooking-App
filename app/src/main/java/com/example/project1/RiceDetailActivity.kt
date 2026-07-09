package com.example.project1

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RiceDetailActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_rice_detail)

            val recyclerView = findViewById<RecyclerView>(R.id.rvRiceDishes)

            // 8 Rice dishes ki list
            val riceList = listOf(
                Dish("Biryani", R.drawable.biryani),
                Dish("Pulao", R.drawable.pulao),
                Dish("Fried Rice", R.drawable.friedrice),
                Dish("Zarda", R.drawable.zarda),
                Dish("Chicken Rice", R.drawable.chickenrice),
                Dish("Steam Rice", R.drawable.steamrice),
                Dish("Veg Rice", R.drawable.vegrice),
                Dish("Masala Rice", R.drawable.masalarice)
            )

            // Adapter set karna
            val adapter = DishAdapter(riceList) { selectedDish ->
                // Click hone par ye Intent chalega aur RecipeDetailActivity khulegi
                val intent = Intent(this, RecipeDetailActivity::class.java)
                intent.putExtra("DISH_NAME", selectedDish.name) // Naam bhej rahe hain
                startActivity(intent)
            }

            recyclerView.adapter = adapter
            recyclerView.layoutManager = GridLayoutManager(this, 2) // Grid layout
        }
}
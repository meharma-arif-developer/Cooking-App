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

class DessertsDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desserts_detail)

        val recyclerView = findViewById<RecyclerView>(R.id.rvdessertsDishes)

        // 8 Rice dishes ki list
        val dessertsList = listOf(
            Dish("Kheer", R.drawable.kheer),
            Dish("Suji ka Halwa", R.drawable.sujikahalwa),
            Dish("Chocolate Cake", R.drawable.chocolatecake),
            Dish("Ras Malai", R.drawable.rasmalai),
            Dish("Cupcakes", R.drawable.cupcakes),
            Dish("Custard", R.drawable.custard),
            Dish("Cookies", R.drawable.cookies),
            Dish("Rabri", R.drawable.rabri)
        )

        // Adapter set karna
        val adapter = DishAdapter(dessertsList) { selectedDish ->
            // Click hone par ye Intent chalega aur RecipeDetailActivity khulegi
            val intent = Intent(this, RecipeDetailActivity::class.java)
            intent.putExtra("DISH_NAME", selectedDish.name) // Naam bhej rahe hain
            startActivity(intent)
        }

        recyclerView.adapter = adapter
        recyclerView.layoutManager = GridLayoutManager(this, 2) // Grid layout
    }
}
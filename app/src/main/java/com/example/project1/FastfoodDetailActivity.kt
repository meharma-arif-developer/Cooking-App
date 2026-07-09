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

class FastfoodDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fastfood_detail)

        val recyclerView = findViewById<RecyclerView>(R.id.rvfastDishes)

        // 8 Rice dishes ki list
        val fastList = listOf(
            Dish("Burger", R.drawable.burger),
            Dish("Shawarma", R.drawable.shawarma),
            Dish("Sandwich", R.drawable.sandwich),
            Dish("Chicken Nuggets", R.drawable.chickennuggets),
            Dish("Chicken Wings", R.drawable.chickenwings),
            Dish("Pizza", R.drawable.pizza),
            Dish("Pasta", R.drawable.pasta),
            Dish("Mozzarella Sticks", R.drawable.mozzarellasticks)
        )

        // Adapter set karna
        val adapter = DishAdapter(fastList) { selectedDish ->
            // Click hone par ye Intent chalega aur RecipeDetailActivity khulegi
            val intent = Intent(this, RecipeDetailActivity::class.java)
            intent.putExtra("DISH_NAME", selectedDish.name) // Naam bhej rahe hain
            startActivity(intent)
        }

        recyclerView.adapter = adapter
        recyclerView.layoutManager = GridLayoutManager(this, 2) // Grid layout
    }
}
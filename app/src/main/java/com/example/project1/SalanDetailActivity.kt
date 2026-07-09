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

class SalanDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_salan_detail)

        val recyclerView = findViewById<RecyclerView>(R.id.rvsalanDishes)

        // 8 Rice dishes ki list
        val salanList = listOf(
            Dish("Chicken Karahi", R.drawable.chickenkarahi),
            Dish("Daal Mash", R.drawable.daalmash),
            Dish("Beef Qorma", R.drawable.beefqorma),
            Dish("Nihari", R.drawable.nihari),
            Dish("Mutton Karahi", R.drawable.muttonkarahi),
            Dish("Fried Fish with Gravy", R.drawable.friedfishwithgravy),
            Dish("Aloo Gosht", R.drawable.aloogosht),
            Dish("Mix Vegetable Curry", R.drawable.mixvegetablecurry)
        )

        // Adapter set karna
        val adapter = DishAdapter(salanList) { selectedDish ->
            // Click hone par ye Intent chalega aur RecipeDetailActivity khulegi
            val intent = Intent(this, RecipeDetailActivity::class.java)
            intent.putExtra("DISH_NAME", selectedDish.name) // Naam bhej rahe hain
            startActivity(intent)
        }

        recyclerView.adapter = adapter
        recyclerView.layoutManager = GridLayoutManager(this, 2) // Grid layout
    }
}
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

class DrinkDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drink_detail)

        val recyclerView = findViewById<RecyclerView>(R.id.rvdrinkDishes)

        // 8 Rice dishes ki list
        val drinkList = listOf(
            Dish("Coffee", R.drawable.coffee),
            Dish("Oreo Shake", R.drawable.oreoshake),
            Dish("KitKat Shake", R.drawable.kitkatshake),
            Dish("Banana Smoothie", R.drawable.bananasmoothie),
            Dish("Berry Smoothie", R.drawable.berrysmoothie),
            Dish("Spinach juice", R.drawable.spinachjuice),
            Dish("Kashmiri Chai", R.drawable.kashmirichai),
            Dish("Dry Fruit Shake", R.drawable.dryfruitshake),
            Dish("Kashmiri Chai", R.drawable.kashmirichai),
            Dish("Kashmiri Chai", R.drawable.kashmirichai),
            Dish("Kashmiri Chai", R.drawable.kashmirichai)
        )

        // Adapter set karna
        val adapter = DishAdapter(drinkList) { selectedDish ->
            // Click hone par ye Intent chalega aur RecipeDetailActivity khulegi
            val intent = Intent(this, RecipeDetailActivity::class.java)
            intent.putExtra("DISH_NAME", selectedDish.name) // Naam bhej rahe hain
            startActivity(intent)
        }

        recyclerView.adapter = adapter
        recyclerView.layoutManager = GridLayoutManager(this, 2) // Grid layout
    }
}
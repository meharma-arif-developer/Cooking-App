package com.example.project1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // XML mein diye gaye IDs ko find karna
        val cardRice = findViewById<CardView>(R.id.cardRice)
        val cardFastFood = findViewById<CardView>(R.id.cardfastfood)
        val cardSalan = findViewById<CardView>(R.id.cardsalan)
        val cardDessert = findViewById<CardView>(R.id.carddessert)
        val cardDrink = findViewById<CardView>(R.id.carddrink)

        // 1. Rice Card Click Listener
        cardRice.setOnClickListener {
            val intent = Intent(this, RiceDetailActivity::class.java)
            intent.putExtra("DISH_NAME", "Rice Recipe")
            startActivity(intent)
        }

        // 2. Fast Food Card Click Listener
        cardFastFood.setOnClickListener {
            val intent = Intent(this, FastfoodDetailActivity::class.java)
            intent.putExtra("DISH_NAME", "Fast Food Recipe")
            startActivity(intent)
        }

        // 3. Salan Card Click Listener
        cardSalan.setOnClickListener {
            val intent = Intent(this, SalanDetailActivity::class.java)
            intent.putExtra("DISH_NAME", "Salan Recipe")
            startActivity(intent)
        }

        // 4. Dessert Card Click Listener
        cardDessert.setOnClickListener {
            val intent = Intent(this, DessertsDetailActivity::class.java)
            intent.putExtra("DISH_NAME", "Dessert Recipe")
            startActivity(intent)
        }
        // 5. Drinks card click Listener
        cardDrink.setOnClickListener {
            val intent = Intent(this, DrinkDetailActivity::class.java)
            intent.putExtra("DISH_NAME", "Drink Recipe")
            startActivity(intent)
        }
    }
}
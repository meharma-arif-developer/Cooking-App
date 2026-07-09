package com.example.project1

object RecipeManager {
    fun getRecipe(name: String): Recipe? {
        return when (name) {
            "Biryani" -> Recipe("Biryani", R.drawable.biryani, "Ingredients: Rice, Chicken, Spices...", "Steps: 1. Fry onions. 2. Cook chicken. 3. Add rice...")
            "Pulao" -> Recipe("Pulao", R.drawable.pulao, "Ingredients: Rice, Yakhni, Spices...", "Steps: 1. Yakhni banayein. 2. Rice add karein.")
            // Baaki dishes yahan add karein...
            else -> null
        }
    }
}
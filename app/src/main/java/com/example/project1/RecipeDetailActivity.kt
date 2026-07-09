package com.example.project1

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.content.Intent
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class RecipeDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_detail) // Aapki detail layout file

        // 1. Data receive karein (jo DishAdapter se aya hai)
        val dishName = intent.getStringExtra("DISH_NAME") ?: "Dish"

        // 2. Views find karein
        val tvTitle = findViewById<TextView>(R.id.tvDetailTitle)
        val tvRecipe1Steps = findViewById<TextView>(R.id.tvIngredients)
        val tvRecipe2Steps = findViewById<TextView>(R.id.tvSteps)
        val imgDetail = findViewById<ImageView>(R.id.imgDetail)
        val doneButton = findViewById<Button>(R.id.btndone)

        // 3. Data show karein (Aap yahan RecipeManager use kar sakte hain)
        tvTitle.text = dishName
        doneButton.setOnClickListener {
            val intent = Intent(this, FeedbackActivity::class.java)
            startActivity(intent)
        }
        // Example logic:
        when (dishName) {
            "Biryani" -> {
                imgDetail.setImageResource(R.drawable.biryani)
                tvRecipe1Steps.text =
                    "Chicken: 1 kg\nChawal (Basmati): 500 g\nPyaz: 3–4 (slice ki hui)\n" +
                            "Tamatar: 2\nDahi: 1 cup\nAdrak lehsan paste: 2 tbsp\nHari mirch: 3–4\nBiryani masala: 2 tbsp\nHaldi: ½ tsp\n" +
                            "Lal mirch: 1 tsp\nNamak: taste ke mutabiq\nSabut garam masalay\nOil ya ghee"
                tvRecipe2Steps.text =
                    "1. Boil basmati rice with salt and whole spices until 70% cooked, then drain.\n" +
                            "2. Fry sliced onions in oil until golden.\n" +
                            "3. Add ginger-garlic paste and chicken, cook well.\n" +
                            "4. Add tomatoes, yogurt, and spices; cook until chicken is tender and masala thick.\n" +
                            "5. Layer chicken masala at the bottom and rice on top.\n" +
                            "6. Add fried onions, coriander, and mint.\n7. Cover and cook on low heat (dum) for 10–15 minutes, then serve."
            }

            "Pulao" -> {
                imgDetail.setImageResource(R.drawable.pulao)
                tvRecipe1Steps.text = "Chicken: 500 g\n Basmati rice: 2 cups\n" +
                        "Onion: 1–2 (sliced)\n Ginger garlic paste: 1 tbsp\n" +
                        "Yogurt: ½ cup (optional)\n Green chilies: 2–3\n" +
                        "Whole spices: cumin seeds, cloves, cinnamon, bay leaf\n" +
                        "Salt: to taste\n Black pepper / pulao masala\n" +
                        "Oil or ghee\n Water: 4 cups (for 2 cups rice)"
                tvRecipe2Steps.text =
                    "1. Heat oil/ghee and fry whole spices (cumin, cloves, cinnamon).\n" +
                            "2. Add sliced onions and cook until light golden.\n" +
                            "3. Add chicken (or vegetables) and cook for a few minutes.\n" +
                            "4. Add ginger-garlic paste, salt, and spices.\n" +
                            "5. Add washed rice and water (usually 1:2 ratio).\n" +
                            "6. Cook on medium heat until water dries.\n" +
                            "7. Cover and cook on low heat for 5–10 minutes, then serve."
            }

            "Fried Rice" -> {
                imgDetail.setImageResource(R.drawable.friedrice)
                tvRecipe1Steps.text = "Cooked rice (preferably cold): 2 cups\n" +
                        "Chicken or vegetables: 1 cup\n" +
                        "Eggs: 2 (optional)\n" +
                        "Garlic: 1 tbsp (chopped)\n" +
                        "Green onions (spring onions)\n" +
                        "Soy sauce: 2 tbsp\n" +
                        "Black pepper: ½ tsp\n" +
                        "Salt: to taste\n" +
                        "Oil: 2–3 tbsp"
                tvRecipe2Steps.text = "1. Heat oil in a pan or wok.\n" +
                        "2. Add chopped garlic and sauté for a few seconds.\n" +
                        "3. Add chicken or vegetables and cook well.\n" +
                        "4. Push to the side, add eggs, scramble them (optional).\n" +
                        "5. Add cooked rice and mix everything.\n" +
                        "6. Add soy sauce, salt, and black pepper.\n" +
                        "7. Stir on high heat for 2–3 minutes, then garnish with green onions and serve."
            }

            "Zarda" -> {
                imgDetail.setImageResource(R.drawable.zarda)
                tvRecipe1Steps.text = "Basmati rice: 2 cups\n" +
                        "Sugar: 1½ cups\n" +
                        "Ghee: 3–4 tbsp\n" +
                        "Yellow food color\n" +
                        "Cardamom (elaichi): 4–5\n" +
                        "Cloves: 3–4\n" +
                        "Dry fruits: almonds, raisins, cashews\n" +
                        "Khoya (optional)\n" +
                        "Water: as needed"
                tvRecipe2Steps.text =
                    "1. Boil basmati rice with yellow food color until 70% cooked, then drain.\n" +
                            "2. Heat ghee and lightly fry cloves and cardamom.\n" +
                            "3. Add sugar and a little water to make syrup.\n" +
                            "4. Add the boiled rice into the syrup and mix gently.\n" +
                            "5. Add dry fruits (almonds, raisins, cashews).\n" +
                            "6. Cover and cook on low heat (dum) for 10–15 minutes.\n" +
                            "7. Garnish with khoya (optional) and serve."
            }

            "Chicken Rice" -> {
                imgDetail.setImageResource(R.drawable.chickenrice)
                tvRecipe1Steps.text = "Chicken: 500 g\n" +
                        "Rice (basmati): 2 cups\n" +
                        "Onion: 1 (sliced)\n" +
                        "Garlic & ginger paste: 1 tbsp\n" +
                        "Soy sauce: 2 tbsp\n" +
                        "Salt: to taste\n" +
                        "Black pepper: ½ tsp\n" +
                        "Oil: 2–3 tbsp\n" +
                        "Water: 4 cups\n" +
                        "Vegetables (optional): carrots, peas, capsicum"
                tvRecipe2Steps.text = "1. Heat oil and fry onions until light golden.\n" +
                        "2. Add ginger-garlic paste and chicken, cook well.\n" +
                        "3. Add salt, pepper, and soy sauce.\n" +
                        "4. Add vegetables (optional) and cook for a few minutes.\n" +
                        "5. Add rice and water, mix well.\n" +
                        "6. Cook on medium heat until water dries.\n" +
                        "7. Cover and cook on low heat for 5–10 minutes, then serve."
            }

            "Steam Rice" -> {
                imgDetail.setImageResource(R.drawable.steamrice)
                tvRecipe1Steps.text = "Basmati rice: 2 cups\n" +
                        "Water: 3–4 cups\n" +
                        "Salt: optional"
                tvRecipe2Steps.text = "1. Wash rice 2–3 times and soak for 20 minutes.\n" +
                        "2. Boil water in a pot.\n" +
                        "3. Add soaked rice and salt (optional).\n" +
                        "4. Cook until rice is soft (almost done).\n" +
                        "5. Drain excess water.\n" +
                        "6. Cover and steam (dum) on low heat for 5–10 minutes.\n" +
                        "7. Fluff with fork and serve."
            }

            "Veg Rice" -> {
                imgDetail.setImageResource(R.drawable.vegrice)
                tvRecipe1Steps.text = "Basmati rice: 2 cups\n" +
                        "Mixed vegetables: carrots, peas, beans, capsicum\n" +
                        "Onion: 1 (sliced)\n" +
                        "Garlic: 1 tbsp (chopped)\n" +
                        "Soy sauce: 1–2 tbsp\n" +
                        "Salt: to taste\n" +
                        "Black pepper: ½ tsp\n" +
                        "Oil: 2–3 tbsp\n" +
                        "Water: 4 cups"
                tvRecipe2Steps.text = "1. Heat oil and sauté garlic and onions.\n" +
                        "2. Add vegetables and cook for a few minutes.\n" +
                        "3. Add salt, pepper, and soy sauce.\n" +
                        "4. Add rice and water, mix well.\n" +
                        "5. Cook on medium heat until water dries.\n" +
                        "6. Cover and cook on low heat (dum) for 5–10 minutes.\n" +
                        "7. Fluff and serve hot."
            }

            "Masala Rice" -> {
                imgDetail.setImageResource(R.drawable.masalarice)
                tvRecipe1Steps.text = "Basmati rice: 2 cups\n" +
                        "Onion: 1 (sliced)\n" +
                        "Tomato: 2 (chopped)\n" +
                        "Ginger garlic paste: 1 tbsp\n" +
                        "Green chilies: 2\n" +
                        "Yogurt: ½ cup\n" +
                        "Biryani or garam masala: 1–2 tsp\n" +
                        "Turmeric: ½ tsp\n" +
                        "Red chili powder: 1 tsp\n" +
                        "Salt: to taste\n" +
                        "Oil or ghee: 2–3 tbsp\n" +
                        "Water: 4 cups\n" +
                        "Coriander (for garnish)"
                tvRecipe2Steps.text = "1. Heat oil and fry onions until golden.\n" +
                        "2. Add ginger-garlic paste and sauté.\n" +
                        "3. Add tomatoes and cook until soft.\n" +
                        "4. Add yogurt and all spices, mix well.\n" +
                        "5. Add rice and water, stir gently.\n" +
                        "6. Cook until water dries on medium heat.\n" +
                        "7. Cover and cook on low heat (dum) for 5–10 minutes, then serve. "
            }

            "Burger" -> {
                imgDetail.setImageResource(R.drawable.burger)
                tvRecipe1Steps.text = "Burger buns: 2\n" +
                        "Chicken or beef patty: 2\n" +
                        "Lettuce leaves\n" +
                        "Tomato slices\n" +
                        "Onion rings\n" +
                        "Cheese slices\n" +
                        "Mayonnaise or ketchup\n" +
                        "Oil or butter"
                tvRecipe2Steps.text =
                    "1. Cook the patty in a pan with a little oil until fully done.\n" +
                            "2. Lightly toast the burger buns with butter.\n" +
                            "3. Spread mayonnaise and ketchup on buns.\n" +
                            "4. Place lettuce on the bottom bun.\n" +
                            "5. Add the cooked patty and cheese slice.\n" +
                            "6. Add tomato and onion on top.\n" +
                            "7. Cover with top bun and serve."
            }

            "Shawarma" -> {
                imgDetail.setImageResource(R.drawable.shawarma)
                tvRecipe1Steps.text = "Chicken (boneless): 500 g\n" +
                        "Yogurt: ½ cup\n" +
                        "Garlic paste: 1 tbsp\n" +
                        "Lemon juice: 1–2 tbsp\n" +
                        "Salt & black pepper\n" +
                        "Shawarma spice or garam masala\n" +
                        "Oil: 2 tbsp\n" +
                        "Pita bread or roti\n" +
                        "Cabbage, cucumber, tomato (sliced)\n" +
                        "Mayonnaise or garlic sauce"
                tvRecipe2Steps.text =
                    "1. Marinate chicken with yogurt, garlic, lemon, and spices for 30–60 minutes.\n" +
                            "2. Cook chicken in a pan until tender and slightly crispy.\n" +
                            "3. Warm the pita bread or roti.\n" +
                            "4. Spread mayonnaise or garlic sauce on it.\n" +
                            "5. Add cooked chicken and vegetables.\n" +
                            "6. Roll it tightly like a wrap.\n" +
                            "7. Cut and serve."
            }

            "Sandwich" -> {
                imgDetail.setImageResource(R.drawable.sandwich)
                tvRecipe1Steps.text = "Bread slices: 4\n" +
                        "Chicken / vegetables / egg (your choice)\n" +
                        "Mayonnaise or butter\n" +
                        "Lettuce\n" +
                        "Tomato slices\n" +
                        "Cucumber slices\n" +
                        "Salt & black pepper"
                tvRecipe2Steps.text = "1. Spread butter or mayonnaise on bread slices.\n" +
                        "2. Add your filling (chicken, egg, or vegetables).\n" +
                        "3. Place lettuce, tomato, and cucumber on top.\n" +
                        "4. Sprinkle salt and black pepper.\n" +
                        "5. Cover with another bread slice.\n" +
                        "6. Cut into halves or triangles.\n" +
                        "7. Serve fresh."
            }

            "Chicken Nuggets" -> {
                imgDetail.setImageResource(R.drawable.chickennuggets)
                tvRecipe1Steps.text = "Chicken mince: 500 g\n" +
                        "Egg: 1\n" +
                        "Bread crumbs: 1 cup\n" +
                        "Garlic paste: 1 tsp\n" +
                        "Salt: to taste\n" +
                        "Black pepper: ½ tsp\n" +
                        "Soy sauce: 1 tbsp (optional)\n" +
                        "Oil: for frying"
                tvRecipe2Steps.text =
                    "1. Mix chicken mince, egg, garlic, salt, pepper, and soy sauce.\n" +
                            "2. Shape the mixture into small nugget pieces.\n" +
                            "3. Coat each piece with bread crumbs.\n" +
                            "4. Heat oil in a pan.\n" +
                            "5. Fry nuggets until golden brown and crispy.\n" +
                            "6. Remove and place on tissue paper.\n" +
                            "7. Serve hot with ketchup or sauce."
            }

            "Chicken Wings" -> {
                imgDetail.setImageResource(R.drawable.chickenwings)
                tvRecipe1Steps.text = "Chicken wings: 500 g\n" +
                        "Garlic paste: 1 tbsp\n" +
                        "Soy sauce: 2 tbsp\n" +
                        "Chili sauce: 1 tbsp\n" +
                        "Salt: to taste\n" +
                        "Black pepper: ½ tsp\n" +
                        "Red chili powder: 1 tsp\n" +
                        "Oil: for frying or baking"
                tvRecipe2Steps.text =
                    "1. Marinate wings with garlic, soy sauce, chili sauce, and spices for 30–60 minutes.\n" +
                            "2. Heat oil in a pan (or preheat oven).\n" +
                            "3. Fry wings until golden and crispy (or bake at 180°C).\n" +
                            "4. Turn occasionally for even cooking.\n" +
                            "5. Cook until fully tender inside.\n" +
                            "6. Remove and drain excess oil.\n" +
                            "7. Serve hot with your favorite sauce."
            }

            "Pizza" -> {
                imgDetail.setImageResource(R.drawable.pizza)
                tvRecipe1Steps.text = "Pizza base or dough\n" +
                        "Chicken or vegetables (toppings)\n" +
                        "Pizza sauce\n" +
                        "Cheese (mozzarella)\n" +
                        "Onion & capsicum\n" +
                        "Oregano & chili flakes\n" +
                        "Oil"
                tvRecipe2Steps.text = "1. Preheat oven to 180°C.\n" +
                        "2. Place pizza base on tray.\n" +
                        "3. Spread pizza sauce evenly.\n" +
                        "4. Add chicken or vegetables.\n" +
                        "5. Add cheese on top.\n" +
                        "6. Sprinkle oregano and chili flakes.\n" +
                        "7. Bake for 10–15 minutes until cheese melts, then serve."
            }

            "Pasta" -> {
                imgDetail.setImageResource(R.drawable.pasta)
                tvRecipe1Steps.text = "Pasta: 2 cups\n" +
                        "Chicken or vegetables: 1 cup\n" +
                        "Garlic: 1 tbsp (chopped)\n" +
                        "Tomato sauce: 1 cup\n" +
                        "Salt: to taste\n" +
                        "Black pepper: ½ tsp\n" +
                        "Oil: 2 tbsp\n" +
                        "Cheese (optional)"
                tvRecipe2Steps.text = "1. Boil pasta in salted water until soft, then drain.\n" +
                        "2. Heat oil and sauté garlic.\n" +
                        "3. Add chicken or vegetables and cook well.\n" +
                        "4. Add tomato sauce, salt, and pepper.\n" +
                        "5. Add boiled pasta and mix well.\n" +
                        "6. Cook for 2–3 minutes.\n" +
                        "7. Add cheese (optional) and serve hot."
            }

            "Mozzarella Sticks" -> {
                imgDetail.setImageResource(R.drawable.mozzarellasticks)
                tvRecipe1Steps.text = "Mozzarella cheese sticks\n" +
                        "Egg: 1–2\n" +
                        "Bread crumbs: 1 cup\n" +
                        "Flour: ½ cup\n" +
                        "Salt & black pepper\n" +
                        "Oil: for frying"
                tvRecipe2Steps.text = "1. Cut mozzarella into stick shapes (if not ready-made).\n" +
                        "2. Coat each stick in flour.\n" +
                        "3. Dip in beaten egg.\n" +
                        "4. Coat with bread crumbs (repeat for extra crispiness).\n" +
                        "5. Freeze for 20–30 minutes.\n" +
                        "6. Heat oil and fry until golden brown.\n" +
                        "7. Serve hot with ketchup or sauce."
            }

            "Chicken Karahi" -> {
                imgDetail.setImageResource(R.drawable.chickenkarahi)
                tvRecipe1Steps.text = "Chicken: 500 g\n" +
                        "Tomatoes: 4–5 (chopped)\n" +
                        "Garlic paste: 1 tbsp\n" +
                        "Ginger (julienne): 1 tbsp\n" +
                        "Green chilies: 3–4\n" +
                        "Salt: to taste\n" +
                        "Red chili powder: 1 tsp\n" +
                        "Black pepper: ½ tsp\n" +
                        "Oil: ½ cup\n" +
                        "Fresh coriander"
                tvRecipe2Steps.text =
                    "1. Heat oil in a karahi and add chicken, cook until it changes color.\n" +
                            "2. Add garlic paste and fry well.\n" +
                            "3. Add chopped tomatoes, salt, and spices.\n" +
                            "4. Cook on medium heat until tomatoes soften and oil separates.\n" +
                            "5. Add green chilies and ginger, mix well.\n" +
                            "6. Cook on low heat for 5–10 minutes (dum).\n" +
                            "7. Garnish with coriander and serve hot."
            }

            "Daal Mash" -> {
                imgDetail.setImageResource(R.drawable.daalmash)
                tvRecipe1Steps.text = "Mash daal (white lentils): 2 cups\n" +
                        "Onion: 1 (sliced)\n" +
                        "Garlic: 4–5 cloves\n" +
                        "Ginger: 1 tsp\n" +
                        "Salt: to taste\n" +
                        "Red chili powder: 1 tsp\n" +
                        "Turmeric: ½ tsp\n" +
                        "Cumin seeds: 1 tsp\n" +
                        "Oil or ghee: 3–4 tbsp\n" +
                        "Water: as needed"
                tvRecipe2Steps.text = "1. Wash and soak daal for 30 minutes.\n" +
                        "2. Boil daal with salt and turmeric until soft.\n" +
                        "3. Heat oil/ghee and add cumin seeds.\n" +
                        "4. Add onion and fry until golden.\n" +
                        "5. Add garlic, ginger, and spices, sauté well.\n" +
                        "6. Add boiled daal and mix properly.\n" +
                        "7. Cook for 5–10 minutes, then serve hot."
            }

            "Beef Qorma" -> {
                imgDetail.setImageResource(R.drawable.beefqorma)
                tvRecipe1Steps.text = "Beef: 500 g\n" +
                        "Onion: 2 (sliced)\n" +
                        "Yogurt: 1 cup\n" +
                        "Ginger garlic paste: 1 tbsp\n" +
                        "Qorma masala: 2 tbsp\n" +
                        "Red chili powder: 1 tsp\n" +
                        "Turmeric: ½ tsp\n" +
                        "Whole spices (cardamom, cloves, cinnamon)\n" +
                        "Salt: to taste\n" +
                        "Oil or ghee: ½ cup\n" +
                        "Water: as needed"
                tvRecipe2Steps.text = "1. Heat oil/ghee and fry onions until golden brown.\n" +
                        "2. Add whole spices and ginger-garlic paste, sauté.\n" +
                        "3. Add beef and cook until it changes color.\n" +
                        "4. Add yogurt and all spices, mix well.\n" +
                        "5. Add water, cover, and cook until beef is tender.\n" +
                        "6. Cook until oil separates and gravy thickens.\n" +
                        "7. Garnish and serve hot."
            }

            "Nihari" -> {
                imgDetail.setImageResource(R.drawable.nihari)
                tvRecipe1Steps.text = "Beef (with bone): 500 g\n" +
                        "Wheat flour: 2 tbsp (for thickening)\n" +
                        "Onion: 1 (sliced)\n" +
                        "Ginger garlic paste: 1 tbsp\n" +
                        "Nihari masala: 2 tbsp\n" +
                        "Red chili powder: 1 tsp\n" +
                        "Turmeric: ½ tsp\n" +
                        "Salt: to taste\n" +
                        "Oil or ghee: ½ cup\n" +
                        "Water: as needed\n" +
                        "Ginger (julienne) & lemon (for garnish)"
                tvRecipe2Steps.text = "1. Heat oil/ghee and fry onions until golden brown.\n" +
                        "2. Add ginger-garlic paste and beef, cook well.\n" +
                        "3. Add all spices and mix properly.\n" +
                        "4. Add water, cover, and cook on low heat for 2–3 hours until meat is tender.\n" +
                        "5. Mix wheat flour with water and add to thicken gravy.\n" +
                        "6. Cook for another 10–15 minutes.\n" +
                        "7. Serve with ginger, green chilies, and lemon."
            }

            "Mutton Karahi" -> {
                imgDetail.setImageResource(R.drawable.muttonkarahi)
                tvRecipe1Steps.text = "Mutton: 500 g\n" +
                        "Tomatoes: 4–5 (chopped)\n" +
                        "Ginger garlic paste: 1 tbsp\n" +
                        "Green chilies: 3–4\n" +
                        "Salt: to taste\n" +
                        "Red chili powder: 1 tsp\n" +
                        "Black pepper: ½ tsp\n" +
                        "Oil: ½ cup\n" +
                        "Ginger (julienne) & coriander (for garnish)"
                tvRecipe2Steps.text =
                    "1. Heat oil in a karahi and add mutton, cook until color changes.\n" +
                            "2. Add ginger-garlic paste and fry well.\n" +
                            "3. Add chopped tomatoes, salt, and spices.\n" +
                            "4. Cook on medium heat until tomatoes soften.\n" +
                            "5. Add a little water and cook until mutton becomes tender.\n" +
                            "6. Cook on high heat until oil separates and gravy thickens.\n" +
                            "7. Add green chilies, ginger, coriander and serve hot."
            }

            "Fried Fish with Gravy" -> {
                imgDetail.setImageResource(R.drawable.friedfishwithgravy)
                tvRecipe1Steps.text = "Fish pieces: 500 g\n" +
                        "Lemon juice: 1–2 tbsp\n" +
                        "Salt: to taste\n" +
                        "Red chili powder: 1 tsp\n" +
                        "Turmeric: ½ tsp\n" +
                        "Garlic paste: 1 tbsp\n" +
                        "Oil: for frying\n" +
                        "Onion: 1 (sliced)\n" +
                        "Tomatoes: 2 (chopped)\n" +
                        "Green chilies: 2–3\n" +
                        "Water: as needed\n" +
                        "Coriander (for garnish)"
                tvRecipe2Steps.text =
                    "1. Marinate fish with salt, chili, turmeric, garlic, and lemon for 20–30 minutes.\n" +
                            "2. Fry fish in hot oil until golden and set aside.\n" +
                            "3. In another pan, heat oil and sauté onions until light golden.\n" +
                            "4. Add tomatoes, salt, and spices; cook until soft.\n" +
                            "5. Add a little water and cook gravy.\n" +
                            "6. Add fried fish into the gravy and simmer for 5–10 minutes.\n" +
                            "7. Garnish with coriander and serve hot."
            }

            "Aloo Gosht" -> {
                imgDetail.setImageResource(R.drawable.aloogosht)
                tvRecipe1Steps.text = "Mutton or beef: 500 g\n" +
                        "Potatoes (aloo): 3–4 (cut in chunks)\n" +
                        "Onion: 1–2 (sliced)\n" +
                        "Tomato: 2–3 (chopped)\n" +
                        "Ginger garlic paste: 1 tbsp\n" +
                        "Salt: to taste\n" +
                        "Red chili powder: 1 tsp\n" +
                        "Turmeric: ½ tsp\n" +
                        "Coriander powder: 1 tsp\n" +
                        "Oil: ½ cup\n" +
                        "Water: as needed\n" +
                        "Green chilies & coriander (for garnish)"
                tvRecipe2Steps.text = "1. Heat oil and fry onions until golden brown.\n" +
                        "2. Add ginger garlic paste and meat, cook until color changes.\n" +
                        "3. Add tomatoes and all spices, mix well.\n" +
                        "4. Cook until tomatoes soften and oil separates.\n" +
                        "5. Add water, cover, and cook until meat is half tender.\n" +
                        "6. Add potatoes and cook until both meat and potatoes are soft.\n" +
                        "7. Garnish with green chilies and coriander, then serve hot."
            }

            "Mix Vegetable Curry" -> {
                imgDetail.setImageResource(R.drawable.mixvegetablecurry)
                tvRecipe1Steps.text = "Mixed vegetables (carrot, peas, potato, beans): 2 cups\n" +
                        "Onion: 1 (sliced)\n" +
                        "Tomato: 2 (chopped)\n" +
                        "Ginger garlic paste: 1 tbsp\n" +
                        "Salt: to taste\n" +
                        "Red chili powder: 1 tsp\n" +
                        "Turmeric: ½ tsp\n" +
                        "Coriander powder: 1 tsp\n" +
                        "Oil: 2–3 tbsp\n" +
                        "Water: as needed\n" +
                        "Green chilies & coriander (for garnish)"
                tvRecipe2Steps.text = "1. Heat oil and sauté onions until light golden.\n" +
                        "2. Add ginger garlic paste and cook for a few seconds.\n" +
                        "3. Add tomatoes and spices, cook until soft.\n" +
                        "4. Add mixed vegetables and mix well.\n" +
                        "5. Add a little water, cover, and cook until vegetables are tender.\n" +
                        "6. Cook until curry thickens and oil separates slightly.\n" +
                        "7. Garnish with green chilies and coriander, then serve."
            }

            "Kheer" -> {
                imgDetail.setImageResource(R.drawable.kheer)
                tvRecipe1Steps.text = "Rice: ½ cup (washed)\n" +
                        "Milk: 1 liter\n" +
                        "Sugar: ½ – ¾ cup (to taste)\n" +
                        "Cardamom: 3–4 (crushed)\n" +
                        "Dry fruits: almonds, raisins, cashews\n" +
                        "Khoya (optional)"
                tvRecipe2Steps.text = "1. Boil milk in a heavy pan.\n" +
                        "2. Add washed rice and cook on low heat.\n" +
                        "3. Stir occasionally until rice becomes soft.\n" +
                        "4. Cook until mixture thickens.\n" +
                        "5. Add sugar and cardamom, mix well.\n" +
                        "6. Cook for 5–10 more minutes.\n" +
                        "7. Garnish with dry fruits and serve chilled or warm."
            }

            "Suji ka Halwa" -> {
                imgDetail.setImageResource(R.drawable.sujikahalwa)
                tvRecipe1Steps.text = "Semolina (suji): 1 cup\n" +
                        "Sugar: ¾ cup\n" +
                        "Ghee: ½ cup\n" +
                        "Water or milk: 2–2½ cups\n" +
                        "Cardamom: 3–4 (crushed)\n" +
                        "Dry fruits: almonds, raisins"
                tvRecipe2Steps.text = "1. Heat ghee in a pan.\n" +
                        "2. Add suji and roast until golden and aromatic.\n" +
                        "3. In another pot, boil water or milk with sugar and cardamom.\n" +
                        "4. Slowly add the liquid into roasted suji.\n" +
                        "5. Stir continuously to avoid lumps.\n" +
                        "6. Cook until halwa thickens and ghee separates.\n" +
                        "7. Garnish with dry fruits and serve hot."
            }

            "Chocolate Cake" -> {
                imgDetail.setImageResource(R.drawable.chocolatecake)
                tvRecipe1Steps.text = "Flour: 1 ½ cups\n" +
                        "Sugar: 1 cup\n" +
                        "Cocoa powder: ½ cup\n" +
                        "Eggs: 2\n" +
                        "Milk: 1 cup\n" +
                        "Oil: ½ cup\n" +
                        "Baking powder: 1½ tsp\n" +
                        "Baking soda: ½ tsp\n" +
                        "Vanilla essence: 1 tsp\n" +
                        "Salt: a pinch"
                tvRecipe2Steps.text = "1. Preheat oven to 180°C and grease a cake pan.\n" +
                        "2. Mix flour, cocoa powder, baking powder, baking soda, and salt.\n" +
                        "3. In another bowl, beat eggs, sugar, oil, milk, and vanilla.\n" +
                        "4. Combine wet and dry ingredients and mix well.\n" +
                        "5. Pour batter into the cake pan.\n" +
                        "6. Bake for 25–35 minutes.\n" +
                        "7. Let it cool, then serve."
            }

            "Ras Malai" -> {
                imgDetail.setImageResource(R.drawable.rasmalai)
                tvRecipe1Steps.text = "Milk: 1 liter\n" +
                        "Sugar: ¾ cup\n" +
                        "Cardamom: 3–4\n" +
                        "Vinegar or lemon juice: 1–2 tbsp (for curdling milk)\n" +
                        "Flour: 1 tbsp\n" +
                        "Semolina (suji): 1 tbsp\n" +
                        "Pistachios & almonds (for garnish)"
                tvRecipe2Steps.text =
                    "1. Boil milk and add lemon juice/vinegar to curdle it (to make chenna).\n" +
                            "2. Strain and press chenna to remove water.\n" +
                            "3. Mix chenna with a little flour and suji, shape into small balls.\n" +
                            "4. Boil these balls in sugar water until they double in size.\n" +
                            "5. In another pot, boil milk with sugar and cardamom until slightly thick.\n" +
                            "6. Add cooked balls into sweet milk.\n" +
                            "7. Chill and garnish with nuts before serving."
            }

            "Cupcakes" -> {
                imgDetail.setImageResource(R.drawable.cupcakes)
                tvRecipe1Steps.text = "Flour: 1 cup\n" +
                        "Sugar: ¾ cup\n" +
                        "Eggs: 2\n" +
                        "Milk: ½ cup\n" +
                        "Oil or butter: ½ cup\n" +
                        "Baking powder: 1 tsp\n" +
                        "Vanilla essence: 1 tsp\n" +
                        "Salt: a pinch"
                tvRecipe2Steps.text = "1. Preheat oven to 180°C and prepare cupcake molds.\n" +
                        "2. Mix flour, baking powder, and salt in a bowl.\n" +
                        "3. In another bowl, beat eggs, sugar, oil, milk, and vanilla.\n" +
                        "4. Combine wet and dry ingredients and mix well.\n" +
                        "5. Pour batter into cupcake molds (fill ¾ only).\n" +
                        "6. Bake for 15–20 minutes.\n" +
                        "7. Let cool and serve or decorate with frosting."
            }

            "Custard" -> {
                imgDetail.setImageResource(R.drawable.custard)
                tvRecipe1Steps.text = "Milk: 2 cups \n" +
                        "Egg Yolks: 3 large\n" +
                        "Sugar: 1/4 cup \n" +
                        "Cornstarch: 2 tablespoons \n" +
                        "Vanilla Extract: 1 teaspoon\n" +
                        "Salt: A pinch"
                tvRecipe2Steps.text =
                    "1. Whisk egg yolks, sugar, cornstarch, and salt in a bowl until smooth.\n" +
                            "2. Heat milk in a saucepan until it begins to simmer gently.\n" +
                            "3. Slowly pour half the hot milk into the egg mixture while whisking constantly.\n" +
                            "4. Pour everything back into the saucepan and cook on low heat.\n" +
                            "5. Stir continuously for 3–5 minutes until the mixture thickens and coats a spoon.\n" +
                            "6. Remove from heat, stir in vanilla extract, and pour into a serving bowl.\n" +
                            "7. Cover with plastic wrap touching the surface to prevent a skin and refrigerate."
            }

            "Cookies" -> {
                imgDetail.setImageResource(R.drawable.cookies)
                tvRecipe1Steps.text = "Butter: 1/2 cup (softened)\n" +
                        "Sugar: 1/2 cup brown sugar + 1/4 cup white sugar\n" +
                        "Egg: 1 large\n" +
                        "Vanilla: 1 teaspoon\n" +
                        "Flour: 1 1/2 cups\n" +
                        "Baking Soda: 1/2 teaspoon\n" +
                        "Chocolate Chips: 1 cup"
                tvRecipe2Steps.text =
                    "1. Mix the butter and both sugars in a bowl until light and fluffy.\n" +
                            "2. Add the egg and vanilla; whisk until well combined.\n" +
                            "3. Stir in the flour and baking soda until a dough forms.\n" +
                            "4. Fold in the chocolate chips evenly.\n" +
                            "5. Place rounded spoonfuls of dough onto a parchment-lined baking sheet.\n" +
                            "6. Bake at 350°F (175°C) for 10–12 minutes until edges are golden.\n" +
                            "7. Let them sit on the pan for 5 minutes before moving to a wire rack."
            }

            "Rabri" -> {
                imgDetail.setImageResource(R.drawable.rabri)
                tvRecipe1Steps.text = "Full-fat Milk: 1 liter\n" +
                        "Sugar: 3–4 tablespoons\n" +
                        "Green Cardamom Powder: 1/4 teaspoon\n" +
                        "Saffron (optional): A pinch\n" +
                        "Nuts: Chopped almonds and pistachios for garnish"
                tvRecipe2Steps.text = "1. Boil milk in a wide, heavy pan on low heat.\n" +
                        "2. As cream forms on top, gently push it to the sides of the pan.\n" +
                        "3. Keep simmering and stirring until the milk reduces to one-third.\n" +
                        "4. Scrape the cream from the sides back into the thickened milk.\n" +
                        "5. Add sugar, cardamom, and saffron, then stir until dissolved.\n" +
                        "6. Cook for 2 minutes until creamy, then remove from heat.\n" +
                        "7. Garnish with nuts and serve chilled or warm."
            }
            "Coffee" -> {
                imgDetail.setImageResource(R.drawable.coffee)
                tvRecipe1Steps.text = "Water or milk: 1 cup\n" +
                        "Instant coffee: 1–2 tsp\n" +
                        "Sugar: 1–2 tbsp (as needed)\n" +
                        "Milk (optional, if making milk coffee): ½ cup extra\n" +
                        "Cream or froth (optional)"
                tvRecipe2Steps.text = "1. Add water or milk in a pan and heat it.\n" +
                        "2. Add coffee and sugar.\n" +
                        "3. Stir well until everything dissolves.\n" +
                        "4. Let it boil for 1–2 minutes for strong taste.\n" +
                        "5. If using milk, adjust consistency as desired.\n" +
                        "6. Pour into a cup and serve hot."
            }
            "Oreo Shake" -> {
                imgDetail.setImageResource(R.drawable.oreoshake)
                tvRecipe1Steps.text = "Milk: 1 glass (cold)\n" +
                        "Oreo biscuits: 6–8\n" +
                        "Vanilla ice cream: 2 scoops (optional, for creaminess)\n" +
                        "Sugar: 1–2 tbsp (optional, as needed)\n" +
                        "Chocolate syrup: 1–2 tbsp (optional)\n" +
                        "Ice cubes: 3–4 (optional)"
                tvRecipe2Steps.text = "1. Break Oreo biscuits into pieces.\n" +
                        "2. Add milk, Oreos, ice cream, and sugar into a blender.\n" +
                        "3. Blend until smooth and creamy.\n" +
                        "4. Add ice cubes if you want it extra cold and blend again.\n" +
                        "5. Pour into a glass and top with crushed Oreo.\n" +
                        "6. Serve chilled."
            }
            "KitKat Shake" -> {
                imgDetail.setImageResource(R.drawable.kitkatshake)
                tvRecipe1Steps.text = "Milk: 1 glass (cold)\n" +
                        "KitKat: 2–3 bars\n" +
                        "Vanilla ice cream: 2 scoops (optional but recommended)\n" +
                        "Sugar: 1–2 tbsp (optional, if needed)\n" +
                        "Chocolate syrup: 1–2 tbsp\n" +
                        "Ice cubes: 3–4 (optional)"
                tvRecipe2Steps.text = "1. Break KitKat into small pieces.\n" +
                        "2. Add milk, KitKat, ice cream, chocolate syrup, and sugar into a blender.\n" +
                        "3. Blend until smooth and creamy.\n" +
                        "4. Add ice cubes if you want it extra cold and blend again.\n" +
                        "5. Pour into a glass and top with crushed KitKat.\n" +
                        "6. Serve chilled."
            }
            "Banana Smoothie" -> {
                imgDetail.setImageResource(R.drawable.bananasmoothie)
                tvRecipe1Steps.text = "Bananas: 1–2 ripe\n" +
                        "Milk: 1 cup\n" +
                        "Sugar or honey: 1–2 tbsp (as needed)\n" +
                        "Ice cubes: 3–4 (optional)\n" +
                        "Vanilla essence: ½ tsp (optional)\n" +
                        "Yogurt: 2–3 tbsp (optional, for creaminess)"
                tvRecipe2Steps.text = "1. Peel and cut the bananas into small pieces.\n" +
                        "2. Add bananas, milk, and yogurt into a blender.\n" +
                        "3. Add sugar or honey for sweetness.\n" +
                        "4. Blend until smooth and creamy.\n" +
                        "5. Add ice cubes and blend again if you want it cold.\n" +
                        "6.Pour into a glass and serve immediately.\n"
            }
            "Berry Smoothie" -> {
                imgDetail.setImageResource(R.drawable.berrysmoothie)
                tvRecipe1Steps.text = "Mixed berries (strawberries, blueberries, raspberries): 1 cup\n" +
                        "Milk or yogurt: 1 cup\n" +
                        "Banana: 1 small (optional, for thickness)\n" +
                        "Honey or sugar: 1–2 tbsp (as needed)\n" +
                        "Ice cubes: 3–4 (optional)\n" +
                        "Vanilla essence: ½ tsp (optional)"
                tvRecipe2Steps.text = "1. Wash the berries properly.\n" +
                        "2. Add berries, milk/yogurt, and banana into a blender.\n" +
                        "3. Add honey or sugar for sweetness.\n" +
                        "4. Blend until smooth and creamy.\n" +
                        "5. Add ice cubes and blend again if you want it cold.\n" +
                        "6. Pour into a glass and serve immediately."
            }
            "Spinach juice" -> {
                imgDetail.setImageResource(R.drawable.spinachjuice)
                tvRecipe1Steps.text = "Fresh spinach leaves: 1–2 cups\n" +
                        "Water: 1 cup (or as needed)\n" +
                        "Lemon juice: 1–2 tbsp\n" +
                        "Salt: a pinch (optional)\n" +
                        "Black pepper: a pinch (optional)\n" +
                        "Honey: 1–2 tsp (optional, for taste)\n" +
                        "Ice cubes: optional"
                tvRecipe2Steps.text = "1. Wash spinach leaves thoroughly to remove dirt.\n" +
                        "2. Add spinach and water into a blender.\n" +
                        "3. Blend until smooth.\n" +
                        "4. Strain the juice if you want a clear drink.\n" +
                        "5. Add lemon juice, salt, pepper, and honey.\n" +
                        "6. Mix well and serve chilled with ice cubes."
            }
            "Kashmiri Chai" -> {
                imgDetail.setImageResource(R.drawable.kashmirichai)
                tvRecipe1Steps.text = "Green tea leaves: 2 tsp\n" +
                        "Water: 2 cups (for boiling tea) + 2 cups (cold water)\n" +
                        "Baking soda: 1 pinch\n" +
                        "Milk: 2 cups\n" +
                        "Sugar: 2–3 tbsp (or as needed)\n" +
                        "Cardamom: 2–3 pods, crushed\n" +
                        "Almonds: 6–8, chopped (for garnish)\n" +
                        "Pistachios: 4–5, chopped (for garnish)"
                tvRecipe2Steps.text = "1. Boil water with green tea leaves in a pan.\n" +
                        "2. Add baking soda and cook for 5–7 minutes until the color turns dark.\n" +
                        "3. Pour in cold water and boil again.\n" +
                        "4. Stir/whisk continuously until it develops a reddish color.\n" +
                        "5. Add milk and cook on low flame.\n" +
                        "6. Add sugar and cardamom, mix well.\n" +
                        "7. When it turns pink, pour into cups, garnish with dry fruits, and serve hot."
            }
            "Dry Fruit Shake" -> {
                imgDetail.setImageResource(R.drawable.dryfruitshake)
                tvRecipe1Steps.text = "Milk: 1 glass\n" +
                        "Badam: 5–6\n" +
                        "Kaju: 4–5\n" +
                        "Pista: 4–5\n" +
                        "Khajoor: 2–3 \n" +
                        "Sugar: 1–2 tbsp\n" +
                        "Ice cubes (optional)"
                tvRecipe2Steps.text = "1. Soak the dry fruits in water for 2–3 hours or overnight.\n" +
                        "2. Add milk and soaked dry fruits to a blender.\n" +
                        "3. Add sugar or honey.\n" +
                        "4. Blend well until smooth.\n" +
                        "5. Pour into a glass and serve chilled.\n"
            }
        }
    }
}
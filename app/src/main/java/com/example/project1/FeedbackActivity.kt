package com.example.project1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FeedbackActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_feedback)

        // View IDs (Yaad rahe XML mein ID 'main' honi chahiye ya yahan change karein)
        val editText = findViewById<EditText>(R.id.etFeedback)
        val submitButton = findViewById<Button>(R.id.btnSubmit)

        // Submit Button Logic
        submitButton.setOnClickListener {
            val feedbackText = editText.text.toString()

            if (feedbackText.isNotEmpty()) {
                // Toast Message
                Toast.makeText(this, "Message submitted successfully!", Toast.LENGTH_SHORT).show()

                // Text box ko clear karna
                editText.setText("")
            } else {
                // Agar box khali hai to warning
                editText.error = "Please enter your feedback"
            }
        }

        // System Bars Insets (Agar error aye to 'R.id.main' ko apne XML root ID se replace karein)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
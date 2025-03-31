package com.example.mealofmychoice

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.text.clear

 class MainActivity : AppCompatActivity() {
     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         enableEdgeToEdge()
         setContentView(R.layout.activity_main)

         // Retrieve UI elements from the layout by their IDs.
         val timeInput: EditText = findViewById(R.id.timeInput)
         val logButton: Button = findViewById(R.id.logButton)
         val resetButton: Button = findViewById(R.id.resetButton)
         val resultText: TextView = findViewById(R.id.resultText)

// Set an OnClickListener for the Log Meal button.
         logButton.setOnClickListener {
             // Retrieve the time of the day from the input field as a String.
             val time = timeInput.text.toString().trim()

             // Validate the input: Check if the field is empty.
             if (time.isEmpty()) {
                 // If validation fails, update the result TextView to inform the user.
                 resultText.text = "Please fill in the field correctly."
                 // Exit the click listener without processing further.
                 return@setOnClickListener
             }

             // Use if-else statements to determine a meal based on the time of the day.
             val meal = if (time.equals("Morning", ignoreCase = true)) {
                 // The breakfast time.
                 "Start your day with a healthy cereal for breakfast."
             } else if (time.equals("After morning snack", ignoreCase = true)) {
                 // The after breakfast snack.
                 "Boost your energy for the day with a fruit salad."
             } else if (time.equals("Afternoon", ignoreCase = true)) {
                 // The afternoon meal.
                 "After a long morning, enjoy having a Chicken wrap for lunch."
             } else if (time.equals("Mid-afternoon snack", ignoreCase = true)) {
                 // The mid-afternoon snack.
                 "How about having a sweet energy bar to keep you going!"
             } else if (time.equals("Dinner", ignoreCase = true)) {
                 // For dinner time.
                 "Enjoy a tasty Lasagna with salad for dinner."
             } else if (time.equals("After dinner treat", ignoreCase = true)) {
                 // For the after-dinner treat.
                 "Sweeten your mouth with a delicious carrot cake!"
             } else {
                 // If the input doesn't match any valid time of day.
                 "Invalid time. Please enter Morning, Afternoon, Dinner, etc."
             }
             // Title: kotlin If...Else
             // Author:w3schools
             // Date:29 March 2025
             // Version:1.0
             // Available:https://www.w3schools.com/kotlin/kotlin_conditions.php

             // Compose the final result that includes the time and meal suggestion.
             resultText.text = "Time: $time\nMeal: $meal"
         }

// Set an OnClickListener for the Reset button.
         resetButton.setOnClickListener {
             // Clear the text in the time input field.
             timeInput.text.clear()
             // Reset the result TextView to its default message.
             resultText.text = "Progress will be shown here"
         }
     }
 }
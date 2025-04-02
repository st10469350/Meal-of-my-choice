![Screenshot 2025-04-01 190832](https://github.com/user-attachments/assets/a37f82b6-35af-49d1-9120-b0bc60c0c385)# Meal of My Choice - IMAD Assessment 1

This app is designed to provide quick and easy meal suggestions based on the time of day, simplifying meal planning for busy individuals.

## Features

* **Time-Based Meal Suggestions:** Enter the time of day, and the app will provide a meal idea tailored to that time.
* **Valid Time Inputs:** Accepts the following inputs: "Morning", "After morning snack", "Afternoon", "Mid-afternoon snack", "Dinner", and "After dinner treat".
* **Error Handling:** Displays an error message if the input is empty or invalid.
* **Reset Functionality:** Clears the input and meal suggestion with the "Reset" button.

## How to Use

1.  **Enter Time:** Type the time of day in the provided text input field.
2.  **Get Meal Idea:** Press the "Log Meal" button.
3.  **View Suggestion:** The meal suggestion will be displayed.
4.  **Reset:** Press the "Reset" button to clear the input and suggestion.

## How It Works (For Tech People)

### UI Elements

* `timeInput`: `EditText` - Input field for the time of day.
* `logButton`: `Button` - Triggers the meal suggestion logic.
* `resetButton`: `Button` - Clears the input and result fields.
* `resultText`: `TextView` - Displays the meal suggestion or error message.

### "Log Meal" Button Logic

1.  Retrieves the text from `timeInput`.
2.  Checks if the input is empty or invalid.
3.  Uses `if-else` statements to match the time with a meal suggestion.
4.  Displays the time and meal suggestion in `resultText`.

### "Reset" Button Logic

* Clears the text in `timeInput`.
* Clears the text in `resultText`.

## App Design and Appearance

The app's design aims for a warm and inviting feel, reminiscent of a sunny kitchen.

* **Background:** Features a soft gradient blending peach and sunset orange hues, with hand-painted floral and leaf elements for a natural, relaxed vibe.
* **Citrus Focus:** A prominent half-orange slice adds a cheerful, meal-related touch.
* **Buttons:** The "Enter" and "Reset" buttons are a mellow orange, providing good contrast and readability. The design of the buttons and background was created using Canva.

## Display of the App


## Author

IMAD

## Notes

All UI elements were created using Canva.

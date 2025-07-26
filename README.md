# Password Generator

A simple Java Swing application that generates random passwords based on user-specified length.

## Features

- Generates random passwords using ASCII characters from '!' to '{'
- Adjustable password length via slider (0-24 characters)
- Clean and intuitive GUI interface
- Instant generation with the click of a button

## How to Use

1. Run the program (requires Java installed)
2. The application window will appear with:
   - A text field to display the generated password
   - A "Generate" button to create a new password
   - A slider to adjust password length (0-24 characters)
3. Move the slider to select your desired password length
4. Click "Generate" to create a new random password
5. Copy the generated password from the text field

## Technical Details

- Built with Java Swing for the GUI
- Uses `Random.ints()` to generate secure random characters
- Password characters range from ASCII 33 ('!') to 123 ('{')
- Default password length is 12 characters

## Requirements

- Java 8 or higher

## How to Run

1. Compile the Java file:
   ```
   javac PasswordGenerator.java
   ```
2. Run the program:
   ```
   java PasswordGenerator
   ```

## Screenshot
<img width="402" height="501" alt="Screenshot 2025-07-26 at 3 32 38 PM" src="https://github.com/user-attachments/assets/30575ae2-fbda-427c-96d9-60c10846ce0e" />


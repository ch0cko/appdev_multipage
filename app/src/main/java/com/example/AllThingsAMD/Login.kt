package com.example.AllThingsAMD

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Login : AppCompatActivity() {
    // creates variables for .xml widgets
    private lateinit var login: Button
    private lateinit var usernameInput: EditText
    private lateinit var passwordInput: EditText
    private lateinit var usernamePreferences: SharedPreferences
    private lateinit var passwordPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // links .xml widgets to variables
        login = findViewById(R.id.loginButton)
        usernameInput = findViewById(R.id.userEdit)
        passwordInput = findViewById(R.id.passEdit)
        // creates SharedPreferences variables to store data
        usernamePreferences = getSharedPreferences("userLogin", Context.MODE_PRIVATE)
        passwordPreferences = getSharedPreferences("passLogin", Context.MODE_PRIVATE)

        // sets eventhandling for login button
        login.setOnClickListener {
            // saves user input in Username EditText to SharedPreferences
            val userInput = usernameInput.text.toString()
            val userEditor = usernamePreferences.edit()
            userEditor.putString("text", userInput)
            userEditor.apply()

            // saves user input in Password EditText to SharedPreferences
            val passInput = passwordInput.text.toString()
            val passEditor = passwordPreferences.edit()
            passEditor.putString("text", passInput)
            passEditor.apply()

            // starts MainActivity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
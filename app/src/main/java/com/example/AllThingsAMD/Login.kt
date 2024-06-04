package com.example.AllThingsAMD

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Login : AppCompatActivity() {
    private lateinit var login: Button
    private lateinit var usernameInput: EditText
    private lateinit var passwordInput: EditText
    private lateinit var usernamePreferences: SharedPreferences
    private lateinit var passwordPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        login = findViewById(R.id.loginButton)
        usernameInput = findViewById(R.id.userEdit)
        passwordInput = findViewById(R.id.passEdit)
        usernamePreferences = getSharedPreferences("userLogin", Context.MODE_PRIVATE)
        passwordPreferences = getSharedPreferences("passLogin", Context.MODE_PRIVATE)

        login.setOnClickListener {
            val userInput = usernameInput.text.toString()
            val userEditor = usernamePreferences.edit()
            userEditor.putString("text", userInput)
            userEditor.apply()

            val passInput = passwordInput.text.toString()
            val passEditor = passwordPreferences.edit()
            passEditor.putString("text", passInput)
            passEditor.apply()

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
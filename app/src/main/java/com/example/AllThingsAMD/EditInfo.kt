package com.example.AllThingsAMD

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class EditInfo : AppCompatActivity() {
    private lateinit var newUsername: EditText
    private lateinit var newPassword: EditText
    private lateinit var saveButton: Button
    private lateinit var backButton: Button
    private lateinit var newUserPreferences: SharedPreferences
    private lateinit var newPasswordPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_info)

        newUsername = findViewById(R.id.newUser)
        newPassword = findViewById(R.id.newPass)
        saveButton = findViewById(R.id.saveInfo)
        backButton = findViewById(R.id.back)

        newUserPreferences = getSharedPreferences("userLogin", Context.MODE_PRIVATE)
        newPasswordPreferences = getSharedPreferences("passLogin", Context.MODE_PRIVATE)

        saveButton.setOnClickListener {
            val userInput = newUsername.text.toString()
            val userEditor = newUserPreferences.edit()
            userEditor.putString("text", userInput)
            userEditor.apply()

            val passInput = newPassword.text.toString()
            val passEditor = newPasswordPreferences.edit()
            passEditor.putString("text", passInput)
            passEditor.apply()
        }

        backButton.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }
    }
}
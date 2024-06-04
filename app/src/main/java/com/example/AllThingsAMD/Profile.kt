package com.example.AllThingsAMD

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Profile : AppCompatActivity() {
    private lateinit var userDisp: TextView
    private lateinit var passDisp: TextView
    private lateinit var editButton: Button
    private lateinit var backButton: Button
    private lateinit var retrieveUsernamePreferences: SharedPreferences
    private lateinit var retrievePasswordPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        userDisp = findViewById(R.id.usernameDisplay)
        passDisp = findViewById(R.id.passwordDisplay)
        editButton = findViewById(R.id.editProfile)
        backButton = findViewById(R.id.backToMain)

        retrieveUsernamePreferences = getSharedPreferences("userLogin", Context.MODE_PRIVATE)
        val userText  = retrieveUsernamePreferences.getString("text", "")
        userDisp.text = "Username: " + userText

        retrievePasswordPreferences = getSharedPreferences("passLogin", Context.MODE_PRIVATE)
        val passText = retrievePasswordPreferences.getString("text", "")
        passDisp.text = "Password: " + passText

        editButton.setOnClickListener {
            val intent = Intent(this, EditInfo::class.java)
            startActivity(intent)
        }

        backButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
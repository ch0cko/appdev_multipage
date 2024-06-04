package com.example.AllThingsAMD

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Profile : AppCompatActivity() {
    // creates variables for .xml widgets
    private lateinit var userDisp: TextView
    private lateinit var passDisp: TextView
    private lateinit var editButton: Button
    private lateinit var backButton: Button
    private lateinit var retrieveUsernamePreferences: SharedPreferences
    private lateinit var retrievePasswordPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // links .xml widgets to variables
        userDisp = findViewById(R.id.usernameDisplay)
        passDisp = findViewById(R.id.passwordDisplay)
        editButton = findViewById(R.id.editProfile)
        backButton = findViewById(R.id.backToMain)

        // retrieves stored data in username SharedPreference to display as output
        retrieveUsernamePreferences = getSharedPreferences("userLogin", Context.MODE_PRIVATE)
        val userText  = retrieveUsernamePreferences.getString("text", "")
        userDisp.text = "Username: " + userText

        // retrieves stored data in password SharedPreference to display as output
        retrievePasswordPreferences = getSharedPreferences("passLogin", Context.MODE_PRIVATE)
        val passText = retrievePasswordPreferences.getString("text", "")
        passDisp.text = "Password: " + passText

        // opens edit page to update user info
        editButton.setOnClickListener {
            val intent = Intent(this, EditInfo::class.java)
            startActivity(intent)
        }

        // returns to MainActivity
        backButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
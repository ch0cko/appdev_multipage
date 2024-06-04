package com.example.AllThingsAMD

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Splash : AppCompatActivity() {
    // sets splash screen duration
    private val splashTimeOut: Long = 2000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // opens login screen after splash screen duration ends
        android.os.Handler().postDelayed({
            startActivity(Intent(this, Login::class.java))
            finish()
        }, splashTimeOut)
    }
}
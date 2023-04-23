package com.example.workoutapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class WelcomeActivity : AppCompatActivity() {

    private lateinit var exercise_1: ImageView
    private lateinit var work_out_app: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        exercise_1 = findViewById<ImageView>(R.id.exercise_1)
        work_out_app = findViewById<TextView>(R.id.work_out_app)

        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        },2500)
    }
}
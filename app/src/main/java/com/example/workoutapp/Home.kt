package com.example.workoutapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.workoutapp.databinding.ActivityHomeBinding

class Home : AppCompatActivity() {

    private var binding : ActivityHomeBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        setSupportActionBar(binding?.toolbarHome)

        if(supportActionBar != null){
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
        }

        binding?.exerciseStart?.setOnClickListener{
            val intent = Intent(this, Exerciseact::class.java)
            startActivity(intent)
        }
        binding?.bmiCheck?.setOnClickListener{
            val intent = Intent(this, BmiActivity::class.java)
            startActivity(intent)
        }

    }
}
package com.example.workoutapp

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import android.widget.Toast
import com.example.workoutapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding:ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

//        binding?.bmi?.setOnClickListener{
//            player?.stop()
//            startActivity(Intent(this, BmiCalculator::class.java))
//
//        }

//        try{
//            val soundURI = Uri.parse("android.resource://com.example.workoutapp/"+ R.raw.beliver)
//            player = MediaPlayer.create(applicationContext, soundURI)
//            player?.isLooping = false
//            player?.start()
//        }catch(e:Exception){
//            e.printStackTrace()
//        }

        //val btnStart : Button = findViewById(R.id.btn_Start)
        binding?.btnStart?.setOnClickListener{
            //player?.stop()
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}
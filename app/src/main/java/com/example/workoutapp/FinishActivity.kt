package com.example.workoutapp

import android.content.Intent
import android.graphics.drawable.AnimatedVectorDrawable
import android.media.Image
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.workoutapp.databinding.ActivityFinishBinding
import kotlinx.coroutines.NonCancellable.start

class FinishActivity : AppCompatActivity() {
    private var player: MediaPlayer? = null
    private var binding : ActivityFinishBinding? = null

    //    private var img : Image? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    binding = ActivityFinishBinding.inflate(layoutInflater)
    setContentView(binding?.root)

    setSupportActionBar(binding?.toolbar)


    try{
        val soundURI = Uri.parse("android.resource://com.example.workoutapp/"+ R.raw.beliver)
        player = MediaPlayer.create(applicationContext, soundURI)
        player?.isLooping = false
        player?.start()
    }catch(e:Exception){
        e.printStackTrace()
    }


    if(supportActionBar != null){
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
    binding?.finish?.setOnClickListener{
        player?.stop()
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

}
    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}
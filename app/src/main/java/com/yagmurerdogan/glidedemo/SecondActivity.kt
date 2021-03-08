package com.yagmurerdogan.glidedemo

import android.os.Bundle
import android.widget.ImageView
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions

class SecondActivity : AppCompatActivity() {

    val gifUrl = "https://media.giphy.com/media/IIv3NuURRxgJO/giphy.gif"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val imageGif = findViewById<ImageView>(R.id.image_gif)

        Glide.with(this)
                .load(gifUrl)
                .placeholder(R.drawable.img_placeholder)
                .error(R.drawable.img_placeholder)
                .into(imageGif)

    }
}


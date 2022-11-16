package com.example.imageviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {

    private lateinit var ivUrlPictures: ImageView
    private var btBack: Button? = null
    private lateinit var btNext: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ivUrlPictures = findViewById(R.id.iv_urlPictures)
        btBack = findViewById(R.id.bt_back)
        btNext = findViewById(R.id.bt_next)

        val imageUrl1 = "https://i.imgur.com/tGbaZCY.jpg"
        val imageUrl2 = "https://images.unsplash.com/photo-1666624481302-b466bb943c0b?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=686&q=80"
        val imageUrl3 = "https://images.unsplash.com/photo-1668183261803-e8f2fb7622dd?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=2070&q=80"
        val imageUrl4 = "https://images.unsplash.com/photo-1668211834355-2cdf073f2351?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80"
        val imageUrl5 = "https://images.unsplash.com/photo-1668231778943-08955dfc3afc?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80"
        val imageUrl6 = "https://images.unsplash.com/photo-1668189211722-e711e9fcb7d8?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1169&q=80"
        val imageUrl7 = "https://images.unsplash.com/photo-1661956602153-23384936a1d3?ixlib=rb-4.0.3&ixid=MnwxMjA3fDF8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80"
        val imageUrl8 = "https://images.unsplash.com/photo-1668102577783-b56f2e91b0ff?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80"
        val imageUrl9 = "https://images.unsplash.com/photo-1667838007548-0271625d024b?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1025&q=80"
        val imageUrl10 = "https://images.unsplash.com/photo-1667819475299-bb93172acd9a?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80"

        btBack?.setOnClickListener{
//            Picasso.get().load(imageUrl1).into(ivUrlPictures)
            Glide.with(this).load(imageUrl1).into(ivUrlPictures)

            Glide.with(this).load(imageUrl2).into(ivUrlPictures)
            Glide.with(this).load(imageUrl3).into(ivUrlPictures)
            Glide.with(this).load(imageUrl4).into(ivUrlPictures)
            Glide.with(this).load(imageUrl5).into(ivUrlPictures)
            Glide.with(this).load(imageUrl6).into(ivUrlPictures)
            Glide.with(this).load(imageUrl7).into(ivUrlPictures)
            Glide.with(this).load(imageUrl8).into(ivUrlPictures)
            Glide.with(this).load(imageUrl9).into(ivUrlPictures)
            Glide.with(this).load(imageUrl10).into(ivUrlPictures)

        }

        btNext.setOnClickListener{

            Glide.with(this).load(imageUrl1).into(ivUrlPictures)

            Glide.with(this).load(imageUrl2).into(ivUrlPictures)

            Glide.with(this).load(imageUrl3).into(ivUrlPictures)
            Glide.with(this).load(imageUrl4).into(ivUrlPictures)
            Glide.with(this).load(imageUrl5).into(ivUrlPictures)
            Glide.with(this).load(imageUrl6).into(ivUrlPictures)
            Glide.with(this).load(imageUrl7).into(ivUrlPictures)
            Glide.with(this).load(imageUrl8).into(ivUrlPictures)
            Glide.with(this).load(imageUrl9).into(ivUrlPictures)
            Glide.with(this).load(imageUrl10).into(ivUrlPictures)
        }

    }
}
package com.example.lab5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgHome: ImageView = findViewById(R.id.imgHome)
        val imgUser: ImageView = findViewById(R.id.imgUser)
        val fragmentHome = HomeFragment()
        val fragmentUser = UserFragment()
        imgUser.setOnClickListener {
            imgHome.setImageResource(R.drawable.unselectedhome)
            imgUser.setImageResource(R.drawable.selecteduser)
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView2, fragmentUser)
                commit()
            }
        }
        imgHome.setOnClickListener {
            imgHome.setImageResource(R.drawable.selectedhome)
            imgUser.setImageResource(R.drawable.unselecteduser)
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView2, fragmentHome)
                commit()
            }
        }
    }
}
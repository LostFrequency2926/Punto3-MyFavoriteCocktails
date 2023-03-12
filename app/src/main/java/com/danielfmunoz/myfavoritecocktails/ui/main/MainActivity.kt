package com.danielfmunoz.myfavoritecocktails.ui.main

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.danielfmunoz.myfavoritecocktails.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainBinding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(mainBinding.root)

        mainBinding.button.setOnClickListener {
            val intent = Intent(this, Cocktails1Activity::class.java)
            startActivity(intent)
        }

        mainBinding.button2.setOnClickListener {
            val intent = Intent(this, Cocktails2Activity::class.java)
            startActivity(intent)
        }

        mainBinding.button3.setOnClickListener {
            val intent = Intent(this, Cocktails3Activity::class.java)
            startActivity(intent)
        }

        mainBinding.button4.setOnClickListener {
            val intent = Intent(this, Cocktails4Activity::class.java)
            startActivity(intent)
        }

    }
}
package com.danielfmunoz.myfavoritecocktails.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.danielfmunoz.myfavoritecocktails.R
import com.danielfmunoz.myfavoritecocktails.databinding.ActivityCocktails1Binding
import com.danielfmunoz.myfavoritecocktails.databinding.ActivityMainBinding

class Cocktails1Activity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityCocktails1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainBinding = ActivityCocktails1Binding.inflate(layoutInflater)

        setContentView(mainBinding.root)

        mainBinding.btnVolver.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
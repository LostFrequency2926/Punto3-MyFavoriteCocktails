package com.danielfmunoz.myfavoritecocktails.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.danielfmunoz.myfavoritecocktails.R
import com.danielfmunoz.myfavoritecocktails.databinding.ActivityCocktails3Binding
import com.danielfmunoz.myfavoritecocktails.databinding.ActivityMainBinding

class Cocktails3Activity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityCocktails3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainBinding = ActivityCocktails3Binding.inflate(layoutInflater)

        setContentView(mainBinding.root)

        mainBinding.fabBackToMain.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
package com.danielfmunoz.myfavoritecocktails.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.danielfmunoz.myfavoritecocktails.R
import com.danielfmunoz.myfavoritecocktails.databinding.ActivityAgeValidatorBinding
import java.util.*

class AgeValidatorActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAgeValidatorBinding
    private lateinit var mainViewModel: AgeValidatorViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityAgeValidatorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainViewModel = ViewModelProvider(this).get(AgeValidatorViewModel::class.java)

        val datePicker = binding.datePicker
        val button = binding.enterButton

        button.setOnClickListener {
            val calendar = Calendar.getInstance()
            calendar.set(datePicker.year, datePicker.month, datePicker.dayOfMonth)
            val date = calendar.time

            if (mainViewModel.isAdult(date)) {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Debes ser mayor de edad para continuar", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
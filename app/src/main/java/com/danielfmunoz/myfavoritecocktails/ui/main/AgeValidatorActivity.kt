package com.danielfmunoz.myfavoritecocktails.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.danielfmunoz.myfavoritecocktails.R
import com.danielfmunoz.myfavoritecocktails.databinding.ActivityAgeValidatorBinding
import java.util.*

class AgeValidatorActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAgeValidatorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityAgeValidatorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val datePicker = binding.datePicker
        val button = binding.enterButton

        button.setOnClickListener {
            val calendar = Calendar.getInstance()
            calendar.set(datePicker.year, datePicker.month, datePicker.dayOfMonth)
            val date = calendar.time

            if (isAdult(date)) {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Debes ser mayor de edad para continuar", Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun isAdult(date: Date): Boolean {
        val calendar = Calendar.getInstance()
        calendar.time = date
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)

        val today = Calendar.getInstance()
        var age = today.get(Calendar.YEAR) - year

        if (today.get(Calendar.MONTH) < month ||
            (today.get(Calendar.MONTH) == month && today.get(Calendar.DAY_OF_MONTH) < day)) {
            age--
        }

        return age >= 18
    }



}
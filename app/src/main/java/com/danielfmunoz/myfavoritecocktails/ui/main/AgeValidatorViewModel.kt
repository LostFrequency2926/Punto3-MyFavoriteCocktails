package com.danielfmunoz.myfavoritecocktails.ui.main

import androidx.lifecycle.ViewModel
import java.util.*

class AgeValidatorViewModel : ViewModel() {

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
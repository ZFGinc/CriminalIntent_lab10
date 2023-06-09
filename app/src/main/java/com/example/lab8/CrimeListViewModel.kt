package com.example.lab8

import androidx.lifecycle.ViewModel
import kotlin.random.Random

class CrimeListViewModel : ViewModel() {

    private val crimeRepository = CrimeRepository.get()
    val crimeListLiveData = crimeRepository.getCrimes()
}
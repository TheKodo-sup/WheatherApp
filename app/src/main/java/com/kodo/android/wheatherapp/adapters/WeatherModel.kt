package com.kodo.android.wheatherapp.adapters

data class WeatherModel(
    val city: String,
    val time: String,
    val condition: String,
    val currentTemp: String,
    val minTemp: String,
    val maxTemp: String,
    val imageUrl: String,
    val hours: String
)

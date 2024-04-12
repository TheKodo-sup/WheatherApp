package com.kodo.android.wheatherapp

import java.util.concurrent.locks.Condition

data class DayIatem(
    val city: String,
    val time: String,
    val condition: String,
    val currentTemp: String,
    val maxTemp: String,
    val minTemp: String,
    val hours: String
)

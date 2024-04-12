package com.kodo.android.wheatherapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kodo.android.wheatherapp.adapters.WeatherModel

class MainViewModel: ViewModel() {
    val liveDataCurrent = MutableLiveData<WeatherModel>()
    val liveDataList = MutableLiveData<List<WeatherModel>>()
}
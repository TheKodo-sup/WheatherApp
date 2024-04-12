package com.kodo.android.wheatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.kodo.android.wheatherapp.databinding.ActivityMainBinding
import com.android.volley.Request
import com.kodo.android.wheatherapp.fragments.MainFragment
import org.json.JSONObject

const val API_KEY = "c8c38fbb1d6745aaac0132001241104"

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction().replace(R.id.placeHolder, MainFragment.newInstance()).commit()
    }
}
package com.example.week2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.week2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.picker.maxValue = 1000
        binding.picker.minValue = 0
        binding.picker.value = 999


        setContentView(binding.root)

    }

    lateinit var binding: ActivityMainBinding

}

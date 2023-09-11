package com.example.week4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.week4.databinding.ActivityDonationLinearBinding

class DonationLinear : AppCompatActivity() {
    private lateinit var binding: ActivityDonationLinearBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDonationLinearBinding.inflate(layoutInflater)

        binding.picker.maxValue = 1000
        binding.picker.minValue = 0
        binding.picker.value = 999

        setContentView(binding.root)
    }
}
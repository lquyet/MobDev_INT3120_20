package com.example.week4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.week4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.apply {
            donation.setOnClickListener {
                startActivity(Intent(this@MainActivity, Donation::class.java))
            }
            essentials.setOnClickListener {
                startActivity(Intent(this@MainActivity, Essential::class.java))
            }
        }
        setContentView(binding.root)
    }
}
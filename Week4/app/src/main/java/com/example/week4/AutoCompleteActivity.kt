package com.example.week4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.week4.databinding.ActivityAutoCompleteBinding

class AutoCompleteActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAutoCompleteBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAutoCompleteBinding.inflate(layoutInflater)


        setContentView(binding.root)
    }
}
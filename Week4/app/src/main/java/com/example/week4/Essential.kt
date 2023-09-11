package com.example.week4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.week4.databinding.ActivityEssentialBinding

class Essential : AppCompatActivity() {
    private lateinit var binding: ActivityEssentialBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEssentialBinding.inflate(layoutInflater)

        binding.apply {
            linearEssential.setOnClickListener {
                startActivity(Intent(this@Essential, EssentialLinear::class.java))
            }
            constraintEssential.setOnClickListener {
                startActivity(Intent(this@Essential, EssentialConstraint::class.java))
            }
            relativeEssential.setOnClickListener {
                startActivity(Intent(this@Essential, EssentialRelative::class.java))
            }
            tableEssential.setOnClickListener {
                startActivity(Intent(this@Essential, EssentialTable::class.java))
            }
        }

        setContentView(binding.root)
    }
}
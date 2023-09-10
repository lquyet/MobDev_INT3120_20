package com.example.week3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.week3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.apply {
            constraints.setOnClickListener {
                startActivity(Intent(this@MainActivity, ConstraintsActivity::class.java))
            }
            linear.setOnClickListener{
                startActivity(Intent(this@MainActivity, LinearActivity::class.java))
            }
            relative.setOnClickListener{
                startActivity(Intent(this@MainActivity, RelativeActivity::class.java))
            }
            table.setOnClickListener{
                startActivity(Intent(this@MainActivity, TableActivity::class.java))
            }
            abs.setOnClickListener{
                startActivity(Intent(this@MainActivity, AbsoluteActivity::class.java))
            }
        }
        setContentView(binding.root)
    }
}
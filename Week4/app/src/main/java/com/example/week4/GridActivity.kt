package com.example.week4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.week4.databinding.ActivityGridBinding

class GridActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGridBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGridBinding.inflate(layoutInflater)

        var adapter: ArrayAdapter<*>
        var list = arrayOf("1", "2", "3", "4", "5")
        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, list)
        binding.gridview.adapter = adapter
        setContentView(binding.root)
    }
}
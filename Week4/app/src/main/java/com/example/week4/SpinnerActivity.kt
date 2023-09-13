package com.example.week4

import android.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.example.week4.databinding.ActivitySpinnerBinding

class SpinnerActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySpinnerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySpinnerBinding.inflate(layoutInflater)

        var adapter: ArrayAdapter<*>
        var list = arrayOf("1", "2", "3", "4", "5")
        adapter = ArrayAdapter(this, R.layout.simple_list_item_1, list)
        binding.spinnerView.adapter = adapter

        binding.spinnerView.onItemClickListener = object : AdapterView.OnItemSelectedListener,
            AdapterView.OnItemClickListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                binding.spinnerValue.text = binding.spinnerView.selectedItem.toString()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                binding.spinnerValue.text = "Nothing selected"
            }

            override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

            }
        }

        setContentView(binding.root)
    }
}
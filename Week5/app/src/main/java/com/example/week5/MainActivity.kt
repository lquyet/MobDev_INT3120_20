package com.example.week5

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.icu.text.DateFormat
import android.icu.util.Calendar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import android.widget.TextView
import android.widget.TimePicker
import com.example.week5.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.btnDate.setOnClickListener {
            showDatePickerDialog()
        }
        binding.btnTime.setOnClickListener {
            showTimePickerDialog()
        }

        setContentView(binding.root)
    }

    private fun showDatePickerDialog() {
        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog = DatePickerDialog(
            this,
            DatePickerDialog.OnDateSetListener { _: DatePicker, selectedYear: Int, selectedMonth: Int, selectedDay: Int ->
                // Handle the selected date
                val selectedDate = "$selectedDay/${selectedMonth + 1}/$selectedYear"
                binding.text.text = selectedDate
            },
            year,
            month,
            day
        )

        datePickerDialog.show()
    }

    private fun showTimePickerDialog() {
        val calendar = Calendar.getInstance()
        val hour = calendar.get(Calendar.HOUR_OF_DAY)
        val minute = calendar.get(Calendar.MINUTE)

        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { _: TimePicker, selectedHour: Int, selectedMinute: Int ->
                // Handle the selected time
                val selectedTime = String.format("%02d:%02d", selectedHour, selectedMinute)
                binding.text.text = selectedTime
            },
            hour,
            minute,
            true
        )

        timePickerDialog.show()
    }
}
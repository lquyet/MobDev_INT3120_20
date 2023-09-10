package com.example.week4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.week4.databinding.ActivityDonationBinding

class Donation : AppCompatActivity() {

    private lateinit var binding: ActivityDonationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDonationBinding.inflate(layoutInflater)

        binding.apply {
            linearDonation.setOnClickListener {
                startActivity(Intent(this@Donation, DonationLinear::class.java))
            }
            constraintDonation.setOnClickListener {
                startActivity(Intent(this@Donation, DonationConstraint::class.java))
            }
            relativeDonation.setOnClickListener {
                startActivity(Intent(this@Donation, DonationRelative::class.java))
            }
            tableDonation.setOnClickListener {
                startActivity(Intent(this@Donation, DonationTable::class.java))
            }
        }


        setContentView(binding.root)
    }
}
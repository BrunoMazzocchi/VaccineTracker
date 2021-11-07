package com.example.vaccinetracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vaccinetracker.databinding.ActivityMainBinding
import com.example.vaccinetracker.databinding.ActivityRegisterFormBinding

class RegisterForm : AppCompatActivity() {
    lateinit var binding: ActivityRegisterFormBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityRegisterFormBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}
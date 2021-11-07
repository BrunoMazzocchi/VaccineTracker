package com.example.vaccinetracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vaccinetracker.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.btnRegistrar.setOnClickListener({
            registerForm()
        })
        binding.btnEstadisticas.setOnClickListener({
            estadistica()
        })
    }

    private fun registerForm(){
        startActivity(Intent(this, RegisterForm::class.java))
    }

    private fun estadistica(){
        startActivity(Intent(this, Estadistica::class.java))
    }
}
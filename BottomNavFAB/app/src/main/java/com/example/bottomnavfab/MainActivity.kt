package com.example.bottomnavfab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bottomnavfab.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.bottomNav.background = null
        binding.bottomNav.menu.getItem(2).isEnabled = true

    }



}
package com.example.practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.practice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding // *바인딩 구문

    override fun onCreate(savedInstanceState: Bundle?) { // 앱이 최초 실행할 때 수행
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater) // *바인딩 구문
        val view = binding.root // *바인딩 구문
        setContentView(view)

        binding.testText.text = "안녕하세요."

        binding.button.setOnClickListener { // editT에 입력되어 있는 값을 가지고 와서 testText에 뿌려줌
            var resultText = binding.editT.text.toString() // resultText 변수 생성
            binding.testText.setText(resultText)
        }

        
        
    }
}
package com.example.navigationkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.core.view.GravityCompat
import com.example.navigationkt.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnNevi.setOnClickListener {
            binding.layoutdrawer.openDrawer(GravityCompat.START) // START : left, END : right
        }

        binding.naviView.setNavigationItemSelectedListener(this) // 네비게이션 메뉴 아이템에 클릭 속성 부여**

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean { // 네비게이션 메뉴 클릭 시 수행
        when (item.itemId)
        {
            R.id.access -> Toast.makeText(applicationContext, "접근성", Toast.LENGTH_SHORT).show()
            R.id.email -> Toast.makeText(applicationContext, "이메일", Toast.LENGTH_SHORT).show()
            R.id.send -> Toast.makeText(applicationContext, "메시지", Toast.LENGTH_SHORT).show()
        }
        binding.layoutdrawer.closeDrawers() // 네비게이션 뷰 닫기
        return false

    }
    override fun onBackPressed() {
        if (binding.layoutdrawer.isDrawerOpen(GravityCompat.START)) {

            binding.layoutdrawer.closeDrawers()
        }
        else {
            super.onBackPressed()
        }
    }
}
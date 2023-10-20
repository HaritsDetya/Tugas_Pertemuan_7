package com.example.tugas_pertemuan_7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tugas_pertemuan_7.databinding.ActivityMainBinding
import com.example.tugas_pertemuan_7.databinding.HomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: HomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = HomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding) {
        }
    }
}
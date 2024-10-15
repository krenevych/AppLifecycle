package com.example.applifecycle

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.applifecycle.databinding.ActivitySecondBinding
import com.example.applifecycle.databinding.ActivityTransparantBinding

class TransparantActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTransparantBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTransparantBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }
}
package com.example.applifecycle

import android.os.Bundle
import android.util.Log
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

        Log.d(TAG, "onCreate: ${this::class.simpleName}")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: ${this::class.simpleName}")
    }

    override fun onResume() {
        super.onResume()

        Log.d(TAG, "onResume: ${this::class.simpleName}")

    }

    override fun onPause() {
        super.onPause()

        Log.d(TAG, "onPause: ${this::class.simpleName}")

    }

    override fun onStop() {
        super.onStop()

        Log.d(TAG, "onStop: ${this::class.simpleName}")

    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d(TAG, "onDestroy: ${this::class.simpleName}")

    }
}
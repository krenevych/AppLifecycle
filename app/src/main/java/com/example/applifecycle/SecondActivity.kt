package com.example.applifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.applifecycle.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStartTransparentActivity.setOnClickListener {
            val intent = Intent(this, TransparantActivity::class.java)
            startActivity(intent)
        }

        Log.d(TAG, "onCreate: ${this::class.simpleName}")

    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: ${this::class.simpleName}")
    }

    override fun onResume() {
        super.onResume()

        Log.d(TAG, "onResume: ${this::class.simpleName}")

        binding.progressBar.visibility = View.VISIBLE
    }

    override fun onPause() {
        super.onPause()

        Log.d(TAG, "onPause: ${this::class.simpleName}")

        binding.progressBar.visibility = View.GONE
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
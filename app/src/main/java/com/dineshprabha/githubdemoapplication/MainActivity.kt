package com.dineshprabha.githubdemoapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.dineshprabha.githubdemoapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.ClickMe.setOnClickListener {

            Toast.makeText(this, "Hey There...", Toast.LENGTH_SHORT).show()
            Toast.makeText(this, "This is development branch", Toast.LENGTH_SHORT).show()
        }



    }
}
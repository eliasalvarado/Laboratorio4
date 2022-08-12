package com.example.laboratorio4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn = findViewById(R.id.button)
        initListeners()
    }

    private fun initListeners() {
        btn.setOnClickListener{
            Toast.makeText(applicationContext, "Elías Alberto Alvarado Raxón", Toast.LENGTH_LONG).show()
        }
    }
}
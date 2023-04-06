package com.example.task

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.konstantin_khomeriki_hw_1.R
import com.example.konstantin_khomeriki_hw_1.Second_page

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.register_button)
        val intent = Intent(this, Second_page::class.java)
        button.setOnClickListener {
            startActivity(intent)
        }
    }
}
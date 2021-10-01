package com.example.form

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val linearButton = findViewById<Button>(R.id.linearBtn)
        linearButton.setOnClickListener {
            val intent = Intent(this, LinearlayoutForm::class.java)
            startActivity(intent)
        }

        val constraintButton = findViewById<Button>(R.id.constraintBtn)
        constraintButton.setOnClickListener {
            val intent = Intent(this, ConstraintLayoutForm::class.java)
            startActivity(intent)
        }

        val relativeButton = findViewById<Button>(R.id.relativeBtn)
        relativeButton.setOnClickListener {
            val intent = Intent(this, RelativeLayoutForm::class.java)
            startActivity(intent)
        }
    }

}
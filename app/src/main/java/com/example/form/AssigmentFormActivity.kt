package com.example.form

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class AssigmentFormActivity : AppCompatActivity() {

    private lateinit var registerBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_assigment_form)

        registerBtn = findViewById(R.id.register_Button)
        registerBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            Toast.makeText(this,"Choose a Layout",Toast.LENGTH_SHORT).show()

        }
    }
}
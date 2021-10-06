package com.example.form

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btnLayouts: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLayouts = findViewById(R.id.btnLayouts)

        btnLayouts.setOnClickListener {
                loadFormFragment()
        }

    /*val linearButton = findViewById<Button>(R.id.linearBtn)
        linearButton.setOnClickListener {
            val intent = Intent(this, LinearlayoutFormActivity::class.java)
            startActivity(intent)
        }

        val constraintButton = findViewById<Button>(R.id.constraintBtn)
        constraintButton.setOnClickListener {
            val intent = Intent(this, ConstraintLayoutFormActivity::class.java)
            startActivity(intent)
        }

        val relativeButton = findViewById<Button>(R.id.relativeBtn)
        relativeButton.setOnClickListener {
            val intent = Intent(this, RelativeLayoutFormActivity::class.java)
            startActivity(intent)
        }*/
    }

    private fun loadFormFragment() {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.frameLayoutButtons, ButtonsFragment())
        fragmentTransaction.commit()
    }

}
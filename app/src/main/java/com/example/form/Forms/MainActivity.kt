package com.example.form.Forms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.form.R
import com.example.form.RecyclerView.TestData

class MainActivity : AppCompatActivity() {

    private lateinit var btnLayouts: Button

    //private var position: Int = -1
    private var testData: TestData? = null

    private lateinit var positionTV: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLayouts = findViewById(R.id.btnLayouts)

        btnLayouts.setOnClickListener {
                loadFormFragment()
        }
        positionTV = findViewById(R.id.positionTV)

        testData = intent.getParcelableExtra("testData")

        positionTV.text = testData?.nameTV ?: "Name"
        /*position = intent.getIntExtra("position", -1)

        Toast.makeText(this, "Position -> $position", Toast.LENGTH_LONG)

        positionTV.text = "$position " + "Position"*/

    }

    private fun loadFormFragment() {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.frameLayoutButtons, ButtonsFragment())
        fragmentTransaction.commit()
    }

}
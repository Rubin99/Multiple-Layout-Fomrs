package com.example.form

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.form.Forms.MainActivity
import com.example.form.RecyclerView.TestRecyclerViewActivity

class AssigmentFormActivity : AppCompatActivity() {

    private lateinit var registerBtn: Button
    private lateinit var recyclerBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_assigment_form)

        registerBtn = findViewById(R.id.register_Button)
        recyclerBtn = findViewById(R.id.recyclerViewButton)

        registerBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            Toast.makeText(this,"Choose a Layout",Toast.LENGTH_SHORT).show()

        }
        recyclerBtn.setOnClickListener {
            val intentRV = Intent(this, TestRecyclerViewActivity::class.java)
            startActivity(intentRV)
            Toast.makeText(this,"Recycler View",Toast.LENGTH_SHORT).show()
        }
    }
}
package com.example.form.RecyclerView

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.form.AssigmentFormActivity
import com.example.form.Forms.MainActivity
import com.example.form.R

class TestRecyclerViewActivity : AppCompatActivity() {

    private lateinit var testAdapter: TestAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var testDataList: MutableList<TestData>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_recycler_view)

        recyclerView = findViewById(R.id.recyclerView)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        testDataList = ArrayList()
        testDataList.add(TestData(R.drawable.logo1, "Rubin Shrestha", "rubinshrestha14@gmail.com", 22))
        testDataList.add(TestData(R.drawable.logo2, "Jane Doe", "janedoe@gmail.com", 21))
        testDataList.add(TestData(R.drawable.logo3, "John Doe", "johndoe@gmail.com", 23))

        testAdapter = TestAdapter(this, testDataList){ position ->

            val testData = testDataList[position]
            val intent = Intent(this, MainActivity :: class.java)
            intent.putExtra("testData", testData)
            startActivity(intent)
        }
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = testAdapter
    }
}
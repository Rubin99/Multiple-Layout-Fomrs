package com.example.form.RecyclerView

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.form.R
import com.example.form.inflate

class TestAdapter (
    private val context: Context, private val testDataList: MutableList<TestData>
    ) : RecyclerView.Adapter<TestViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        TestViewHolder(parent.inflate(R.layout.items_list))

    override fun onBindViewHolder(holder: TestViewHolder, position: Int) {
        val testData = testDataList[position]

        holder.profileIV.setImageDrawable(context.getDrawable(testData.profileIV))
        holder.nameTV.text = testData.nameTV
        holder.emailTV.text = testData.emailTV
        holder.ageTV.text = testData.ageTV.toString()
    }

    override fun getItemCount() = testDataList.count()
}
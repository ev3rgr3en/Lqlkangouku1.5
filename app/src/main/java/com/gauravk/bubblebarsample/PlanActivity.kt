package com.gauravk.bubblebarsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PlanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plan)
        val tvnum: TextView? = findViewById(R.id.num_text)
        val tvdays: TextView? = findViewById(R.id.days_text)
        val bundle:Bundle?=intent.extras
        val num: Int =bundle!!.getInt("number")
        val days: Int=bundle!!.getInt("days")
        tvnum?.text = "词汇数量:"+num
        tvdays?.text="计划天数:"+days
    }
}
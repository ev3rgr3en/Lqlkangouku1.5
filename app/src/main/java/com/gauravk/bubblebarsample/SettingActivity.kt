package com.gauravk.bubblebarsample

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.gauravk.bubblebarsample.fragment.ScreenSlidePageFragment

@SuppressLint("WrongViewCast")
class SettingActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)
        val tv: TextView? = findViewById(R.id.textView)
        val intent = Intent()
        val num=intent.getStringExtra("词汇数量")
        tv?.text = num
    }

}
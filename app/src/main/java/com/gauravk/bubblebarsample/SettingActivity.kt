package com.gauravk.bubblebarsample

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_setting.*
import kotlinx.android.synthetic.main.fragment_screen_slide_page.*

@SuppressLint("WrongViewCast")
class SettingActivity : AppCompatActivity() {
    private lateinit var btn: Button
    private var a = 0
    private var num: Int = 0
    private var days: Int = 0
    private var inp: Int = 0

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)
        val tv: TextView? = findViewById(R.id.textView)
        val tvp: TextView? = findViewById(R.id.predict_text)
        val bundle: Bundle? = intent.extras
        val enteredString = readLine()?.toInt()
        val input = findViewById<EditText>(R.id.textInputEditText)
        inp = input.text.get().toInt()
        num = bundle!!.getInt("number")
        tv?.text = "词汇数量:$num"
        tvp?.text = "预测学习天数:"+num/ enteredString!!
        btn = findViewById(R.id.setting_button)
//        val input = findViewById<EditText>(R.id.textInputEditText)
//        inp =input.text.toInt()
        setting_button.setOnClickListener {
            days = num / enteredString
            val intent = Intent()
            intent.setClass(this, PlanActivity::class.java)
            intent.putExtra("days", days)
            intent.putExtra("number", num)
            startActivity(intent)
        }
//       inflatedView.setBackgroundColor(ContextCompat.getColor( this, #e57373))


    }

}


//    fun days(){
//        var input= findViewById<EditText>(R.id.textInputEditText)
//        val inp=input.text
//        val bundle:Bundle?=intent.extras
//        val num:Int=bundle!!.getInt("number")
//        a = (num / inp) as Int
//        val tvp: TextView? = findViewById(R.id.predict_text)
//        tvp?.text="预测学习天数:"+a
//}
//    fun  onclick(){
//        var input= findViewById<EditText>(R.id.textInputEditText)
//        val inp=input.text
//        setting_button.setOnClickListener() {
//            val bundle:Bundle?=intent.extras
//            val num:Int=bundle!!.getInt("number")
//            val days:Int= num/inp
//            val intent = Intent()
//            intent.setClass(this, PlanActivity::class.java)
//            intent.putExtra("days", days)
//            intent.putExtra("number",num)
//            startActivity(intent)
//        }
//    }











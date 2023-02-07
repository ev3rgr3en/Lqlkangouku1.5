package com.gauravk.bubblebarsample

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_setting.*
import kotlinx.android.synthetic.main.fragment_screen_slide_page.*

@SuppressLint("WrongViewCast")
class SettingActivity : AppCompatActivity() {
    private lateinit var btn : Button
    var a=0
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)
        val tv: TextView? = findViewById(R.id.textView)
        val tvp: TextView? = findViewById(R.id.predict_text)
        val bundle:Bundle?=intent.extras
        val num: Int =bundle!!.getInt("number")
        tv?.text = "词汇数量:"+num
        tvp?.text="预测学习天数:"+a
//       inflatedView.setBackgroundColor(ContextCompat.getColor( this, #e57373))

        btn=findViewById(R.id.setting_button)
        var input= findViewById<EditText>(R.id.textInputEditText)
        val inp=input.text
        setting_button.setOnClickListener() {
            val days:Int= num/inp
            val intent = Intent()
            intent.setClass(this, PlanActivity::class.java)
            intent.putExtra("days", days)
            intent.putExtra("number",num)
            startActivity(intent)
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
}

private operator fun Int.div(inp: Editable?): Int {
        return (1)
}









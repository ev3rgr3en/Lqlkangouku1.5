package com.gauravk.bubblebarsample.fragment

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.content.ContextCompat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gauravk.bubblebarsample.R
import com.gauravk.bubblebarsample.SettingActivity

import kotlinx.android.synthetic.main.fragment_screen_slide_page.*

private const val ARG_TITLE = "arg_title"
private const val ARG_BG_COLOR = "arg_bg_color"

/**
 * A simple [Fragment] subclass.
 * Use the [ScreenSlidePageFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class ScreenSlidePageFragment : Fragment() {
    private var title: String? = "Default title."
    private var bgColorResId: Int = R.color.blue_inactive

    private lateinit var inflatedView: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            title = it.getString(ARG_TITLE)
            bgColorResId = it.getInt(ARG_BG_COLOR)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        inflatedView = inflater.inflate(R.layout.fragment_screen_slide_page, container, false)
        return inflatedView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        inflatedView.setBackgroundColor(ContextCompat.getColor(context!!, bgColorResId))
        screen_slide_button1.text = title+"初级词汇"
        screen_slide_button2.text = title+"中级词汇"
        screen_slide_button3.text = title+"高级词汇"

        when(title) {

            "四级词汇" -> {
                screen_slide_button1.setOnClickListener() {
                    val intent = Intent()
                    intent.setClass(this.context, SettingActivity::class.java)
                    startActivity(intent)
                    intent.putExtra("初级词汇数量", 391);
                }
                screen_slide_button2.setOnClickListener() {
                    val intent = Intent()
                    intent.setClass(this.context, SettingActivity::class.java)
                    startActivity(intent)
                    intent.putExtra("中级词汇数量", 492);
                }
                screen_slide_button3.setOnClickListener() {
                    val intent = Intent()
                    intent.setClass(this.context, SettingActivity::class.java)
                    startActivity(intent)
                    intent.putExtra("高级词汇量", 666);
                }
            }
            "六级词汇" -> {
                screen_slide_button1.setOnClickListener() {
                    val intent = Intent()
                    intent.setClass(this.context, SettingActivity::class.java)
                    startActivity(intent)
                    intent.putExtra("初级词汇数量", 491);
                }
                screen_slide_button2.setOnClickListener() {
                    val intent = Intent()
                    intent.setClass(this.context, SettingActivity::class.java)
                    startActivity(intent)
                    intent.putExtra("中级词汇数量", 592);
                }
                screen_slide_button3.setOnClickListener() {
                    val intent = Intent()
                    intent.setClass(this.context, SettingActivity::class.java)
                    startActivity(intent)
                    intent.putExtra("高级词汇量", 766);
                }
            }
            "TOLEF"->{
                screen_slide_button1.setOnClickListener() {
                    val intent = Intent()
                    intent.setClass(this.context, SettingActivity::class.java)
                    startActivity(intent)
                    intent.putExtra("初级词汇数量", 591);
                }
                screen_slide_button2.setOnClickListener() {
                    val intent = Intent()
                    intent.setClass(this.context, SettingActivity::class.java)
                    startActivity(intent)
                    intent.putExtra("中级词汇数量", 692);
                }
                screen_slide_button3.setOnClickListener() {
                    val intent = Intent()
                    intent.setClass(this.context, SettingActivity::class.java)
                    startActivity(intent)
                    intent.putExtra("高级词汇量", 866);
                }
            }
        }
//            }
//            screen_slide_button1.setOnClickListener() {
//                val intent = Intent()
//                intent.setClass(this.context, SettingActivity::class.java)
//                startActivity(intent)
//                intent.putExtra("初级词汇数量", 391);
//            }
//            screen_slide_button2.setOnClickListener (){
//                val intent = Intent()
//                intent.setClass(this.context, SettingActivity::class.java)
//                startActivity(intent)
//                intent.putExtra("中级词汇数量", 492);
//            }
//            screen_slide_button3 . setOnClickListener (){
//                val intent = Intent()
//                intent.setClass(this.context, SettingActivity::class.java)
//                startActivity(intent)
//                intent.putExtra("request_content", screen_slide_button3.text.toString());
//        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param title Title parameter
         * @param bgColorId Background Color
         * @return A new instance of fragment ScreenSlidePageFragment.
         */
        @JvmStatic
        fun newInstance(title: String, bgColorId: Int) =
            ScreenSlidePageFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_TITLE, title)
                    putInt(ARG_BG_COLOR, bgColorId)
                }
            }
    }
}

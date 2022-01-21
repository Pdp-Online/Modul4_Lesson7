package com.example.m4_l7kotlin

import android.graphics.Color
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.HashMap

class Task6Activity : AppCompatActivity() {
    var tvTask6: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task6)
        initViews()
    }

    private fun initViews() {
        tvTask6 = findViewById(R.id.tv_task6)
        val text = "I would like to do something similar to the https://twitter.com app"
        setLink(text)

//        Map<String, Integer> map = findLink(text);
//        Log.d("mapim", map.toString());
    }

    private fun setLink(text: String) {
        val map = findLink(text)
        val spannable: Spannable = SpannableString(text)
        for ((key, value) in map) {
            spannable.setSpan(
                ForegroundColorSpan(Color.BLUE),
                value, value + key.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
            )
        }
        tvTask6!!.text = spannable
    }

    private fun findLink(text: String): Map<String, Int> {
        val map: MutableMap<String, Int> = HashMap()
        val res = text.split(" ").toTypedArray()
        var sum = 0
        for (i in res.indices) {
            if (res[i].contains("https://") || res[i].contains("http://")) {
                map[res[i]] = sum + i
            }
            sum += res[i].length
        }
        return map
    }
}
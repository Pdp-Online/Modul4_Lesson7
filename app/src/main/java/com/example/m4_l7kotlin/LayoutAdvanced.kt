package com.example.m4_l7kotlin

import android.graphics.Color
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LayoutAdvanced : AppCompatActivity() {
    var tvSpantactic: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout_advanced)
        initViews()
    }

    private fun initViews() {
        tvSpantactic = findViewById(R.id.tv_spantastic)
        val text =
            "I know just how to #whisper, And I know just how to cry, I know just where to find the answers"
        val spannable: Spannable = SpannableString(text)
        spannable.setSpan(
            ForegroundColorSpan(Color.BLUE),
            18,
            27,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        tvSpantactic!!.setText(spannable)
    }
}
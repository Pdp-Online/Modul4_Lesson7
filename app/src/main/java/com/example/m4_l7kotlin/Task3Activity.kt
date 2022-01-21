package com.example.m4_l7kotlin

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Task3Activity : AppCompatActivity() {
    var tvEdit: TextView? = null
    var editText: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task3)
        initViews()
    }

    private fun initViews() {
        tvEdit = findViewById(R.id.tv_edit)
        editText = findViewById(R.id.editText_1)
        editText!!.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {}
            override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
                tvEdit!!.setText(editText!!.getText())
            }

            override fun afterTextChanged(editable: Editable) {}
        })
    }
}
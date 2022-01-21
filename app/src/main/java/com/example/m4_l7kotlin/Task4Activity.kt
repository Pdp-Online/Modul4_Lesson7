package com.example.m4_l7kotlin

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Task4Activity : AppCompatActivity() {
    var tvEdit: TextView? = null
    var editText: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task4)
        initViews()
    }

    private fun initViews() {
        tvEdit = findViewById(R.id.tv_edit4)
        editText = findViewById(R.id.et_task4)
        editText!!.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {}
            override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
                tvEdit!!.setText(charSequence)
            }

            override fun afterTextChanged(editable: Editable) {}
        })
        editText!!.setOnKeyListener(View.OnKeyListener { view, i, keyEvent ->
            if (view === tvEdit) {
                true
            } else false
        })
    }
}
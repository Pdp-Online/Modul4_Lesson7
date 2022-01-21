package com.example.m4_l7kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var buttonLayoutAdvanced: Button? = null
    var buttonTask1: Button? = null
    var buttonTask2: Button? = null
    var buttonTask3: Button? = null
    var buttonTask4: Button? = null
    var buttonTask5: Button? = null
    var buttonTask6: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        buttonLayoutAdvanced = findViewById(R.id.button_layout_advanced)
        buttonTask1 = findViewById(R.id.button_task1_page)
        buttonTask2 = findViewById(R.id.button_task2_page)
        buttonTask3 = findViewById(R.id.button_task3_page)
        buttonTask4 = findViewById(R.id.button_task4_page)
        buttonTask5 = findViewById(R.id.button_task5_page)
        buttonTask6 = findViewById(R.id.button_task6_page)
        buttonLayoutAdvanced!!.setOnClickListener(View.OnClickListener { v: View? -> openLayoutAdvanced() })
        buttonTask1!!.setOnClickListener(View.OnClickListener { v: View? -> openTask1() })
        buttonTask2!!.setOnClickListener(View.OnClickListener { v: View? -> openTask2() })
        buttonTask3!!.setOnClickListener(View.OnClickListener { v: View? -> openTask4() })
        buttonTask4!!.setOnClickListener(View.OnClickListener { v: View? -> openTask3() })
        buttonTask5!!.setOnClickListener(View.OnClickListener { v: View? -> openTask5() })
        buttonTask6!!.setOnClickListener(View.OnClickListener { v: View? -> openTask6() })
    }

    private fun openLayoutAdvanced() {
        val intent = Intent(this, LayoutAdvanced::class.java)
        startActivity(intent)
    }

    private fun openTask1() {
        val intent = Intent(this, Task1Activity::class.java)
        startActivity(intent)
    }

    private fun openTask2() {
        val intent = Intent(this, Task2Activity::class.java)
        startActivity(intent)
    }

    private fun openTask3() {
        val intent = Intent(this, Task3Activity::class.java)
        startActivity(intent)
    }

    private fun openTask4() {
        val intent = Intent(this, Task4Activity::class.java)
        startActivity(intent)
    }

    private fun openTask5() {
        val intent = Intent(this, Task5Activity::class.java)
        startActivity(intent)
    }

    private fun openTask6() {
        val intent = Intent(this, Task6Activity::class.java)
        startActivity(intent)
    }
}
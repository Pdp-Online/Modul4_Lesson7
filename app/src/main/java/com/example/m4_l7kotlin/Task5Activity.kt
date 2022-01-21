package com.example.m4_l7kotlin

import android.graphics.Color
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.ArrayList
import java.util.HashMap

class Task5Activity : AppCompatActivity() {
    var tvTask5: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task5)
        initViews()
    }

    private fun initViews() {
        tvTask5 = findViewById(R.id.tv_task5)
        val text = "I would #like to  do #something similar to the #Twitter app"
        setHashtag(text)

        //        Map<Integer, Integer> map = findIndexes2(text);
        //        Log.d("map", map.toString());
    }

    private fun setHashtag(text: String) {
        val spannable: Spannable = SpannableString(text)

        // 1
//        List<Integer> list = findIndexes(text);
//                for (int i = 0; i < list.size() - 1; i+=2) {
//            spannable.setSpan(new ForegroundColorSpan(Color.BLUE), list.get(i), list.get(i + 1), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//
//        }

        // 2
        val map = findIndexes2(text)
        for ((key, value) in map) {
            spannable.setSpan(
                ForegroundColorSpan(Color.BLUE),
                key, value, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
            )
        }

        // 3
//        Map<Integer, String> map = findHashtag2(text);
//        for (Map.Entry<Integer, String> entry : map.entrySet()) {
//            spannable.setSpan(new ForegroundColorSpan(Color.BLUE), entry.getKey(), entry.getKey() + entry.getValue().length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//        }
        tvTask5!!.text = spannable
    }

    private fun findIndexes(text: String): List<Int> {
        val list: MutableList<Int> = ArrayList()
        var i = 0
        var spaceIndex = 0
        while (i != -1) {
            i = text.indexOf('#', i + 1)
            if (i != -1) {
                list.add(i)
            }
            spaceIndex = text.indexOf(' ', i)
            if (spaceIndex != -1) {
                list.add(spaceIndex)
            }
        }
        return list
    }

    private fun findIndexes2(text: String): Map<Int, Int> {
        val map: MutableMap<Int, Int> = HashMap()
        for (i in 0 until text.length) {
            if (text[i] == '#') {
                for (j in i until text.length) {
                    if (text[j] == ' ') {
                        map[i] = j
                        break
                    }
                }
            }
        }
        return map
    }

    private fun findHashtag2(text: String): Map<Int, String> {
        val map: MutableMap<Int, String> = HashMap()
        val array = text.split(" ").toTypedArray()
        var sum = 0
        for (i in array.indices) {
            if (array[i][0] == '#') {
                map[sum + i] = array[i]
            }
            sum += array[i].length
        }
        return map
    }

    private fun findHashtag(text: String): List<String> {
        val list: MutableList<String> = ArrayList()
        var sum = 0
        val result = text.split(" ").toTypedArray()
        for (i in result) {
            if (i[0] == '#') {
                list.add(i)
            }
            sum += i.length + 1
        }
        return list
    }
}
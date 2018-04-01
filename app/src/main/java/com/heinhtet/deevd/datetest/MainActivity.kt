package com.heinhtet.deevd.datetest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
   private val TAG = "Convert Date"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        convertFormat("yyyy-MM-dd", "dd/M/yyyy", "2018-04-06")
    }

    private fun convertFormat(current: String, expect: String, date: String) {
        var firstFormat = SimpleDateFormat(current, Locale.ENGLISH)
        var expectFormat = SimpleDateFormat(expect, Locale.ENGLISH)
        var firstDate = firstFormat.parse(date)
        date_tv.text = expectFormat.format(firstDate)
    }
}

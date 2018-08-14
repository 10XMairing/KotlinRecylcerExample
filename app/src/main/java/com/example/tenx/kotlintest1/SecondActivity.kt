package com.example.tenx.kotlintest1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val  list  = ArrayList<String>()
        list.add("this is a test 1")
        list.add("this is a test 2")
        list.add("this is a test 3")
        list.add("this is a test 4")
        list.add("this is a test 5")
        list.add("this is a test 6")
        val adapter = CustomAdapter(list, this)
        recycler_test.layoutManager = LinearLayoutManager(this)
        recycler_test.adapter = adapter
    }
}

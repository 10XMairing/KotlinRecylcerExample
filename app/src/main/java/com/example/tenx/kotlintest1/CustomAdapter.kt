package com.example.tenx.kotlintest1

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.vh_test.view.*

class CustomAdapter (val items : ArrayList<String>, val context: Context): RecyclerView.Adapter<CustomAdapter.CustomViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): CustomViewHolder {
       val view = LayoutInflater.from(context).inflate(R.layout.vh_test, p0, false)
        return CustomViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(p0: CustomViewHolder, p1: Int) {
        p0.tvText.text = items[p1]
    }

    class CustomViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val tvText = view.tv_test
    }
}
package com.example.tenx.kotlintest1


import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var count = 0


        tv_counter.text = String.format(Integer.toString(count))


        btn_plus.setOnClickListener {
            count++
            tv_counter.text = String.format(Integer.toString(count))
        }


        btn_reset.setOnClickListener{_->
            count=0
            tv_counter.text = String.format(Integer.toString(count))
        }

        btn_switch.setOnClickListener{_->
             val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)


        }

    }
}
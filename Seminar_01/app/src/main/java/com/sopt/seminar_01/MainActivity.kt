package com.sopt.seminar_01

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_homework.*
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setClickListener()

    }

   private fun setClickListener(){
        bt_main_act_click.setOnClickListener {
            var message : String = et_main_act_fifth.text.toString()
            et_main_act_fifth.text.clear()
            toast(message)
        }
    }

}

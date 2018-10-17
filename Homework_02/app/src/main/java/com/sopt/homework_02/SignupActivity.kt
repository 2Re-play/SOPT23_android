package com.sopt.homework_02

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_signup.*

class SignupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        setInitId()
        setOnBtnClickListener()
    }

    private fun setInitId() {
        val id: String? = intent.getStringExtra("id")
        if (id != null) {
            et_signup_act_id.setText(id)
        }
    }

    private fun setOnBtnClickListener() {
        btn_signup_act_close.setOnClickListener {
            finish()
        }
        btn_signup_act_complete.setOnClickListener {
            val intent: Intent = Intent()
            intent.putExtra("id", et_signup_act_id.text.toString())
            setResult(Activity.RESULT_OK, intent)
            finish()
        }
    }
}

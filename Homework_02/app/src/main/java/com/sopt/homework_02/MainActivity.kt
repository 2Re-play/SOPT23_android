package com.sopt.homework_02

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivityForResult
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    val REQUEST_CODE_SIGNIN_ID = 200

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setOnBtnClickListener()

    }

    private fun setOnBtnClickListener() {
        btn_main_act_signin.setOnClickListener {
            toast("로그인")
        }

        btn_main_act_signup.setOnClickListener {
            var id: String = et_main_act_id.text.toString()
            // Activity에서 다른 Acitivity를 실행하고 다시 돌아왔을때 어떠한 처리가 필요할 경우 사용
            startActivityForResult<SignupActivity>(REQUEST_CODE_SIGNIN_ID, "id" to id)
        }
    }

    // signUpActivity를 실행하고 돌아오면 자동으로 onActivityResult 메소드 실행
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_CODE_SIGNIN_ID || resultCode == Activity.RESULT_OK || data != null ) {
                    val id = data!!.getStringExtra("id")
                    et_main_act_id.setText(id)
        }
    }

}

package com.sopt.seminar_02

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_user.*

class UserActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        bt_user_act_close.setOnClickListener {
            (it as Button).text = "닫기" // as Button 으로 명시
            val intent : Intent = Intent()
            intent.putExtra("resulData", "user에서 보내는 결과 데이터")
            setResult(Activity.RESULT_OK, intent) // 호출
            finish()
        }
    }
}

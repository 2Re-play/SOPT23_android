package com.sopt.seminar_02

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import org.jetbrains.anko.startActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().apply {
            postDelayed({
//                val intent : Intent = Intent(this@SplashActivity, MainActivity::class.java) // anko 안쓰고
//                intent.putExtra("data1", "hello") // intent data input
//                intent.putExtra("data2", "world")
//                intent.putExtra("data3", 1000)
//                startActivity(intent)

                // anko version
                startActivity<MainActivity>("data1" to "hello", "data2" to "world", "data3" to 1000 )
                finish()
            }, 2000) // cmd + p = parameter check
        }
    }
}

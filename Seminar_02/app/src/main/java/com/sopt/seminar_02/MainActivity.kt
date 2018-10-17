package com.sopt.seminar_02

import android.app.Activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentTransaction
import com.sopt.seminar_02.R.id.bt_main_act_homefragment
import com.sopt.seminar_02.R.id.bt_main_act_userfragment
import com.sopt.seminar_02.fragment.HomeFragment
import com.sopt.seminar_02.fragment.UserFragment
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivityForResult
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {
//
//    // 인스턴스 변수로 사용시
//    var data3 : Int =0
//    var data2 : String? = null
//    var data1 : String? = null
//
//    val REQUESET_CODE_USER_ACTIVITY = 1004
//
//    var backPressedTime: Long = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addFragment(HomeFragment.getInstance()) // memory에 단 하나만의 인스턴스만 올라가게됨
        bt_main_act_homefragment.setOnClickListener {
            replaceFragment(HomeFragment())
        }
        bt_main_act_userfragment.setOnClickListener {
            replaceFragment(UserFragment())
        }


//         // data get from intent
////        val data1 = intent.getStringExtra("data1") // kotlin은 getter setter 필요 없음
////        val data2 = intent.getStringExtra("data2")
////        val data3 = intent.getIntExtra("data3", 0)
//
//        // 인스턴스 변수로 사용시
//        data1 = intent.getStringExtra("data1")
//        intent.getStringExtra("data2")?.let {
//            //kotlin syntax null check =>  ?.let{}
//            data2 = it // null이 아닐때 블럭 안에 코드 실행
//        }
//        data3 = intent.getIntExtra("data3",0)

//        // StartAcitivityForResult Example
//        bt_main_act_goto_sub.setOnClickListener {
//            // 버튼을 눌렀을 때 로직
//            // anko version
//            startActivityForResult<UserActivity>(REQUESET_CODE_USER_ACTIVITY, "data1" to "안녕하세요")
//            // normal version
//            val intent: Intent = Intent(this, UserActivity::class.java) // 출발지, 목적지 액티비티 명시
//            intent.putExtra("data1", "안녕하세요 ")
//            startActivityForResult(intent, REQUESET_CODE_USER_ACTIVITY)
//        }
    }

//    // 결과값을 받을때 사용하는 메서드 onActivityResult 오버라이딩
//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//
//        if(REQUESET_CODE_USER_ACTIVITY == 1004){
//            if(resultCode == 100){
//                toast("resulst code 100")
//            }else if(resultCode == 300){
//                toast("result code 200")
//            }else if(resultCode == Activity.RESULT_OK){
//                toast("result code Activity.result_ok")
//            }
//        }
//    }
//    // 2초 내에 백버튼을 두번 눌렀을때 액티비티 종료 되도록 하는 메서드 오버라이딩
//    override fun onBackPressed() {
//        var temp: Long = System.currentTimeMillis()
//        var intervalTime: Long = temp - backPressedTime
//        if (intervalTime in 0..2000) { super.onBackPressed()
//        } else {
//            backPressedTime = temp
//            toast("버튼을 한번 더 누르면 종료됩니다.")
//        } }

    //**********************
    //** Fragment Example **
    //**********************
    private fun addFragment(fragment : Fragment){
        val transaction : FragmentTransaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.fl_main_act_fragment, fragment)
        transaction.commit()
    }
    private fun replaceFragment(fragment : Fragment){
        val transaction : FragmentTransaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.fl_main_act_fragment, fragment)
        transaction.commit()
    }
}

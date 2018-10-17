package com.sopt.seminar_02.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sopt.seminar_02.R

class HomeFragment : Fragment(){
    // static 느낌 singleton
    companion object {
        var minstance : HomeFragment? = null

        @Synchronized // 다른 스레드에서 인스턴스를 실행해도 여기 인스턴스 하나만 실행되도록 하는 어노테이션
        fun getInstance(): HomeFragment{
            if(minstance == null){
                minstance = HomeFragment()
            }
            return minstance!!
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view : View = inflater!!.inflate(R.layout.fragment_home, container, false)

        return view
    }
}
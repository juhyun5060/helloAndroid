package kr.hs.emirim.s2019w09.helloandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {    //MainActivity가 만들어질때 실행해라
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  // 레이아웃 화면 지정

    }
}
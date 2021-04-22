package com.example.kotiln_beginner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/*
    생일카드 앱을 만들기
    - Views , ViewGroups 사용자 인터페이스 알기
    - TextView 구현
    - TextView 에서 텍스트, 글꼴, 여백등을 정하는 법
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
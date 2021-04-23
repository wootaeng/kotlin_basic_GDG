package com.example.chapter2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //버튼을 읽어온다
        val rollButton: Button = findViewById(R.id.button)

        //버튼을 클릭했을 때 응답하는 클릭리스너
        rollButton.setOnClickListener {
            //toast 는 화면에 알림메세지 띄우기
            val toast = Toast.makeText(this,"주사위 던졌다!",Toast.LENGTH_SHORT)
            //toast 를 보여주는 메소드
            toast.show()
            //rollDice 메소드 호출
            rollDice()
        }
    }
    //주사위 굴렸을 때 랜덤 숫자가 나오는 메소드
    private fun rollDice() {
        //Dice class 가 참조된다.
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val resultNum:TextView = findViewById(R.id.textView2)
        resultNum.text = diceRoll.toString()

        val dice2= Dice(20)
        val diceRoll2 = dice2.roll()
        val resultNum2:TextView = findViewById(R.id.textView3)
        resultNum2.text = diceRoll2.toString()
    }

}
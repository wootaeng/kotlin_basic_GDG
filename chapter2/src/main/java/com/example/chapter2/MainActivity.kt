package com.example.chapter2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
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
            val toast = Toast.makeText(this,"주사위 던졌다",Toast.LENGTH_SHORT)
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
        //textView 를 imageView 로 변경
        //val resultNum:TextView = findViewById(R.id.textView2)
        val diceImage: ImageView = findViewById(R.id.imageView)
        //resultNum.text = diceRoll.toString()
        //주사위 굴리기 테스트용 코드
        //diceImage.setImageResource(R.drawable.dice_2)
//        when (diceRoll){
//            1 -> diceImage.setImageResource(R.drawable.dice_1)
//            2 -> diceImage.setImageResource(R.drawable.dice_2)
//            3 -> diceImage.setImageResource(R.drawable.dice_3)
//            4 -> diceImage.setImageResource(R.drawable.dice_4)
//            5 -> diceImage.setImageResource(R.drawable.dice_5)
//            6 -> diceImage.setImageResource(R.drawable.dice_6)
//        }
        //위의 코드를 더 간결하게
        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        //주사위 이미지 숫자에 맞춰 표시하기
        diceImage.setImageResource(drawableResource)


    }

}
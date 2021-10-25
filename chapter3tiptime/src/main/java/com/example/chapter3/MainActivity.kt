package com.example.chapter3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.chapter3.databinding.ActivityMainBinding
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {

    //뷰바인딩 변수 lateinit 는 변수 사용전에 초기화 시켜주는 것
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //뷰 바인딩 xml 적용
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*
        // Old way with findViewById()
        val myButton: Button = findViewById(R.id.my_button)
        myButton.text = "A button"

        // Better way with view binding
        val myButton: Button = binding.myButton
        myButton.text = "A button"

        // Best way with view binding and no extra variable
        binding.myButton.text = "A button"
         */
        binding.calculateBtn.setOnClickListener { calculateTip() }
    }

    private fun calculateTip() {
        //입력한 금액 가져오기
        val stringInTextField = binding.costOfService.text.toString()
        //금액을 double 로 담기
        //orNull 널도 가능하게 하기
        val cost = stringInTextField.toDoubleOrNull()
        //금액 null 방지
        if(cost == null){
            binding.tipResult.text = ""
            return
        }

        //optionBtn 선택 값 가져오기
//        val selectedID = binding.tipOption.checkedRadioButtonId
        //버튼 선택 비율 가져오기
//        val tipPercentage = when (selectedID){
        val tipPercentage = when (binding.tipOption.checkedRadioButtonId) {
            R.id.option_twenty_per -> 0.20
            R.id.option_fitteen_per -> 0.15
            else -> 0.10
        }
        //팁계산
        var tip = tipPercentage*cost
        //반올림
//        val roundUp = binding.roundUpSwitch.isChecked
//        if (roundUp){
        if (binding.roundUpSwitch.isChecked) {
            tip = kotlin.math.ceil(tip)
        }
        //금액표시형식
        val formattedTip = NumberFormat.getCurrencyInstance().format(tip)
        //금액 적용
        binding.tipResult.text = getString(R.string.tip_amount, formattedTip)
    }
}
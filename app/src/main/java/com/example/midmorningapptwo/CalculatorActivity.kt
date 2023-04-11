package com.example.midmorningapptwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculatorActivity : AppCompatActivity() {
    lateinit var myAnswer:TextView
    lateinit var myFirstNum:EditText
    lateinit var mySecondNum:EditText
    lateinit var btnAdd:Button
    lateinit var btnSub:Button
    lateinit var btnMul:Button
    lateinit var btnDiv:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        myAnswer = findViewById(R.id.mTvAnswer)
        myFirstNum = findViewById(R.id.mEdtFirstNum)
        mySecondNum = findViewById(R.id.mEdtSecondNum)
        btnAdd = findViewById(R.id.mBtnAdd)
        btnSub = findViewById(R.id.mBtnSub)
        btnMul = findViewById(R.id.mBtnMul)
        btnDiv = findViewById(R.id.mBtnDiv)

        btnAdd.setOnClickListener {
            var firstNumber = myFirstNum.text.toString().trim()
            var secondNumber = mySecondNum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                myAnswer.text = ("Please enter valid numbers!!")
            }else{
                var jibu = firstNumber.toDouble() + secondNumber.toDouble()
                myAnswer.text = jibu.toString()
            }
        }

        btnSub.setOnClickListener {
            var firstNumber = myFirstNum.text.toString().trim()
            var secondNumber = mySecondNum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                myAnswer.text = ("Please enter valid numbers!!")
            }else{
                var jibu = firstNumber.toDouble() + secondNumber.toDouble()
                myAnswer.text = jibu.toString()
            }
        }

        btnMul.setOnClickListener {
            var firstNumber = myFirstNum.text.toString().trim()
            var secondNumber = mySecondNum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                myAnswer.text = ("Please enter valid numbers!!")
            }else{
                var jibu = firstNumber.toDouble() + secondNumber.toDouble()
                myAnswer.text = jibu.toString()
            }
        }

        btnDiv.setOnClickListener {
            var firstNumber = myFirstNum.text.toString().trim()
            var secondNumber = mySecondNum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                myAnswer.text = ("Please enter valid numbers!!")
            }else{
                var jibu = firstNumber.toDouble() + secondNumber.toDouble()
                myAnswer.text = jibu.toString()
            }
        }
    }
}
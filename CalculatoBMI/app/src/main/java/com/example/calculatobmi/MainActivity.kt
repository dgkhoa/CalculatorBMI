package com.example.calculatobmi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculatobmi.fragment.CalculatorBmiFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val calculatorBmiFragment = CalculatorBmiFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frame_layout, calculatorBmiFragment)
            commit()
        }
    }
}
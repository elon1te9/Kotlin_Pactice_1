package com.example.test3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.test3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding
    val a = 324
    val b = 34

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.bSum.setOnClickListener {
            val result = a + b
            bindingClass.tvRes.text = result.toString()
        }
        bindingClass.bRest.setOnClickListener {
            val result = a-b
            bindingClass.tvRes.text = "Результат вычитания равен: $result"
        }
        bindingClass.bMult.setOnClickListener {
            val result = a*b
            bindingClass.tvRes.text = "Результат умножения равен: $result"
        }

    }
}
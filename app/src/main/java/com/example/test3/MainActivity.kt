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
    val maxPerson = 90
    val currentPerson = 91

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.bSum.setOnClickListener {
            when(currentPerson){

                in 0..maxPerson -> bindingClass.tvRes.text = "Окей"
                else -> bindingClass.tvRes.text = "Не окей"
            }
        }
        bindingClass.bRest.setOnClickListener {

        }
        bindingClass.bMult.setOnClickListener {

        }
    }
}
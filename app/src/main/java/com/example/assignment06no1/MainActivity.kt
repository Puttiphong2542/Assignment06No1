package com.example.assignment06no1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

var result = "result"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        but1.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra(result,"ถูกต้อง")
            startActivity(intent)
        }
        but2.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra(result,"ผิดครับ")
            startActivity(intent)
        }
        but3.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra(result,"ผิดครับ")
            startActivity(intent)
        }
        but4.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra(result,"ผิดครับ")
            startActivity(intent)
        }
    }
}
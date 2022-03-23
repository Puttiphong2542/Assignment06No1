package com.example.assignment06no1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main6.*

var result4 = "result4"
class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)
        but18.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra(result,"ผิดครับ")
            startActivity(intent)
        }
        but17.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra(result,"ผิดครับ")
            startActivity(intent)
        }
        but19.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra(result,"ถูกหมดครับ")
            startActivity(intent)
        }
        but16.setOnClickListener {
            val intent = Intent(this,MainActivity6::class.java)
            intent.putExtra(result,"ผิดครับ")
            startActivity(intent)
        }
    }
}
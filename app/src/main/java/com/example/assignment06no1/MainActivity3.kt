package com.example.assignment06no1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main3.*

var result1 = "check"
class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        but8.setOnClickListener {
            val intent = Intent(this,MainActivity4::class.java)
            intent.putExtra(result,"ถูกครับ")
            startActivity(intent)
        }
        but9.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra(result,"ผิดครับ")
            startActivity(intent)
        }
        but10.setOnClickListener {
            val intent = Intent(this,MainActivity4::class.java)
            intent.putExtra(result,"ถูกครับ")
            startActivity(intent)
        }
        but11.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra(result,"ผิดครับ")
            startActivity(intent)
        }
    }
}
package com.example.assignment06no1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main5.*

var result3 = "result3"
class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        but14.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra(result,"ผิดครับ")
            startActivity(intent)
        }
        but13.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra(result,"ผิดครับ")
            startActivity(intent)
        }
        but15.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra(result,"ผิดครับ")
            startActivity(intent)
        }
        but12.setOnClickListener {
            val intent = Intent(this,MainActivity6::class.java)
            intent.putExtra(result,"ถูกครับ")
            startActivity(intent)
        }
    }
}
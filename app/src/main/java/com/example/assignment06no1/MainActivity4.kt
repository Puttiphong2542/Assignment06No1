package com.example.assignment06no1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main4.*

var result2 = "result2"
class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        but6.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra(result,"ผิดครับ")
            startActivity(intent)
        }
        but7.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra(result,"ผิดครับ")
            startActivity(intent)
        }
        but5.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra(result,"ผิดครับ")
            startActivity(intent)
        }
        but.setOnClickListener {
            val intent = Intent(this,MainActivity5::class.java)
            intent.putExtra(result,"ถูกครับ")
            startActivity(intent)
        }
    }
}
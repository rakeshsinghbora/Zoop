package com.example.zoop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class splashscreen : AppCompatActivity() {

     lateinit var han:Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)
                han= Handler()
        han.postDelayed({
           val intent= Intent(this,MainActivity::class.java)
           startActivity(intent)
           finish()
        },3000)



    }
}
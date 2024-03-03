package com.adarsh.androidutility

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.adarsh.androidutility._1.SimpleGreet

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        SimpleGreet(this)
    }
}
package com.adarsh.androidutility

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.adarsh.androidutility._01_simple_greet.SimpleGreet
import com.adarsh.androidutility._02_ringtone_picker.NotificationPicker

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        SimpleGreet(this)

        NotificationPicker(this).pickOnClick()
    }
}
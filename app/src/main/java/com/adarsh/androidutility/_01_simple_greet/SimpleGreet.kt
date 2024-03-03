package com.adarsh.androidutility._01_simple_greet

import android.app.Activity
import android.widget.Button
import android.widget.EditText
import com.adarsh.androidutility.util.MyToast
import com.adarsh.androidutility.R

class SimpleGreet(private val activity: Activity) {
    init {
        sayHello()
    }

    private fun sayHello() {
        val greetBtnView = activity.findViewById<Button>(R.id.btn_greet)
        greetBtnView.setOnClickListener {
            val nameEditTextView = activity.findViewById<EditText>(R.id.editTextText)
            val name = nameEditTextView.text.toString()
            MyToast(activity).show("Hello $name")
        }
    }
}
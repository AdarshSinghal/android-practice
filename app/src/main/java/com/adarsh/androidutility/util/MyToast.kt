package com.adarsh.androidutility.util

import android.content.Context
import android.widget.Toast

class MyToast(private val context: Context) {



    fun show(message: String){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

}
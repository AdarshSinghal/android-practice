package com.adarsh.androidutility

import android.content.Context
import android.widget.Toast

class AndroidUtility(private val context: Context) {



    fun showToast(message: String){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

}
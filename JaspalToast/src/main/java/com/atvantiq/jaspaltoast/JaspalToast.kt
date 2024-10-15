package com.atvantiq.jaspaltoast

import android.content.Context
import android.content.Intent
import android.view.Gravity
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity

class JaspalToast {
    fun showToast(context: Context, message : String ){
        val toast = Toast.makeText(context, message, Toast.LENGTH_LONG)
        toast.setGravity(Gravity.CENTER, 0, 0)
        toast.show()
    }

    fun initMyViewActivity(context: Context){
        var intent = Intent(context,MyViewActivity::class.java)
        startActivity(context,intent,null)
    }
}
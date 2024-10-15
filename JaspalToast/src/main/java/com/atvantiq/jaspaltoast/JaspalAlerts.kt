package com.atvantiq.jaspaltoast

import android.content.Context
import android.content.DialogInterface
import androidx.appcompat.app.AlertDialog

class JaspalAlerts private constructor(private val contex:Context){

    companion object {
        @Volatile
        private var INSTANCE: JaspalAlerts? = null

        fun getInstance(context: Context): JaspalAlerts {
            return INSTANCE ?: synchronized(this) {
                INSTANCE ?: JaspalAlerts(context).also {
                    INSTANCE = it
                }
            }
        }
    }

    fun showMessageDialog(title: String,message:String,posCallBack:DialogInterface.OnClickListener){
        AlertDialog.Builder(contex)
            .setTitle(title)
            .setMessage(message)
            .setPositiveButton("Ok",posCallBack)
            .show()
    }

    fun showAlertDialog(title: String,message:String,posCallBack:DialogInterface.OnClickListener,negCallBack:DialogInterface.OnClickListener){
        AlertDialog.Builder(contex)
            .setTitle(title)
            .setMessage(message)
            .setPositiveButton("Yes",posCallBack)
            .setNegativeButton("Cancel",negCallBack)
            .show()
    }

}
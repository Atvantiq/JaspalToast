package com.atvantiq.jaspaltoast

import android.util.Log

class JaspalLogs {
    companion object{
        fun printErrorLog(tag:String,message:String){
            Log.e(tag,message)
        }
        fun printDebugLog(tag:String,message:String){
            Log.d(tag,message)
        }
        fun printInfoLog(tag:String,message:String){
            Log.i(tag,message)
        }
    }
}
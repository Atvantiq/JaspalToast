package com.atvantiq.customtoast

import android.content.DialogInterface
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.atvantiq.customtoast.databinding.ActivityMainBinding
import com.atvantiq.jaspaltoast.JaspalAlerts
import com.atvantiq.jaspaltoast.JaspalLogs
import com.atvantiq.jaspaltoast.JaspalToast

class MainActivity : AppCompatActivity() {
   lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        setListeners()
    }

    private fun setListeners(){
        binding.checkToast.setOnClickListener {
            JaspalToast.makeToast(this,"Toast Testing")
        }
        binding.checkLog.setOnClickListener {
            JaspalLogs.printErrorLog("jaspal","Error Log")
            JaspalLogs.printDebugLog("jaspal","Debug Log")
            JaspalLogs.printInfoLog("jaspal","Info Log")
        }
        binding.checkMessageDialog.setOnClickListener {
            JaspalAlerts.getInstance(this).showMessageDialog("Title","Message"
            ) { dialog, which ->
                dialog.dismiss()
            }
        }
        binding.checkAlertDialog.setOnClickListener {
            JaspalAlerts.getInstance(this).showAlertDialog("Title","Message" , posCallBack = { dialog, which ->
                dialog.dismiss()
            }, negCallBack = { dialog, which ->
                dialog.dismiss()
            })
        }
        binding.checkUI.setOnClickListener {
            JaspalToast.uiTest(this)
        }
    }
}
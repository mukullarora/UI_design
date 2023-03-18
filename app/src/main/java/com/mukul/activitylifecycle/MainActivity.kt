package com.mukul.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("on create called")
    }

    override fun onStart() {
        super.onStart()
        println("on start called")
    }

    override fun onResume() {
        super.onResume()
        println("on resume called")
    }

    override fun onPause() {
        super.onPause()
        println("on pause called")
    }

    override fun onStop() {
        super.onStop()
        println("on stop called")
    }

    override fun onRestart() {
        super.onRestart()
        println("on restart called")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("on destroy called")
    }
}
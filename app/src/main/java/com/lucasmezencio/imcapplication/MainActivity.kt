package com.lucasmezencio.imcapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.w("lifecycle", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.w("lifecycle", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.w("lifecycle", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.w("lifecycle", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.w("lifecycle", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("lifecycle", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("lifecycle", "onDestroy")
    }
}
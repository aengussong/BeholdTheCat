package com.aengussong.beholdthecat

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aengussong.beholdthecat.util.fullscreen

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fullscreen()
    }
}
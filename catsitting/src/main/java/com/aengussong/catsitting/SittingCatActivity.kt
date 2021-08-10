package com.aengussong.catsitting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aengussong.beholdthecat.util.fullscreen

class SittingCatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sitting_cat)

        fullscreen()
    }
}
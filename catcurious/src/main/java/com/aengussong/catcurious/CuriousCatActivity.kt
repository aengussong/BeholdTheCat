package com.aengussong.catcurious

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aengussong.beholdthecat.util.fullscreen

class CuriousCatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_curious_cat)

        fullscreen()
    }
}
package com.aengussong.beholdthecat.util

import android.app.Activity
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat

fun Activity.fullscreen() {
    with(WindowInsetsControllerCompat(window, window.decorView)) {
        systemBarsBehavior = WindowInsetsControllerCompat.BEHAVIOR_SHOW_BARS_BY_SWIPE
        hide(WindowInsetsCompat.Type.systemBars())
    }
}
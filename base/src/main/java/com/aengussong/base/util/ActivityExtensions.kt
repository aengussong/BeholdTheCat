package com.aengussong.base.util

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import com.aengussong.base.BuildConfig

fun Activity.fullscreen() {
    with(WindowInsetsControllerCompat(window, window.decorView)) {
        systemBarsBehavior = WindowInsetsControllerCompat.BEHAVIOR_SHOW_BARS_BY_SWIPE
        hide(WindowInsetsCompat.Type.systemBars())
    }
}

val ComponentActivity.seeCatForResult
    get() = this.registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
        takeIf { result.resultCode == Activity.RESULT_OK }?.let {
            Toast.makeText(this, "Wow, that was a nice cat!", Toast.LENGTH_SHORT).show()
        }
    }

fun letsGoSeeACat(launcher: ActivityResultLauncher<Intent>, url: String) {
    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url)).apply {
        setPackage(BuildConfig.APPLICATION_ID)
        addCategory(Intent.CATEGORY_BROWSABLE)
    }

    launcher.launch(intent)
}

fun Activity.showWelcomeMessageForInAppNavigation() {
    intent.data?.getQueryParameter(QUERY_NAME)?.toBooleanStrictOrNull()?.takeIf { it }?.let {
        Toast.makeText(this, "You came to see a cat. Behold!", Toast.LENGTH_SHORT).show()
    }
}
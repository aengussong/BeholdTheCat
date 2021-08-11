package com.aengussong.catsitting

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aengussong.beholdthecat.util.*
import com.aengussong.catsitting.databinding.ActivitySittingCatBinding

class SittingCatActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySittingCatBinding

    private val catResultListener = seeCatForResult

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySittingCatBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fullscreen()

        binding.btnGoToCuriousCat.setOnClickListener {
            letsGoSeeACat(catResultListener, CURIOUS_URL)
        }

        showWelcomeMessageForInAppNavigation()
    }

    override fun onBackPressed() {
        setResult(Activity.RESULT_OK)
        super.onBackPressed()
    }
}
package com.aengussong.catcurious

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.BuildConfig
import com.aengussong.base.util.*
import com.aengussong.catcurious.databinding.ActivityCuriousCatBinding
import com.google.android.gms.instantapps.InstantApps
import com.google.android.gms.instantapps.InstantApps.getPackageManagerCompat


class CuriousCatActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCuriousCatBinding

    private val catResultListener = seeCatForResult

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCuriousCatBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fullscreen()

        binding.btnGoToSittingCat.setOnClickListener {
            letsGoSeeACat(catResultListener, SITTING_URL)
        }

        showWelcomeMessageForInAppNavigation()

        if (!getPackageManagerCompat(this).isInstantApp) return
        val postInstall = Intent(Intent.ACTION_MAIN)
            .addCategory(Intent.CATEGORY_DEFAULT)
            .setPackage(BuildConfig.APPLICATION_ID)

        InstantApps.showInstallPrompt(this, postInstall, 42, null)
    }


    override fun onBackPressed() {
        setResult(Activity.RESULT_OK)
        super.onBackPressed()
    }
}
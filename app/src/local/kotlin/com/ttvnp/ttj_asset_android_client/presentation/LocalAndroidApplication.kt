package com.ttvnp.ttj_asset_android_client.presentation

import com.squareup.leakcanary.LeakCanary

class LocalAndroidApplication: AndroidApplication() {
    override fun onCreate() {
        super.onCreate()
        initializeLeakDetection()
    }

    private fun initializeLeakDetection() {
        LeakCanary.install(this)
    }
}
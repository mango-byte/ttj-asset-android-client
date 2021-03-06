package com.ttvnp.ttj_asset_android_client.presentation.ui.activity

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.Toolbar
import com.ttvnp.ttj_asset_android_client.R
import com.ttvnp.ttj_asset_android_client.presentation.ui.fragment.SettingsProfileDetailFragment
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

class SettingsProfileActivity : BaseActivity(), HasSupportFragmentInjector {

    @Inject
    lateinit var fragmentInjector: DispatchingAndroidInjector<Fragment>
    override fun supportFragmentInjector(): AndroidInjector<Fragment> = fragmentInjector

    lateinit var toolbar: Toolbar
        get
        private set


    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings_profile)

        toolbar = findViewById<Toolbar>(R.id.toolbar_settings_profile)

        if (savedInstanceState != null) return
        val detailFragment = SettingsProfileDetailFragment.getInstance()
        supportFragmentManager
                .beginTransaction()
                .add(R.id.settings_profile_activity_fragment_container, detailFragment)
                .commit()
    }
}

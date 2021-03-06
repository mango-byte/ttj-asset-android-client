package com.ttvnp.ttj_asset_android_client.presentation.di.module

import android.support.v4.app.Fragment
import com.ttvnp.ttj_asset_android_client.presentation.di.component.SendAmountFormFragmentSubcomponent
import com.ttvnp.ttj_asset_android_client.presentation.ui.fragment.SendAmountFormFragment
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.android.support.FragmentKey
import dagger.multibindings.IntoMap

@Module(subcomponents = arrayOf(SendAmountFormFragmentSubcomponent::class))
abstract class SendAmountFormFragmentModule {
    @Binds
    @IntoMap
    @FragmentKey(SendAmountFormFragment::class)
    abstract fun bindSendAmountFormFragmentInjectorFactory(builder: SendAmountFormFragmentSubcomponent.Builder): AndroidInjector.Factory<out Fragment>
}
package com.ttvnp.ttj_asset_android_client.presentation.di.module

import com.ttvnp.ttj_asset_android_client.data.repository.DeviceRepositoryImpl
import com.ttvnp.ttj_asset_android_client.data.repository.UserRepositoryImpl
import com.ttvnp.ttj_asset_android_client.data.service.DeviceService
import com.ttvnp.ttj_asset_android_client.data.service.DeviceServiceWithNoAuth
import com.ttvnp.ttj_asset_android_client.data.service.UserService
import com.ttvnp.ttj_asset_android_client.data.store.DeviceDataStore
import com.ttvnp.ttj_asset_android_client.data.store.DeviceInfoDataStore
import com.ttvnp.ttj_asset_android_client.data.store.UserDataStore
import com.ttvnp.ttj_asset_android_client.domain.repository.DeviceRepository
import com.ttvnp.ttj_asset_android_client.domain.repository.UserRepository
import com.ttvnp.ttj_asset_android_client.domain.use_case.DeviceUseCase
import com.ttvnp.ttj_asset_android_client.domain.use_case.DeviceUseCaseImpl
import com.ttvnp.ttj_asset_android_client.domain.use_case.UserUseCase
import com.ttvnp.ttj_asset_android_client.domain.use_case.UserUseCaseImpl
import dagger.Module
import dagger.Provides

@Module
class DomainModule {

    // use cases
    @Provides
    fun deviceUseCase(deviceRepository: DeviceRepository): DeviceUseCase {
        return DeviceUseCaseImpl(deviceRepository)
    }

    @Provides
    fun userUseCase(userRepository: UserRepository): UserUseCase {
        return UserUseCaseImpl(userRepository)
    }

    // repository
    @Provides
    fun deviceRepository(
            deviceServiceWithNoAuth: DeviceServiceWithNoAuth,
            deviceService : DeviceService,
            deviceDataStore : DeviceDataStore,
            deviceInfoDataStore : DeviceInfoDataStore,
            userDataStore : UserDataStore
    ): DeviceRepository {
        return DeviceRepositoryImpl(
                deviceServiceWithNoAuth,
                deviceService,
                deviceDataStore,
                deviceInfoDataStore,
                userDataStore
        )
    }

    @Provides
    fun userRepository(
            userService: UserService,
            userDataStore : UserDataStore
    ): UserRepository {
        return UserRepositoryImpl(userService, userDataStore)
    }
}
package com.example.hiltfeature.hilt.model

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object BatteryModule {

    @Provides
    fun getCobalt(): Cobalt {
        return Cobalt()
    }

    @Provides
    fun getLithium(): Lithium {
        var lithium = Lithium()
        lithium.test()
        return lithium
    }

    @Singleton
    @Provides
    fun getBattery(cobalt: Cobalt, lithium: Lithium): Battery {
        return Battery(cobalt,lithium)
    }
}
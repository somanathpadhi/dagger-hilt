package com.example.hiltfeature.hilt.model

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named

@Module
@InstallIn(SingletonComponent::class)
object CoreAndClockSpeedModule {

    @Provides
    @Named("Core")
    fun getCore() = 8

    @Provides
    @Named("ClockSpeed")
    fun getClockSpeed() = 3
}
package com.example.hiltfeature.hilt.model

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class SnapdragonModule {

    @Singleton
    @Binds
    abstract fun getProcessor(snapdragon: Snapdragon): Processor

}

//another way
//@Module
//@InstallIn(SingletonComponent::class)
//object SnapdragonModule {
//
//    @Provides
//    fun getProcessor(snapdragon: Snapdragon): Processor{
//        return snapdragon
//    }
//}

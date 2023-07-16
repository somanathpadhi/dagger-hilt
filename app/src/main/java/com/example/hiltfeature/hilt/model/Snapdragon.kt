package com.example.hiltfeature.hilt.model

import android.util.Log
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton

@Singleton
class Snapdragon @Inject constructor(@Named("Core") core: Int, @Named("ClockSpeed") clockSpeed: Int) : Processor {
    init {
        Log.d("HiltLog", "Snapdragon $this with Core $core and ClockSpeed $clockSpeed")
        start()
    }

    override fun start() {
        Log.d("HiltLog", "Snapdragon Start")
    }
}
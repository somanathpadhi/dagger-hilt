package com.example.hiltfeature.hilt.model

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class Mobile @Inject constructor(battery: Battery, processor: Processor
) {
    init {
        Log.d("HiltLogSingletonTest", "Mobile $this Battery $battery Processor $processor")
    }
}
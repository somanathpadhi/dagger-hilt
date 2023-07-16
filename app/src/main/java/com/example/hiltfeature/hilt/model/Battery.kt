package com.example.hiltfeature.hilt.model

import android.util.Log

class Battery(var cobalt: Cobalt, var lithium: Lithium) {
    init {
        Log.d("HiltLog","Battery $this" )
    }
}
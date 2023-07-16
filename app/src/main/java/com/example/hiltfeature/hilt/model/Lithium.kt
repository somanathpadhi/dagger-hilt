package com.example.hiltfeature.hilt.model

import android.util.Log

class Lithium {
    init {
        Log.d("HiltLog","Lithium $this" )
    }
    fun test(){
        Log.d("HiltLog","Test in Lithium")
    }
}
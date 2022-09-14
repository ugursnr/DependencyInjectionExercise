package com.ugurrsnr.dependencyinjectionexercise

import android.util.Log
import javax.inject.Inject

//Constructor Injection
class Musician @Inject constructor(instrument: Instrument, band: Band) {

    fun sing(){
        println("working...")
    }
}
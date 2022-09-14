package com.ugurrsnr.dependencyinjectionexercise.musician

import javax.inject.Inject
import javax.inject.Singleton

//Constructor Injection

@Singleton // Application scope, it works everywhere but if we give FragmentScoped -> this will not work in an activity
class Musician @Inject constructor(instrument: Instrument, band: Band) {

    fun sing(){
        println("working...")
    }
}
package com.ugurrsnr.dependencyinjectionexercise.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ugurrsnr.dependencyinjectionexercise.module.ClassExample
import com.ugurrsnr.dependencyinjectionexercise.musician.Musician
import com.ugurrsnr.dependencyinjectionexercise.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    //Field Injection
    @Inject
    lateinit var lars : Musician //it's not initialized

    @Inject
    lateinit var myClass : ClassExample


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
        val instrument = Instrument()
        val band = Band()
        val james = Musician(instrument,band)
        james.sing()

         */

        lars.sing()

        println(myClass.myFunction())
    }
}
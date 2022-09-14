package com.ugurrsnr.dependencyinjectionexercise.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ugurrsnr.dependencyinjectionexercise.Band
import com.ugurrsnr.dependencyinjectionexercise.Instrument
import com.ugurrsnr.dependencyinjectionexercise.Musician
import com.ugurrsnr.dependencyinjectionexercise.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    //Field Injection
    @Inject
    lateinit var lars : Musician //it's not initialized


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
    }
}
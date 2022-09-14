package com.ugurrsnr.dependencyinjectionexercise.module

import com.google.gson.Gson
import javax.inject.Inject

class ClassExample @Inject constructor(private val myInterfaceImplementor : MyInterface, private val gson : Gson) {

    fun myFunction() : String{
        return "working ${myInterfaceImplementor.myPrintFunction()}"
    }


}
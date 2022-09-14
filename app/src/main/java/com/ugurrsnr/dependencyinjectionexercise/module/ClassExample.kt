package com.ugurrsnr.dependencyinjectionexercise.module

import com.google.gson.Gson
import com.ugurrsnr.dependencyinjectionexercise.SecondInterfaceImplementor
import javax.inject.Inject

class ClassExample @Inject constructor(
    @FirstImplementor private val myInterfaceImplementor : MyInterface,
    private val gson : Gson,
    @SecondImplementor private val mySecondInterfaceImplementor: MyInterface) {

    fun myFunction() : String{
        return "working ${myInterfaceImplementor.myPrintFunction()}"
    }

    fun secondFunction() : String{
        return "working ${mySecondInterfaceImplementor.myPrintFunction()}"
    }

}
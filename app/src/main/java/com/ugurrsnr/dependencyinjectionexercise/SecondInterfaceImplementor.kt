package com.ugurrsnr.dependencyinjectionexercise

import com.ugurrsnr.dependencyinjectionexercise.module.MyInterface
import javax.inject.Inject

class SecondInterfaceImplementor @Inject constructor() : MyInterface {
    override fun myPrintFunction(): String {
        return "My Second Interface Implementor"
    }
}
package com.ugurrsnr.dependencyinjectionexercise.module

import com.google.gson.Gson
import com.ugurrsnr.dependencyinjectionexercise.SecondInterfaceImplementor
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

//Working with Providers
@InstallIn(SingletonComponent::class)
@Module
class MyModule{

    @FirstImplementor
    @Singleton
    @Provides
    fun providerFunction() : MyInterface {
        return InterfaceImplementor()
    }
    @SecondImplementor
    @Singleton
    @Provides
    fun secondProvider() : MyInterface {
        return SecondInterfaceImplementor()
    }

    //Working with external libraries
    @Singleton
    @Provides
    fun gsonProvider() : Gson {
        return Gson()
    }

}

/*
//Working with binder
@InstallIn(ActivityComponent::class) //Must
@Module
abstract class MyModule{
    @ActivityScoped // InstallIn scope is have be same with here
    @Binds
    abstract fun bindingFunction(myImplementor : InterfaceImplementor) : MyInterface
}

 */

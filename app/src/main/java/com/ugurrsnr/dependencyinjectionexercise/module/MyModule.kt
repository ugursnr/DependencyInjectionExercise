package com.ugurrsnr.dependencyinjectionexercise.module

import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

//Working with Providers
@InstallIn(SingletonComponent::class)
@Module
class MyModule{

    @Singleton
    @Provides
    fun providerFunction() : MyInterface {
        return InterfaceImplementor()
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

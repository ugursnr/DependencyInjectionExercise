package com.ugurrsnr.dependencyinjectionexercise.module

import javax.inject.Qualifier


// Creating our annotations
@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FirstImplementor {
}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class SecondImplementor {
}
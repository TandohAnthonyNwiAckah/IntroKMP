package com.example.kmp.di

import com.example.kmp.dependencies.MyRepository
import com.example.kmp.dependencies.MyRepositoryImpl
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind


import org.koin.dsl.module

expect val platformModule: Module

val sharedModule = module {

//    single {
//        MyRepositoryImpl(get())
//    }.bind<MyRepository>()


    singleOf(::MyRepositoryImpl).bind<MyRepository>()



//    viewModelOf(::MyViewModel)
}
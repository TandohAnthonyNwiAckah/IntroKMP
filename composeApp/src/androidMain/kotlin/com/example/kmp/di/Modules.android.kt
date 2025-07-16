package com.example.kmp.di

import com.example.kmp.dependencies.DbClient
import com.example.kmp.dependencies.MyViewModel
import org.koin.compose.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

actual val  platformModule= module{

    singleOf(::DbClient)

    viewModelOf(::MyViewModel)
}
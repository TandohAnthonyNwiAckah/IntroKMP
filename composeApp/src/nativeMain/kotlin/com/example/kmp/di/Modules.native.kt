package com.example.kmp.di

import com.example.kmp.dependencies.DbClient
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module


actual val platformModule = module {
    singleOf(::DbClient)
}
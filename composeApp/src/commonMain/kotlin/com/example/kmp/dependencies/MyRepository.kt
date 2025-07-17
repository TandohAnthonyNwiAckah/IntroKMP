package com.example.kmp.dependencies

interface MyRepository {
    fun helloKoin(): String
}


class MyRepositoryImpl(private val dbClient: DbClient) : MyRepository {
    override fun helloKoin(): String {
        return  "Welcome to DI with Koin!"
    }
}
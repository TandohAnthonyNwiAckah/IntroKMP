package com.example.kmp.dependencies

import androidx.lifecycle.ViewModel

class MyViewModel(private val repository: MyRepository): ViewModel() {

    fun getHelloWorldString(): String {
        return repository.helloWorld()
    }
}
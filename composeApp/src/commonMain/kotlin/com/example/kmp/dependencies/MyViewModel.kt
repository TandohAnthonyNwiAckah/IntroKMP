package com.example.kmp.dependencies

import androidx.lifecycle.ViewModel

class MyViewModel(private val repository: MyRepository): ViewModel() {

    fun getHelloKoinString(): String {
        return repository.helloKoin()
    }
}
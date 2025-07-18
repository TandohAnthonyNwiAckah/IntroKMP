package com.example.kmp.networking

import kotlinx.serialization.Serializable

@Serializable
data class CensoredText(
    val result: String
)
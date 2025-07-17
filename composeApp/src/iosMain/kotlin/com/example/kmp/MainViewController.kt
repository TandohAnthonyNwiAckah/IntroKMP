package com.example.kmp

import androidx.compose.runtime.remember
import androidx.compose.ui.window.ComposeUIViewController
import com.example.kmp.di.initKoin

fun MainViewController() = ComposeUIViewController(configure = {
        initKoin()
    }) {
    App(batteryManager = remember { BatteryManager() })
}
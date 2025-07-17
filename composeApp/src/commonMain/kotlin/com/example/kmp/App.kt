@file:OptIn(KoinExperimentalAPI::class)

package com.example.kmp
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.kmp.dependencies.MyViewModel
import kmp.composeapp.generated.resources.Res
import kmp.composeapp.generated.resources.app_name
import kmp.composeapp.generated.resources.compose_multiplatform
import kmp.composeapp.generated.resources.ic_battery
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.KoinContext
import org.koin.compose.viewmodel.koinViewModel
import org.koin.core.annotation.KoinExperimentalAPI

@Composable
@Preview
fun App(
    batteryManager: BatteryManager
) {
    MaterialTheme {
        KoinContext {
            NavHost(
                navController = rememberNavController(),
                startDestination = "home"
            ) {
                composable(route = "home") {

                    val viewModel = koinViewModel<MyViewModel>()

                    var showContent by remember { mutableStateOf(false) }

                    Column(
                        modifier = Modifier
                            .safeContentPadding()
                            .fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {

                        Text(
                            text = stringResource(Res.string.app_name),
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(bottom = 16.dp)
                        )

                        Row(modifier = Modifier.padding(bottom = 16.dp)) {

                            Image(painterResource(Res.drawable.ic_battery), null)

                            Text(
                                text = "The current battery level is ${batteryManager.getBatteryLevel()}"
                            )

                        }

                        // USING DEPENDENCY INJECTION.
                        Text(
                            text = viewModel.getHelloKoinString(),
                            modifier = Modifier.padding(bottom = 8.dp, top = 8.dp)

                        )

                        Button(onClick = { showContent = !showContent }) {
                            Text("Click me!")
                        }

                        AnimatedVisibility(showContent) {
                            val greeting = remember { Greeting().greet() }
                            Column(
                                Modifier.fillMaxWidth(),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Image(painterResource(Res.drawable.compose_multiplatform), null)
                                Text("Compose: $greeting")
                            }
                        }
                    }
                }
            }
        }
    }
}
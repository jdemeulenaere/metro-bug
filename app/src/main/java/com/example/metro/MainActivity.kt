package com.example.metro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import dev.zacsweers.metro.createGraph

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val graph = createGraph<SampleAppGraph>()
        setContent {
            MaterialTheme {
                Surface(Modifier.fillMaxSize()) {
                    graph.counterComposer.Content(
                        remember { CounterState("MyCounter") },
                        Modifier.safeDrawingPadding(),
                    )
                }
            }
        }
    }
}

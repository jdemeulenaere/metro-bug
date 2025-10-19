package com.example.metro

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.Inject
import dev.zacsweers.metro.SingleIn

@SingleIn(AppScope::class)
class CounterComposerImpl @Inject constructor() : CounterComposer {
    @Composable
    override fun Content(state: CounterState, modifier: Modifier) {
        Column(
            modifier = modifier,
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(text = state.label)
            Text(text = "Count: ${state.count}")
            Row {
                Button(onClick = { state.count-- }) { Text(text = "-") }
                Button(onClick = { state.count++ }) { Text(text = "+") }
            }
        }
    }
}

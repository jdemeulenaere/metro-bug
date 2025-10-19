package com.example.metro

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

interface CounterComposer {
    @Composable fun Content(state: CounterState, modifier: Modifier = Modifier)
}

interface CounterState {
    val label: String
    var count: Int
}

fun CounterState(label: String, count: Int = 0): CounterState = CounterStateImpl(label, count)

private class CounterStateImpl(override val label: String, count: Int = 0) : CounterState {
    override var count: Int by mutableIntStateOf(count)
}

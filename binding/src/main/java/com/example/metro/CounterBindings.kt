package com.example.metro

import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.Provides
import dev.zacsweers.metro.SingleIn

@BindingContainer
@ContributesTo(AppScope::class)
interface CounterBindings {
    companion object {
        @Provides
        @SingleIn(AppScope::class)
        fun counterComposer(): CounterComposer = CounterComposerImpl()
    }
}
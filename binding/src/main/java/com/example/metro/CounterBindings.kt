package com.example.metro

import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo

@BindingContainer
@ContributesTo(AppScope::class)
interface CounterBindings {
    @Binds fun CounterComposerImpl.bind(): CounterComposer
}

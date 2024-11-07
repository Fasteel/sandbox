package org.example

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.conflate
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.onEach

fun main() {
    val f1 = flow {
        delay(250L)
        emit("Appetizer")
        delay(1000L)
        emit("Main dish")
        delay(100L)
        emit("Dessert")
    }

    CoroutineScope(Dispatchers.IO).launch {
        f1
            .onEach {
                println("$it is delivered")
            }
            .conflate()
            .collect {
                println("Now eating $it")
                delay(1500L)
                println("Finished eating $it")
            }
    }

    runBlocking {
        delay(60000L)
    }
}
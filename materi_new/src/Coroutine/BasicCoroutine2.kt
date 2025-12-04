package Coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("App Dimulai")

    launch {
        updateVersion()
    }

    println("App Sedang Digunakan")
}

suspend fun updateVersion(){
    delay(5_000)
    println("Update Sesai")
}
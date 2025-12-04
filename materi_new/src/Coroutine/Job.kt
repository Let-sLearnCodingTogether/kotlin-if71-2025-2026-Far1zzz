package Coroutine

import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("App Dimulai")

    val job : Job = launch {
        updateVersion1()
    }

    println("Apakah Job ini Selesai ? ${job.isCompleted}")
    println("Apakah Job ini berjalan ? ${job.isActive}")
    println("Apakah Job ini dibatalkan ? ${job.isCancelled}")

    job.join()

    println("App Sedang Digunakan")

    println("Apakah Job ini Selesai ? ${job.isCompleted}")
    println("Apakah Job ini berjalan ? ${job.isActive}")
    println("Apakah Job ini dibatalkan ? ${job.isCancelled}")
}

suspend fun updateVersion1(){
    delay(5_000)
    println("Update Sesai")
}
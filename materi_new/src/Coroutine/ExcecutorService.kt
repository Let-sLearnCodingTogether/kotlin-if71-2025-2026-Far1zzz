package Coroutine

import java.util.concurrent.Executors

fun main() {
//    val executor = Executors.newFixedThreadPool(10)
//    val executor = Executors.newCachedThreadPool()
    val executor = Executors.newSingleThreadExecutor()
    for (i in 1 .. 10){
        executor.submit {
            val threadName = Thread.currentThread().name
            println("Tugas $i berjalan di thred $threadName")
            Thread.sleep(1_000)
        }
    }
    executor.shutdown()
}
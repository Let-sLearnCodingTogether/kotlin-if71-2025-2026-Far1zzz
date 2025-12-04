package Coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("App Dimulai")
    login()
    println("Pindah Halaman dari login ke Home")
}

suspend fun login(){
    println("Melakukan validasi email dan pass")
    delay(2_000)
    println("Validasi Sukses")
}
package oop

class MhsThisKeyword(val nama: String){
    fun sayHai(nama: String){
        println("$nama : ${this.nama}")
    }
}

fun main() {
    val mhsPertma = MhsThisKeyword("Testing aja")

    mhsPertma.sayHai("Mhs 1")
}
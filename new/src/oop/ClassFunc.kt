package oop

class MhswaFunc(val nama : String){
    fun hai(){
        print("Selamat malam $nama")
    }
}

fun main() {
    val mhsPertama = MhswaFunc("Testing")

    mhsPertama.hai()
}
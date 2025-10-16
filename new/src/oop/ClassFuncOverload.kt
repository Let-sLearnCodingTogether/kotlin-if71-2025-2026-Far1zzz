package oop

private class MhsFunc(val nama : String){
    fun hai(kataKata : String){
        print("$kataKata $nama")
    }
}

fun main() {
    val mhsPertama = MhsFunc("Testing")

    mhsPertama.hai("Wuaw")
}
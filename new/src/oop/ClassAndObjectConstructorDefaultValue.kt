package oop

class MhsConstDfltValue(
    val npm : String, val nama : String, var ipk : Float = 1.5f
){
    init {
        println("Testing init")
    }
}

fun main() {
    val mhsPertama = MhsConstDfltValue(
        "testingAja",
        "Testt"
    )

    val mhsKedua = MhsConstDfltValue(
        "testAja",
        "testt",
        2.2f
    )

    println(mhsPertama.ipk)
    println(mhsKedua.ipk)
}
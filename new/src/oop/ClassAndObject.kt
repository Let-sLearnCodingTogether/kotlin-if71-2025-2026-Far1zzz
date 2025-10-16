package oop

class MahasiswaConstructor(
    val npm: String,
    val nama: String,
    var ipk: Float
)

fun main() {
    val mhsPertama = MahasiswaConstructor(
        "Testing",
        "Mhs 1",
        1.50f
    )

    mhsPertama.ipk = 1.10f
    println(mhsPertama.ipk)
}
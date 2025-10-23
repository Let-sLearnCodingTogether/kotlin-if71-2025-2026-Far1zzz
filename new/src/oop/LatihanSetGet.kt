package oop

class PersegiPanjang(val p: Double, val l: Double) {
    val luas: Double
        get() = p * l
}

class Mhs {
    var ipeka: Double = 0.0
        set(value) {
            field = when {
                value < 0.0 -> 0.0
                value > 4.0 -> 4.0
                else -> value
            }
        }
}

fun main() {
    val p = PersegiPanjang(5.0, 3.0)
    println("Luas persegi panjang: ${p.luas}")

    val mhs = Mhs()
    mhs.ipeka = 4.5
    println("IPK mahasiswa: ${mhs.ipeka}")

    mhs.ipeka = -1.0
    println("IPK mahasiswa: ${mhs.ipeka}")

    mhs.ipeka = 3.2
    println("IPK mahasiswa: ${mhs.ipeka}")
}

package oop

class NilaiUjian(nilaiUts: Double) {
    var nilaiUts: Double = nilaiUts
        get() = field * 0.1
        set(value) {
            field = if (value < 0) 0.0 else value
        }
}


fun main() {
    val ujian = NilaiUjian(80.0)
    println(ujian.nilaiUts)

    ujian.nilaiUts = -50.0
    println(ujian.nilaiUts)
}

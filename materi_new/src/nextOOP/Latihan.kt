package nextOOP

import java.text.NumberFormat
import java.util.Locale

open class Pegawai(
    val nama: String,
    val gajiDasar: Double
) {
    open fun hitungGaji(): Double {
        return gajiDasar
    }

    fun info() {
        println("Nama: $nama")
        println("Gaji Total : ${formatRupiah(hitungGaji())}")
    }

    fun formatRupiah(nilai: Double): String {
        val format = NumberFormat.getCurrencyInstance(Locale("id", "ID"))
        return format.format(nilai)
    }
}


class Manager(
    nama: String,
    gajiDasar: Double,
    val tunjangan: Double
) : Pegawai(nama, gajiDasar) {

    override fun hitungGaji(): Double {
        return gajiDasar + tunjangan
    }
}


class Programmer(
    nama: String,
    gajiDasar: Double,
    val bonus: Double
) : Pegawai(nama, gajiDasar) {

    override fun hitungGaji(): Double {
        return gajiDasar + bonus
    }
}


fun main() {
    val manager = Manager("Andi", 10_000_000.0, 5_000_000.0)
    val programmer = Programmer("Budi", 8_000_000.0, 3_000_000.0)



    println("Gaji ${manager.nama} (Manager): ${manager.formatRupiah(manager.hitungGaji())}")
    println("Gaji ${programmer.nama} (Programmer): ${programmer.formatRupiah(manager.hitungGaji())}")

    println()
    manager.info()
    println()
    programmer.info()
}

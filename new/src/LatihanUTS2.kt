import java.text.DecimalFormat

class Karyawan(
    val nama: String,
    val id: String,
    val gajiPokok: Double
) {
    private val formatGaji = DecimalFormat("#,###")

    fun tampilkanProfil() {
        println("Nama Karyawan : $nama")
        println("ID Karyawan   : $id")
        println("Gaji Pokok    : Rp${formatGaji.format(gajiPokok)}")
        println("-----")
    }

    fun hitungGajiBulanan(jumlahHariMasuk: Int): Double {
        return (jumlahHariMasuk / 22.0) * gajiPokok
    }
}

fun main() {
    val karyawanA = Karyawan("Andi", "K001", 5_000_000.0)
    val karyawanB = Karyawan("Budi", "K002", 6_000_000.0)

    println("= Profil Karyawan =")
    karyawanA.tampilkanProfil()
    karyawanB.tampilkanProfil()

    val formatGaji = DecimalFormat("#,###")
    val gajiA = karyawanA.hitungGajiBulanan(20)
    val gajiB = karyawanB.hitungGajiBulanan(22)

    println("=== Gaji Bulanan ===")
    println("${karyawanA.nama}: Rp ${formatGaji.format(gajiA)} (20 hari masuk)")
    println("${karyawanB.nama}: Rp ${formatGaji.format(gajiB)} (22 hari masuk)")
}
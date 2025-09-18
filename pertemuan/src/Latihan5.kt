fun main() {
    var ttlBelanja = 0.0
    println("Status Awal  -> Total Belanja : Rp.$ttlBelanja")

    ttlBelanja += 3*25000
    println("Setelah item A  -> Total Belanja : Rp.$ttlBelanja")

    ttlBelanja += 2*15000
    println("Setelah item B  -> Total Belanja : Rp.$ttlBelanja")

    ttlBelanja -= 10000
    println("Setelah Diskon  -> Total Belanja : Rp.$ttlBelanja")

    val biayaLayanan =  ttlBelanja / 100
    ttlBelanja += biayaLayanan

    println("Ditambah Biaya Layanan(Rp.$biayaLayanan) -> Total Belanja: Rp.$ttlBelanja")

    println("=================================")
    println("Total Akhir yang Harus di Bayar: Rp.$ttlBelanja")
    println("=================================")

}
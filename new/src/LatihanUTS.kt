fun main() {
    val stokBarang = mapOf(
        "Buku Tulis Sinar Dunia" to 56,
        "Pena Pilot G-2" to 78,
        "Indomie Goreng" to 120,
        "Teh Kotak" to 30,
        "Binder B5" to 12,
        "Kopi Kapal Api" to 55
    )

    val restock = cariStokTerendah(stokBarang)

    if (restock.isNotEmpty()){
        println("Barang yang perlu segera di-restock adalah :")
        restock.forEach{(nama, stok) ->
            println("-$nama (stok : $stok)")
        }
    }else{
        println("data stok kosong.")
    }
}

fun cariStokTerendah(data: Map<String, Int>) : List<Pair<String, Int>> {
    if (data.isEmpty()) return  emptyList()
    val stokRendah = data.minOf { it.value }
    return data.filter { it.value == stokRendah }.map { it.toPair() }
}


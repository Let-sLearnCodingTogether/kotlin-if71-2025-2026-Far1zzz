fun main() {
    println("--- 1. Inisialisasi Data ---")
    
    val daftarJudulBuku = mutableListOf(
        "Laskar Pelangi",
        "Bumi Manusia",
        "Filosofi Teras",
        "Laskar Pelangi"  // duplikat
    )

    println("List judul buku berhasil dibuat (mengandung duplikat).")

    // Set genre (hanya nilai unik)
    val koleksiGenre = mutableSetOf("Novel", "Filsafat", "Sejarah", "Novel") // Set otomatis menghilangkan duplikat

    println("Set genre berhasil dibuat (hanya berisi nilai unik).")

    // Map ISBN ke Judul Buku (unik)
    val inventarisBuku: MutableMap<String, String> = mutableMapOf(
        "978-602-03-8591-6" to "Laskar Pelangi",
        "978-979-3062-79-2" to "Bumi Manusia",
        "978-602-06-3534-7" to "Filosofi Teras"
    )

    println("Map inventaris buku berhasil dibuat (key unik).")
    println("----------------------------------\n")

    println("--- 2. Manipulasi dan Analisis Data ---")

    // Cetak judul buku berdasarkan ISBN tertentu
    val isbnDicari = "978-979-3062-79-2"
    val judulDitemukan = inventarisBuku[isbnDicari]
    println("Judul buku dengan ISBN $isbnDicari adalah: $judulDitemukan")

    // Tambahkan buku baru
    inventarisBuku["978-623-91289-8-2"] = "Atomic Habits"
    println("Buku baru 'Atomic Habits' berhasil ditambahkan.")

    // Cetak isi inventaris sekarang
    println("Isi inventaris sekarang: $inventarisBuku")

    // Hitung jumlah genre unik
    val jumlahGenre = koleksiGenre.size
    println("Jumlah genre unik yang ada di toko: $jumlahGenre")
    println()

    // Cetak semua judul buku dari daftarJudulBuku
    println("Daftar semua judul buku yang tercatat:")
    daftarJudulBuku.forEach {
        println("- $it")
    }

    println("----------------------------------")
}

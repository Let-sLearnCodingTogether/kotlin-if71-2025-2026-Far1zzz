fun main() {
    print("Siapa nama anda : ")
    val namaPermain: String =readln()
    var kesehatanPemain = 100
    var punyaKunciEmas :Boolean = false
    var jumlahPotion :Int =2
    var sedangBermain: Boolean = true

    while (sedangBermain==true)
    {
        println("===Status Bermain ===")
        println("nama permian : $namaPermain")
        println("kesehatan anda : $kesehatanPemain ")
        println("Jumalh Potion yang tersedia $jumlahPotion")

        println("\nDi depan kamu terdapat 2 buah jalur (1, 2):")
        println("1). Jalur gelap dan seram")
        println("2). Jalur tenang dan sunyi")
        print("Pilih jalur (1/2): ")
        val pilihJalur= readln().toInt()
        if (pilihJalur==1)
        {
            println("Kamu masuk ke Jalur gelap dan seram")
            println("Kamu berada disebuah ruangan dengan tiga patung : naga, griffin, dan ular")
            val pilihRuangan=readln()

            when (pilihRuangan) {
                "naga" -> {
                    println("Patung naga mengeluarkan api! Kesehatan kamu berkurang 35 poin.")
                    kesehatanPemain -= 35
                    println("anda kena serang patung naga yang mengeluarkan api hp anda berkurang : $kesehatanPemain")
                }

                "griffin" -> {
                    println("Kamu mendapatkan kunci emas dari patung griffin!")
                    punyaKunciEmas = true
                    println("anda mendapatkan kunci emas Boleh Juga kamu $namaPermain ini kunci emas emasmu : $punyaKunciEmas")
                    if (punyaKunciEmas == true) {
                        println("\nKamu menggunakan kunci emas dan menemukan artefak kuno!”, dan permainan selesai\n!")
                        sedangBermain = false
                        break
                    }
                }


                "ular" -> {
                    println("Patung ular menggigit kamu! Kesehatan berkurang 15 poin.")
                    kesehatanPemain -= 15
                    println("anda Kena gigir ular, Tolong hari hati. hp anda berkurang : $kesehatanPemain")
                }

                else -> {
                    println("Kamu tidak memilih patung yang benar, jadi tidak terjadi apa-apa.")
                }

            }
            if (kesehatanPemain <= 0) {
                println("\nKesehatan kamu sudah habis. Kamu kalah!")
                sedangBermain = false
                break
            }
            if (jumlahPotion > 0) {
                println("Mau menggunakan potion untuk menambah 10 poin kesehatan? (y/n)")
                val pakaiPotion = readln()
                if (pakaiPotion == "y") {
                    kesehatanPemain += 10
                    if (kesehatanPemain > 100) {
                        kesehatanPemain = 100
                    }
                    jumlahPotion--
                    println("Potion digunakan. Kesehatan sekarang $kesehatanPemain. Potion tersisa $jumlahPotion.")
                } else {
                    println("Potion tidak digunakan.")
                }


            }



        }

        else if(pilihJalur==2)
        {
            kesehatanPemain-=25
            println("Kamu menginjak perangkap dan keseheatan kamu berkurang 25 poin ")
            println("Kesehatan anda menjadi $kesehatanPemain")
            if (kesehatanPemain <= 0) {
                println("\nKesehatan kamu sudah habis. Kamu kalah!")
                sedangBermain = false
                break
            }
        }

    }


}
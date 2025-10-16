fun coba(nama: String, nomor: Array<Int>)
{
    for (no in nomor)
    {
        println("$nama"+no)
    }

}


fun main() {
    val data = arrayOf(1, 2, 3)
    coba("nama ",data)
}
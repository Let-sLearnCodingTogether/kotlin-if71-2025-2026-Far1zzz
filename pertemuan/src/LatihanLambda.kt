fun main() {
    val dftrMhs = listOf(
        Pair("Budi", 3.8),
        Pair("Ani", 3.5),
        Pair("Doni", 3.7)
    )

    for (res in dftrMhs){
        if (res.second > 3.5)
        {
            println("Nama : ${res.first}" )
        }
    }
}
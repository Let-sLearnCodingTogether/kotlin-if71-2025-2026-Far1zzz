package oop

data class  vehicle(val brand : String, val year : Int)

fun main() {
    val grobak = vehicle("Gerobak Tuo", 1996)

//    print(tayo.brand)
    val (brand, year) = grobak
    println(brand)
    println(year)
}
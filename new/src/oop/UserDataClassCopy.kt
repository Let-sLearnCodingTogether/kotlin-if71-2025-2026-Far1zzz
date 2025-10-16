package oop

data class Product(val name: String, val price: Double)
{
    val isAvail : Boolean = true

    fun getFormatPrice() : String{
        return "Rp. $price"
    }
}

fun main() {
    val productKita = Product("Ayam Gulai", 3000_000.0)
    println(productKita)
    println(productKita.isAvail)
    println(productKita.getFormatPrice())

}
package oop

data class item(val id: Int, val name: String, val value: Int, val rarity: String)

fun main() {
    val inven = mutableListOf(
        item(1, "Pedang Besi", 100, "common"),
        item(2, "Ramuan Kesehatan", 50, "common"),
        item(3, "Jubah Bayangan", 500, "epic")
    )


    val originalItem = inven[0]
    val cursedSword = originalItem.copy(name = "Pedang Besi Terkutuk", value = 250)

    println(inven)
    println(cursedSword)
}

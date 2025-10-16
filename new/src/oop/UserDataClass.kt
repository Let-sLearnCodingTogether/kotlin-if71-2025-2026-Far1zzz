package oop

data class User(val name : String, val age : Int)

fun main() {
    val user = User("user1", 20)
    val userCopy = user.copy()
    val userCopyAge = user.copy(age = 50)

    println(user)
    println(userCopy)
    println(userCopyAge)
}
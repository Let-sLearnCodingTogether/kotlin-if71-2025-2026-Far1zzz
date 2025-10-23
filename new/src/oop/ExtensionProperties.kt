package oop

class userProfile( val username : String){}

val userProfile.usernameUppercase : String
    get() = this.username.uppercase()


fun main() {
    val user1 = userProfile("jon")
    println(user1.username)
    println(user1.usernameUppercase)
}
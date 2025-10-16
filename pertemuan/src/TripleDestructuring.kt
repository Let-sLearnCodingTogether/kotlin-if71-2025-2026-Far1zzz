fun main()
{
    val firstUser: Triple<String, Byte, Boolean> = Triple("User 1", 20, false)
    val (username,  age, yes) = firstUser

    println(username)
    println(age)
    println(yes)
}
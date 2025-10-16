fun String.greeting():String{
    return "Hello, $this"
}
fun Int.isEven(): Boolean{
    return this % 2 == 0
}
fun main(){
    val username : String = "Budi"
    println(username.greeting())
}
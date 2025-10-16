infix fun String.to(type : String):String{
    if (type =="upper"){
        return this.uppercase()
    }
    return this.lowercase()
}

fun main(){
    println("Hello World" to "upper")
    println("Hello World" to "lower")
}
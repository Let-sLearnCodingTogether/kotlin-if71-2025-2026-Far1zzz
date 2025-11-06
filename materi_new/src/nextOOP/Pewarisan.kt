package nextOOP

open class Hewan (val name : String){
    open fun suara (){
        println("Suara Hewan")
    }
}
open class Ayam(name: String): Hewan(name){
    final override fun suara(){
        println("Kuku Ruyuk")
    }
}
//class AnakAyam(name: String) : Ayam(name)
//    override fun suara(){
//    println("Petok Petok")
//}


fun main(){
    val rambo = Ayam("Rambo")
    rambo.suara()
}
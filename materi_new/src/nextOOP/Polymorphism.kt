package nextOOP

open class Kendaraan (){
    open fun klakson(){
        println("Suara Klakson")
    }
}

class Mobil() : Kendaraan(){
    override fun klakson(){
        println("klakson mobil ")
    }
}

class Motor() : Kendaraan(){
    override fun klakson(){
        println("klakson motor")
    }
}

fun main() {
    Mobil().klakson()
    Motor().klakson()
}
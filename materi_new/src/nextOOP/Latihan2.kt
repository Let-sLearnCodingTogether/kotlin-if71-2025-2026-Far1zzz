package nextOOP

interface Electronic {
    val brand: String

    fun turnOn()
    fun turnOff()

    fun cleanDevice() {
        println("Membersihkan debu dari perangkat $brand")
    }
}

class Fan(override val brand: String) : Electronic {
    override fun turnOn() {
        println("Kipas angin merk $brand berputar")
    }

    override fun turnOff() {
        println("Kipas angin merk $brand berhenti")
    }
}

class SmartLight(override val brand: String) : Electronic {
    override fun turnOn() {
        println("Lampu otomatis merk $brand menyala kedip-kedip")
    }

    override fun turnOff() {
        println("Lampu otomatis merk $brand putus")
    }
}

fun main() {
    val fan = Fan("Baling-baling Bambu")
    fan.turnOn()
    fan.turnOff()
    fan.cleanDevice()

    println()

    val smartLight = SmartLight("philips")
    smartLight.turnOn()
    smartLight.turnOff()
    smartLight.cleanDevice()
}

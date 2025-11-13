package nextOOP

interface SpaceVehicle{
    fun accelerate()

    fun stop(){
        println("Stop")
    }
}

class LightSpace : SpaceVehicle{
    override fun accelerate() {
        println("Accelerate")
    }
}

fun main() {
    val lightSpaceOne = LightSpace()

    lightSpaceOne.stop()
}
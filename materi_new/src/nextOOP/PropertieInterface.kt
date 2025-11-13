package nextOOP

interface  VehicleProperties{
    val weight : Int
    val name : String
        get() = "Vehicle"
}

class Car() : VehicleProperties{
    override val weight: Int = 1000
//    tetep biso di override
//    override val name : String = "Car 123"
}

fun main() {
    val car1 = Car()

    println(car1.weight)
    println(car1.name)
}
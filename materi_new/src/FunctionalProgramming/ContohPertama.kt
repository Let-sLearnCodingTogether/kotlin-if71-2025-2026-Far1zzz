package FunctionalProgramming

data class Vector(var x: Int, var y: Int){
    operator fun plusAssign(other: Vector){
        x += other.x
        y += other.y
    }
}
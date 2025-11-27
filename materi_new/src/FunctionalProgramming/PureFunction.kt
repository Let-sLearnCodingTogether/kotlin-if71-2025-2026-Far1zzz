package FunctionalProgramming

fun addPureFunction(a: Int, b: Int) : Int = a+b

var count = 0
fun addImpureFunction(a: Int): Int{
    count += 1
    return a+count
}

fun main() {
    addPureFunction(1,2)
    addPureFunction(1,2)
    addPureFunction(1,2)

    addImpureFunction(1)
    addImpureFunction(1)
}
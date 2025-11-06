package nextOOP

abstract class Printer(){
    abstract fun cetak()

    fun info(){
        println("info")
    }
}

class PrinterLaser() : Printer(){
    override fun cetak(){
        println("Print Pake Laser")
    }
}

fun main() {
    val printLaser = PrinterLaser()
    printLaser.cetak()
    printLaser.info()
}
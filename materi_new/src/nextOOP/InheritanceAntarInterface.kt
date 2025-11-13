package nextOOP

interface PaymentMethod {
    fun pay()
}

interface RefundMethod : PaymentMethod {
    fun refund()
}

//class bayar(private val cardNumber: String) : Refund {
//
//    override fun pay() {
//        println("Melakukan pembayaran menggunakan kartu kredit: $cardNumber")
//    }
//
//    override fun refund() {
//        println("Melakukan refund ke kartu kredit: $cardNumber")
//    }
//}

class Bank : RefundMethod{
    override fun refund(){
        println("Refund")
    }
    override fun pay(){
        println("Pay")
    }
}

fun main() {
    val bankA = Bank()
    println(bankA.pay())
    println(bankA.refund())
}

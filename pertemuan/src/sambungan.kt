fun main() {
    var prodiIf: String?=null
    println(prodiIf?.length)
    var prodiSi : String?="Informatika"
    println(prodiSi ?:"tanpa Prodi")

    var token : String?=null
    println(token!!.length)

    val email :String? = "email"
    if(email !=null)
        println(email.length)
}
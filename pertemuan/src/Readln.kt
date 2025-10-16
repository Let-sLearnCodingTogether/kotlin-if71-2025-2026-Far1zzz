fun main() {
    println("nama kamu ?")
    val name = readln()
    println("umur kamu ?")
    val ageInput = readln()
    val age = ageInput.toIntOrNull()
    if (age != null) {
        println("Nama Kamu : $name")
        println("Umur kamu jika : ${age + 10}")
    } else {
        println("Input umur tidak valid")
    }
}
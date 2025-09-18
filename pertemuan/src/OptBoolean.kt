fun main() {
    val quizPoint = 50
    val fnlExmp = 70

    val passQuiz = quizPoint > 80
    val passFnlExmp = fnlExmp > 90

    val  pass = passQuiz && passFnlExmp
    println("You : $pass")
}
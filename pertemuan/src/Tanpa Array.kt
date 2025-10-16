fun PrintUser( firsName :String ,vararg users :String ){
    print(firsName)
    for (user in users){
        print(user)
}
}



fun main() {

    PrintUser("aa","bb","cc")
}
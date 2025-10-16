fun hitungPanjanNama(nama: String?):Int
{
    if(nama!=null)
    {
        return nama.length
    }
    return 0
}

fun main() {

    print(hitungPanjanNama("nama"))
}
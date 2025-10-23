package oop

import kotlin.properties.Delegates

class nilaiMhs{
    var nilai : Float by Delegates.vetoable(0.0f){
        property, oldValue, newValue ->
        if(newValue > 0.0f && newValue <= 100f){
            println("Nilai Berhasil diubah")
            true
        }else{
            println("nilai harus lebih besar dari 0 dan lebih kecil dari 100")
            println("nilai harus lebih besar dari 0 dan lebih kecil dari 100")
            false
        }
    }
}

fun main() {
    val nilaiMhs = nilaiMhs()

    nilaiMhs.nilai = 10f
    println(nilaiMhs.nilai)

    nilaiMhs.nilai = 125f
    println(nilaiMhs.nilai)
}
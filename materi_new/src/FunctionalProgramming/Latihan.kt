package FunctionalProgramming

data class MANA(val current: Int, val max: Int){
    operator fun plus(other: MANA): MANA{
        val newMax = maxOf(this.max, other.max)
        val newCurrent = (this.current + other.current).coerceAtMost(newMax)

        return MANA(newCurrent, newMax)
    }

    operator fun inc(): MANA{
        val newCurrent = (current + 10).coerceAtMost(max)
        return copy(current = newCurrent)
    }

    operator fun minus(amount: Int): MANA{
        val newCurrent = (current - amount).coerceAtLeast(0)
        return copy(current = newCurrent)
    }
}


fun main() {
    var mana1 = MANA(50, 100)
    val mana2 = MANA(20, 50)

    println(mana1 + mana2)
    mana1++
    println(mana1)
    println(mana1 -30)
}
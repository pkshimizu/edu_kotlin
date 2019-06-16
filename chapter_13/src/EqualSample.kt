package equals

class MyInt(val value: Int) {
    override fun equals(other: Any?): Boolean =
        if (other is MyInt) value == other.value
        else false
}

fun main() {
    val a = setOf(1)
    val b = a
    println(a === b)
    println(a === setOf(a))
    println(b !== setOf(1))
    println(a === null)
    println(null === null)

    val i: Int? = 127
    println(i === 127)
    val j: Int? = 128
    println(i === 128)

    println(MyInt(1) == MyInt(1))
    println(MyInt(1) == MyInt(2))
}

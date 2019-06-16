package infixCall

class MyInt(val value: Int) {
    infix fun plus(that: MyInt): MyInt =
        MyInt(value + that.value)
}

fun main() {
    println((MyInt(1) plus MyInt(2)).value)
    println(5 shl 2)
    println(0b1010 ushr 1)
    println(0b1010 and 0b01)
    println(0b1010 xor 0b01)
    println((1..10 step 3).toList())
    println((100 downTo 0 step 20).toList())
}
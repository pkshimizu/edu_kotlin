fun main() {
    val method = Int::inc
    println(method)

    val incMethod: Int.()->Int = Int::inc
    println(123.incMethod())
    val andObject: Int.(Int)->Int = Int::and
    println(0b1010.andObject(0b0011))
    val b: (Int, Int)->Int = andObject
    println(b(0b1100, 0b1000))
    println((Int::and)(0b1100, 0b0100))

    println(listOf(1, 2, 3).map { it.inc() })
    println(listOf(1, 2, 3).map(Int::inc))

    val length: String.()->Int = String::length
    println(listOf("java", "kotlin").map(length))
}
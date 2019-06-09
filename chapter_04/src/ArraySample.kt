fun main(args: Array<String>) {
    val ints = arrayOfNulls<Int>(5)
    println(ints.size)
    println(ints[0])
    ints[0] = 123
    println(ints[0])

    val strs = arrayOf("red", "green", "blue")
    println(strs[0])

    val ints2: IntArray = intArrayOf(1, 2, 3)
    println(ints2[0])
    val chars: CharArray = charArrayOf('a', 'b')
    println("${chars[0]}, ${chars[1]}")
}

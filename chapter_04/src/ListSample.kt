fun main(args: Array<String>) {
    val ints: List<Int> = listOf<Int>(1, 2, 3)
    println(ints)
    println(ints.size)
    println(ints[0])
    val chars: MutableList<Char> = mutableListOf('a', 'b')
    println(chars)
    chars[0] = 'c'
    println(chars)

    chars += 'X'
    println(chars)
    chars -= 'X'
    println(chars)
    chars.removeAt(0)
    println(chars)
}
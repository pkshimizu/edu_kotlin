fun main(args: Array<String>) {
    val ints: Set<Int> = setOf(1, 2, 1, 3)
    println(ints)
    val chars: MutableSet<Char> = mutableSetOf('a', 'a', 'b')
    println(chars)
    chars -= 'a'
    println(chars)
}
fun main() {
    val (name, age) = Pair("Taro", 27)
    println(name)
    println(age)

    val (a, b, c) = object {
        operator fun component1(): String = "Hello"
        operator fun component2(): Int = 123
        operator fun component3(): List<Char> = listOf('A', 'B')
    }
    println(a)
    println(b)
    println(c)
}
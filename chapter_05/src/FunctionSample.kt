fun succ(i: Int) = i + 1

fun square(i: Int): Int = i * i

fun hello(name: String): String = "Hello, $name!"

fun max(a: Int, b: Int): Int = if (b <= a) a else b

fun sum(ints: Array<Int>): Int {
    var sum = 0
    for (i in ints) {
        sum += i
    }
    return sum
}

fun sub(minuend: Int, subtrahend: Int): Int = minuend - subtrahend

fun hello2(name: String = "World"): String = "Hello, $name!"

fun sum2(vararg ints: Int): Int {
    var sum = 0
    for (i in ints) {
        sum += i
    }
    return sum
}

fun sum3(numbers: List<Long>): Long =
    if (numbers.isEmpty()) 0
    else numbers.first() + sum3(numbers.drop(1))

tailrec fun sum4(numbers: List<Long>, accumulator: Long = 0): Long =
    if (numbers.isEmpty()) accumulator
    else sum4(numbers.drop(1), accumulator + numbers.first())

fun sum5(numbers: List<Long>): Long {
    tailrec fun go(numbers: List<Long>, accumulator: Long = 0): Long =
        if (numbers.isEmpty()) accumulator
        else go(numbers.drop(1), accumulator + numbers.first())
    return go(numbers, 0)
}

fun hello3(): Unit {
    println("Hello, World!")
}

fun main(args: Array<String>) {
    val result = succ(31)
    println(result)

    println(square(5))

    println(hello("Alice"))

    println(max(12, 13))

    println(max(0, -1))

    println(sum(arrayOf(1, 2, 3)))

    println(sub(5, 3))
    println(sub(minuend = 10, subtrahend = 7))
    println(sub(subtrahend = 2, minuend = 6))

    println(hello2())
    println(hello2("Alice"))

    println(sum2(2, 3, 4))
    println(sum2(*intArrayOf(1, 2, 3)))

    println(sum3(listOf(1, 2, 3)))

    println(sum4((1L..12345).toList()))

    println(sum5((1L..100).toList()))

    hello3()
}

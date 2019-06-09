fun square(i: Int): Int = i * i

fun firstK(str: String): Int {
    tailrec fun go(str: String, index: Int): Int =
        when {
            str.isEmpty() -> -1
            str.first() == 'K' -> index
            else -> go(str.drop(1), index + 1)
        }
    return go(str, 0)
}

fun firstUpperCase(str: String): Int {
    tailrec fun go(str: String, index: Int): Int =
        when {
            str.isEmpty() -> -1
            str.first().isUpperCase() -> index
            else -> go(str.drop(1), index + 1)
        }
    return go(str, 0)
}

fun first(str: String, predicate: (Char) -> Boolean): Int {
    tailrec fun go(str: String, index: Int): Int =
        when {
            str.isEmpty() -> -1
            predicate(str.first()) -> index
            else -> go(str.drop(1), index + 1)
        }
    return go(str, 0)
}

fun firstK2(str: String): Int {
    fun isK(c: Char): Boolean = c == 'K'
    return first(str, ::isK)
}

fun firstUpperCase2(str: String): Int {
    fun isUpperCase(c: Char): Boolean = c.isUpperCase()
    return first(str, ::isUpperCase)
}

val square2: (Int) -> Int = { i: Int ->
    i * i
}

val square3 = { i: Int ->
    i * i
}

val square4: (Int) -> Int = { i ->
    i * i
}

val square5: (Int) -> Int = {
    it * it
}

fun firstWhitespace(str: String): Int {
    val isWhitespace: (Char) -> Boolean = {
        it.isWhitespace()
    }
    return first(str, isWhitespace)
}

fun firstWhitespace2(str: String): Int {
    return first(str) { it.isWhitespace() }
}

fun getCounter(): () -> Int {
    var count = 0
    return {
        count++
    }
}

inline fun log(debug: Boolean = true, message: () -> String) {
    if (debug) {
        println(message())
    }
}

inline fun forEach(str: String, f: (Char) -> Unit) {
    for (c in str) {
        f(c)
    }
}

fun containsDigit(str: String): Boolean {
    forEach(str) {
        if (it.isDigit())
            return true
    }
    return false
}

fun containsDigit2(str: String): Boolean {
    var result = false
    forEach(str) loop@ {
        if (it.isDigit()) {
            result = true
            return@loop
        }
    }
    return result
}

fun containsDigit3(str: String): Boolean {
    var result = false
    forEach(str) {
        if (it.isDigit()) {
            result = true
            return@forEach
        }
    }
    return result
}

fun main(args: Array<String>) {
    println(::square)
    val functionObject = ::square
    println(functionObject(5))

    val functionObject2: (Int) -> Int = ::square
    println(functionObject2(4))

    println(firstK("ABCDEFGHIJKLMN"))
    println(firstUpperCase("abcDefg"))

    println(firstK2("ABCDEFGHIJKLMN"))
    println(firstUpperCase2("abcDefg"))

    println(square2(5))
    println(square3(5))
    println(square4(5))
    println(square5(5))

    println(firstWhitespace("Hello, World!"))
    println(firstWhitespace2("Hello, World!"))

    val counter1 = getCounter()
    val counter2 = getCounter()
    println(counter1())
    println(counter1())
    println(counter2())
    println(counter2())
    println(counter1())
    println(counter2())

    log { "このメッセージは出力される" }
    log(false) { "このメッセージは出力されない" }

    println(containsDigit("abcdefg"))
    println(containsDigit("123456"))

    println(containsDigit2("123456"))
    println(containsDigit3("abcdefg"))

    val square6: (Int) -> Int = fun(i: Int): Int {
        return i * i
    }
    println(square6(5))

    val square7: (Int) -> Int = fun(i: Int) = i * i
    println(square7(5))
}
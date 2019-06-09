fun main(args: Array<String>) {
    for (x in arrayOf(1, 2, 3)) {
        println(x)
    }
    val names = listOf("foo", "bar", "baz")
    for (name in names) {
        println(name)
    }
    for (i in 1..10 step 2) {
        println(i)
    }

    for (item in MyIterable()) {
        println(item)
    }

    var barIndex = -1
    for (index in names.indices) {
        if (names[index] == "bar") {
            barIndex = index
            break
        }
    }
    println(barIndex)

    loop@ for (x in 1..10) {
        for (y in 1..10) {
            if (x * y == 30) {
                break@loop
            }
            println(x * y)
        }
    }
}

class MyIterator {
    operator fun hasNext(): Boolean = Math.random() < 0.5
    operator fun next(): String = "Hello"
}

class MyIterable {
    operator fun iterator() = MyIterator()
}
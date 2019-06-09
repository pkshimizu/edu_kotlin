fun main(args: Array<String>) {
    val x: Int = readLine()?.toInt()!!
    val message = when (x) {
        1 -> "one"
        2, 3 -> "two or three"
        else -> {
            "unknown"
        }
    }
    println(message)

    val message2 = when (x) {
        1 -> "one"
        in 2..10 -> "2 <= x <=10"
        else -> x.toString()
    }
    println(message2)

    val grade = when {
        x >= 90 -> 'A'
        x >= 80 -> 'B'
        x >= 70 -> 'C'
        x >= 60 -> 'D'
        else -> 'F'
    }
    println(grade)
}
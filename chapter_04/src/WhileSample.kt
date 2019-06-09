fun main(args: Array<String>) {
    var count = readLine()?.toInt()!!
    while (count-- > 0) {
        println("Hello")
    }

    do {
        println("Hello Random")
        val next = Math.random() < 0.5
    } while(next)
}

fun main(args: Array<String>) {
    val name = "Hanako"
    println("Hello, " + name + "!")
    println("Hello, $name!")

    println("""
        val name = "Hanako"
        "Hello, $name!
    """)

    println("""
        |It's
        |sunny
        |today.
    """.trimMargin())
}
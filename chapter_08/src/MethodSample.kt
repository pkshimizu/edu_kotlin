class Greeter {
    fun greet(name: String) {
        println("Hello, $name!")
    }
}

fun main(args: Array<String>) {
    val greeter = Greeter()
    greeter.greet("Kotlin")
}
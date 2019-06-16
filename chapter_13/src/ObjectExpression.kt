interface Greeter {
    fun greet()
}

fun main() {
    val myObject = object {}
    println(myObject)

    val greeter = object: Greeter {
        override fun greet() {
            println("Hello")
        }
    }
    greeter.greet()
}
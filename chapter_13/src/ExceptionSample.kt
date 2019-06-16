class MyException(message: String): Exception(message)

fun main() {
    try {
        println(1)
    } catch(e: Exception) {
        println(2)
    } finally {
        println(3)
    }
    try {
        println(1/0)
    } catch(e: Exception) {
        println(2)
    } finally {
        println(3)
    }
    println(try { "123".toInt() } catch(e: Exception) { null })
    println(try { "One".toInt() } catch(e: Exception) { null })
    throw MyException("例外だよ")
}
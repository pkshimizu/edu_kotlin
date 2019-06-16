package objectdeciaration

interface Greeter {
    fun greet(name: String)
}

object JapaneseGreeter: Greeter {
    override fun greet(name: String) {
        println("こんにちは、${name}さん！")
    }
}

fun main() {
    JapaneseGreeter.greet("たろう")
    val greeter: JapaneseGreeter = JapaneseGreeter
    greeter.greet("じろう")
}
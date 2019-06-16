package delegation

interface Greeter {
    fun sayHello(target: String)
    fun sayHello()
}

open class JapaneseGreeter : Greeter {
    override fun sayHello() {
        sayHello("匿名")
    }

    override fun sayHello(target: String) {
        println("こんにちは、${target}さん！")
    }
}

class JapaneseGreeterWithRecording : JapaneseGreeter() {
    private val greeter: Greeter = JapaneseGreeter()
    private val _targets: MutableSet<String> = mutableSetOf()

    val targets: Set<String>
        get() = _targets

    override fun sayHello() {
        greeter.sayHello()
    }

    override fun sayHello(target: String) {
        _targets += target
        super.sayHello(target)
    }
}

class GreeterWithRecording(private val greeter: Greeter) : Greeter by greeter {
    private val _targets: MutableSet<String> = mutableSetOf()

    val targets: Set<String>
        get() = _targets

    override fun sayHello(target: String) {
        _targets += target
        greeter.sayHello(target)
    }
}


fun main() {
    val greeter = JapaneseGreeter()
    greeter.sayHello()
    greeter.sayHello("たろう")

    val japaneseGreeterWithRecording = JapaneseGreeterWithRecording()
    japaneseGreeterWithRecording.sayHello("うらがみ")
    japaneseGreeterWithRecording.sayHello("がくぞ")
    japaneseGreeterWithRecording.sayHello("***")
    japaneseGreeterWithRecording.sayHello()
    println(japaneseGreeterWithRecording.targets)

    val japanese = JapaneseGreeter()
    val greeterWithRecording = GreeterWithRecording(japanese)
    greeterWithRecording.sayHello()
    greeterWithRecording.sayHello("委譲")
    println(greeterWithRecording.targets)
}
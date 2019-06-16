interface Hoge {
    fun execute() {
        println("Hoge")
    }
}

interface Fuga {
    fun execute() {
        println("Fuga")
    }
}

class HogeFuga: Hoge, Fuga {
    override fun execute() {
        super<Hoge>.execute()
    }
}

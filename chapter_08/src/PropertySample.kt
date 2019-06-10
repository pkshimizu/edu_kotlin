class Person {
    var name: String = ""
        set(value) {
            println("$value がセットされました")
            field = value
        }
    var age: Int = 0
    val nameLength: Int
        get() = name.length
    lateinit var nickname: String
}

fun main() {
    val hanako = Person()
    println(hanako.name)
    println(hanako.age)

    hanako.name = "はなこ"
    hanako.age = 25
    hanako.nickname = "はな"

    println(hanako.name)
    println(hanako.age)
    println(hanako.nameLength)
    println(hanako.nickname)
}

data class User(val id: Long, val name: String)

fun main() {
    println(User(1, "Taro") == User(1, "Taro"))
    println(User(2, "Hanako"))

    val taro = User(1, "Taro")
    println(taro)
    val newTaro = taro.copy(id=112233)
    println(newTaro)
    println(taro)

    val (id, name) = taro
    println(id)
    println(name)
}

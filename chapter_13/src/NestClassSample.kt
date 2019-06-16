package nestclass

data class User(val id: Id, val name: String) {
    data class Id(val value: Long)
    inner class Action {
        fun show(): String = "$name(${id.value})"
    }
}

fun main() {
    val id: User.Id = User.Id(123)
    println(User(id, "Taro"))

    val user = User(User.Id(123), "Taro")
    val action: User.Action = user.Action()
    println(action.show())
}
package companionobject

class User(val id: Long, val name: String) {
    companion object Pool {
        val DUMMY = User(0, "dummy")
    }
}

fun main() {
    val dummy = User.Pool.DUMMY
    println("${dummy.id}, ${dummy.name}")
    println(User.DUMMY.name)
}

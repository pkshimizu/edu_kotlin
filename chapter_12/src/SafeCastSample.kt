fun main() {
    val str: Any = "本当は文字列"
    println(str as String)
    println(str as? Int)
    println(str as Int)
}

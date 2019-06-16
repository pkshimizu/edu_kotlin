fun square(i: Int): Int = i * i

fun main() {
    val a: Int? = 5
    val aInc: Int? = a?.inc()
    println(aInc)

    val aSquare = a?.let { square(it) }
    println(aSquare)

    val foo: String? = "Hello"
    val hoge: String? = null
    val bar: String = foo!!
    println(bar.toUpperCase())

    println((foo ?: "default").toUpperCase())
    println((hoge ?: "default").toUpperCase())

    println(requireNotNull(foo, {"nullなわけがない"}))
    println(requireNotNull(hoge, {"hogeはnullであってはだめ"}))
}

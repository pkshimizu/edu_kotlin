class Container<T>(var value: T) {
    fun copyTo(to: Container<in T>) {
        to.value = value
    }
}

fun <T> box(value: T): Container<T> = Container(value)

val <T> T.string: String
    get() = toString()

interface Hoge
interface Fuga
interface Piyo: Hoge, Fuga
class Baz<T> where T : Hoge, T : Fuga

fun show(container: Container<out Any>) {
    println(container.toString())
    println(container.hashCode())
    println(container.value)
}

inline fun <reified T> Any.instanceOf(): Boolean = this is T

fun main() {
    val intContainer: Container<Int> = Container<Int>(123)
    val i: Int = intContainer.value
    println(i * 2)

    val strContainer = Container("Hello")
    println(strContainer.value.toUpperCase())

    val container: Container<Int> = box(5)
    println(container.string)

    Baz<Piyo>()

    show(intContainer)

    val a: Container<Int> = Container(15)
    val b: Container<Number> = Container(0)
    a.copyTo(b)
    println(b.value)

    val c: Container<*> = Container<Int>(5)
    val d: Container<*> = Container<String>("ABC")

    println("String".instanceOf<String>())
    println((0.5).instanceOf<Int>())
    println(setOf('5').instanceOf<Set<Char>>())
}

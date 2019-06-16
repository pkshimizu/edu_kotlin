interface Greeter {
    val language: String
    fun sayHello(target: String)
}

class EnglishGreeter : Greeter {
    override val language = "English"
    override fun sayHello(target: String) {
        println("Hello, $target!")
    }
}

open class SuperClass

interface Foo
interface Bar

class MyClass: SuperClass(), Foo, Bar

interface Foo2 {
    fun aaa()
    fun bbb()
}

interface Bar2: Foo2 {
    override fun aaa() {}
    fun ccc()
}

class Baz: Bar2 {
    override fun bbb() {}
    override fun ccc() {}
}

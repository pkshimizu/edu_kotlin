interface MyList<out T>

object Nil: MyList<Nothing> {
    override fun toString(): String = "Nil"
}

class Cons<T>(val head: T, val tail: MyList<T>): MyList<T> {
    override fun toString(): String = "$head:$tail"
}

fun headString(list: MyList<*>): String =
    when(list) {
        is Cons<*> -> list.head.toString()
        else -> "要素なし"
    }

sealed class MyList2<out T> {
    object Nil: MyList2<Nothing>() {
        override fun toString(): String = "Nil"
    }

    class Cons<T>(val head: T, val tail: MyList2<T>): MyList2<T>() {
        override fun toString(): String = "$head:$tail"
    }
}

fun headString2(list: MyList2<*>): String =
    when(list) {
        is MyList2.Cons<*> -> list.head.toString()
        else -> "要素なし"
    }

fun main() {
    println(Cons("foo", Cons("bar", Cons("baz", Nil))))
    println(headString(Cons("foo", Nil)))
    println(headString(Nil))

    println(MyList2.Cons("foo", MyList2.Cons("bar", MyList2.Cons("baz", MyList2.Nil))))
    println(headString2(MyList2.Cons("foo", MyList2.Nil)))
    println(headString2(MyList2.Nil))
}
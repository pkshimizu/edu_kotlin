package sample

class Rational(n: Int, d: Int) {
    init {
        require(d != 0) {"denominator must not be null"}
    }
    private val g = gcd(Math.abs(n), Math.abs(d))
    val numerator: Int = n / g
    val denominator: Int = d / g
    operator fun plus(that: Rational): Rational =
        Rational(
            numerator * that.denominator + that.numerator * denominator,
            denominator * that.denominator
        )
    operator fun plus(n: Int): Rational =
        Rational(numerator + n * denominator, denominator)
    override fun toString(): String = "$numerator/$denominator"
    private tailrec fun gcd(a: Int, b: Int): Int =
        if (b == 0) a
        else gcd(b, a % b)
}

operator fun Int.plus(r: Rational): Rational = r + this

fun main(args: Array<String>) {
    val half = Rational(1, 2)
    println(half.numerator)
    println(half.denominator)
    println(half)
    println(Rational(2, 5))
//    println(Rational(1, 0))
    println(Rational(2, 4))
    println(Rational(17, 17))
    println(Rational(55, 100))
    println(Rational(1234, 5678))
    println(Rational(1, 4).plus(Rational(1, 2)))
    println(Rational(1, 3).plus(Rational(4, 7)))
    println(Rational(1, 2) + Rational(1, 5))
    println(Rational(1, 6) + Rational(1, 3) + Rational(1, 2))
    println(Rational(1, 4) + 1)
    println(Rational(1, 1) + 2)
    println(3 + Rational(2, 1))
    println(1 + Rational(1, 2) + 2)
}
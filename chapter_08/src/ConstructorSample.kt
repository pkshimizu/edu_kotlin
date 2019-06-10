class Rational constructor(n: Int, d: Int) {
    val numerator: Int = n
    val denominator: Int = d
}

class Rational2(val numerator: Int, val denominator: Int) {
    constructor(numerator: Int) : this(numerator, 1)
}

class Rational3(val numerator: Int, val denominator: Int = 1) {
    init {
        require(denominator != 0)
    }
}

fun main() {
    val half = Rational(1, 2)
    println(half.numerator)
    println(half.denominator)

    val half2 = Rational2(1, 2)
    println(half2.numerator)
    println(half2.denominator)

    val five = Rational2(5)
    println(five.numerator)
    println(five.denominator)

    val four = Rational3(4)
    println(four.numerator)
    println(four.denominator)

    Rational3(4, 0)
}
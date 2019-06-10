fun countWords(s: String): Int = s.split("""\s+""".toRegex()).size

fun String.countWords2(): Int = this.split("""\s+""".toRegex()).size

val String.wordsCount: Int
    get() = split("""\s+""".toRegex()).size

fun main() {
    println(countWords("I like kotlin"))
    println("I like kotlin".countWords2())
    println("I like kotlin".wordsCount)
}

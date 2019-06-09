fun main(args: Array<String>) {
    val numberMap: MutableMap<String, Int> = mutableMapOf("one" to 1, "two" to 2)
    println(numberMap)
    println(numberMap.size)
    println(numberMap["one"])
    println(numberMap["three"])
    numberMap += "three" to 3
    println(numberMap)
}
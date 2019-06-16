enum class DrinkSizeType(val milliliter: Int) {
    SMALL(300) {
        override fun message(): String = "少ないよ！"
    },
    MEDIUM(350) {
        override fun message(): String = "無難な選択だ"
    },
    LARGE(500) {
        override fun message(): String = "流石に飲みすぎだ"
    };
    abstract fun message(): String
}

fun main() {
    val myFavoriteSize: DrinkSizeType = DrinkSizeType.LARGE
    println(myFavoriteSize)
    println(myFavoriteSize.milliliter)
    println(DrinkSizeType.MEDIUM.message())
    println(DrinkSizeType.values().toList())
    println(DrinkSizeType.valueOf("SMALL"))
    println(DrinkSizeType.values().map { type -> type.ordinal })
}

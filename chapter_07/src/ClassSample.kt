import property.Bucket

class BucketImpl(_capacity: Int): property.Bucket {
    override val capacity = _capacity
    override var quantity: Int = 0

    override fun fill() {
        quantity = capacity
    }

    override fun drainAway() {
        quantity = 0
    }

    override fun pourTo(that: Bucket) {
        val thatVacuity = that.capacity - that.quantity
        if (capacity <= thatVacuity) {
            that.quantity += quantity
            drainAway()
        } else {
            that.fill()
            quantity -= thatVacuity
        }
    }
}

fun main(args: Array<String>) {
    val bucket1: Bucket = BucketImpl(7)
    val bucket2: Bucket = BucketImpl(4)

    bucket1.fill()
    bucket1.pourTo(bucket2)

    println(bucket1.quantity)
    println(bucket2.quantity)
}
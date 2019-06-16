package override

open class Person(open val name: String) {
    open fun introduceMyself() {
        println("I am $name.")
    }
}

class Student(override val name: String, val id: Long): Person(name) {
    override fun introduceMyself() {
        super.introduceMyself()
        println("I am $name(id=$id)")
    }
}

fun main() {
    val student: Student = Student("くみこ", 123)
    student.introduceMyself()
}

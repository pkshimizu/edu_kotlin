open class Person(val name: String) {
    fun introduceMyself() {
        println("I am $name.")
    }
}

class Student(name: String, val id: Long): Person(name)

fun main() {
    val person: Person = Person("ゆたか")
    person.introduceMyself()

    val student: Student = Student("くみこ", 123)
    println(student.id)
    println(student.name)
    student.introduceMyself()

    val person2: Person = Student("たろう", 456)
    person2.introduceMyself()
}
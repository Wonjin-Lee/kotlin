import domain.Person
import domain.Rectangle

fun main() {
    val person = Person("Wonjin", true)
    println(person.name)
    println(person.isStudent)

    val rectangle = Rectangle(41, 43)
    print(rectangle.isSquare)
}
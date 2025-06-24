import domain.Person
import geometry.shapes.Rectangle

fun main() {
    val person = Person("Wonjin", true)
    println(person.name)
    println(person.isStudent)

    val rectangle = Rectangle(41, 43)
    print(rectangle.isSquare)

    print("테스트")
}
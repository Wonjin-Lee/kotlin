package geometry.shapes

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() {
            return height == width
        }
}

fun createUnitSquare(): Rectangle {
    return Rectangle(1, 1)
}
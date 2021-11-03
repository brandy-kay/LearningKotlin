class Rectangle(
    val a: Double,
    val b: Double,
) {
    init {
        println("Rectangle created with a= $a and b=$b")
    }

    fun area() = a * b
    fun perimenter() = 2 * a + 2 * b
    fun square()= a==b
}

fun main() {
    val myRectangle = Rectangle(2.4, 4.5)
    println("Rectange area is ${myRectangle.area()}")
    println("Rectangle perimeter is ${myRectangle.perimenter()}")
    println("is it a square ${myRectangle.square()}")
}
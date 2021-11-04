class Rectangle(
    val a: Double,
    val b: Double,
):Shapes("Rectange") {
    init {
        println("$name created with a= $a and b=$b")
    }

    fun area() = a * b
    fun perimenter() = 2 * a + 2 * b
    fun square()= a==b
}

fun main() {
    val myRectangle = Rectangle(2.4, 4.5)
    println("Rectangle area is ${myRectangle.area()}")
    println("Rectangle perimeter is ${myRectangle.perimenter()}")
    println("is it a square ${myRectangle.square()}")
    myRectangle.changeName("palindrom")
    println(myRectangle.name)
}
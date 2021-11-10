import kotlin.math.sqrt

class Triangle(val length:Double,
               val base:Double,
               val height:Double
):Shapes("Triangle") {
    init {
        println("The $name side are  base is $base length is $length height is $height" )
        println("The area of the $name is ${area()}")
        println("The perimeter of the $name is ${perimeter()}")

    }

    override fun perimeter() =length+base+height
    override fun area()=sqrt((perimeter()/2)*(perimeter()/2-height)*(perimeter()/2-base)*(perimeter()/2-length))
}

fun main() {
    val triangle = Triangle(12.0,10.0,12.0)
    triangle.changeName("Right angle Triangle")
    println(triangle.name)
}
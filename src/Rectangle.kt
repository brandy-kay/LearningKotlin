class Rectangle(
    val a: Double,
    val b: Double,
):Shapes("Rectange") {
    //many implementation of constuctor (constructor overloading)
    constructor(a:Double):this(a,a)
    constructor(a:Int,b:Int):this(a.toDouble(),b.toDouble())  //creating constructor of different type and casting it to double

    init {
        println("$name created with a= $a and b=$b")
    }

    override fun area() = a * b
    override fun perimeter(): Double {
        return 2.0 * a + 2.0* b
    }


    fun square()= a==b
}

fun main() {
    val myRectangle = Rectangle(2.4, 4.5)
    println("Rectangle area is ${myRectangle.area()}")
    //println("Rectangle perimeter is ${myRectangle.perimenter()}")
    println("is it a square ${myRectangle.square()}")
    myRectangle.changeName("palindrom")
    println(myRectangle.name)



}
//function overloading
fun maxArea(shape1:Shapes,shape2:Shapes):Double{
    val areaShape1 = shape1.area()
    val areaShape2 = shape2.area()
    return if (areaShape1>areaShape2) areaShape1 else areaShape2
}
fun maxArea(shape1:Shapes,shape2:Shapes,shape3:Shapes):Double{
    val maxArea1Area2 = maxArea(shape1,shape2)
    val areaShape3 = shape3.area()
    return if (maxArea1Area2>areaShape3) maxArea1Area2 else areaShape3
}
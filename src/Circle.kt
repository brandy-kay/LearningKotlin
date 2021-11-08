import kotlin.random.Random

class Circle(val radius:Double):Shapes("Circle") {

    //Singleton behaviour which can be instantiated
        companion object{
            fun randomCircle():Circle{
                val radius = Random.nextDouble(1.0,10.0)
                return Circle(radius)
            }
        }

    init {
        println("This is a $name")
    }

    override fun area(): Double {
        return radius*radius*ImportantNumbers.PI
    }

    override fun perimeter(): Double {
      return 2*radius*ImportantNumbers.PI
    }
}

fun main() {
    //accessing the companion object no need to create instance of the class.
    val circle= Circle.randomCircle()
}
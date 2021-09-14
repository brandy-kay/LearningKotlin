fun main() {
    var x=70
    var y=30
    println("The result of x+y=${x+y}") //addition
    println("The result of x-y=${x-y}")//subtraction
    println("The result of x/y=${x/y}") //division
    println("The result of x%y=${x%y}") //remainder operator
    println("The result of x*y=${x*y}") //multiplication

    //Decimal numbers
    println(22/7) //give a 3 whole number as output
    var num =22F
    var numb=7F
    println(num/numb) //gives a decimal number as output with a float type

    var num2:Double=22.34556677797878
    println(num2/numb) //gives a decimal number as output but it a double type

    //volume of a sphere
    var r=15
    val pi=3.142
    val volume:Double= 0.75 * pi *(r*r*r)
    println("The volume of a sphere $r is $volume")

    //shift operator
    println(1 shl 3) //shift to the left
    println(32 shr 2) //shift to the right
}
fun main() {
    var x = 70
    var yyy = 30
    println("The result of x+y=${x + yyy}") //addition
    println("The result of x-y=${x - yyy}")//subtraction
    println("The result of x/y=${x / yyy}") //division
    println("The result of x%y=${x % yyy}") //remainder operator
    println("The result of x*y=${x * yyy}") //multiplication

    //Decimal numbers
    println(22 / 7) //give a 3 whole number as output
    var num = 22F
    var numb = 7F
    println(num / numb) //gives a decimal number as output with a float type

    var num2: Double = 22.34556677797878
    println(num2 / numb) //gives a decimal number as output but it a double type

    //volume of a sphere to practise double and float
    var r = 5.5
    val pi = 3.142
    val volume: Double = 0.75 * pi * (r * r * r)
    println("The volume of a sphere $r is $volume")

    //shift operator
    println(1 shl 3) //shift to the left
    println(32 shr 2) //shift to the right

    //strings
    val name = "Brandy".toUpperCase()
    println("My name is: ${name.toLowerCase().reversed()}")

    //logical and comparison operators
    val number1 = 3
    val number2 = 3

    val xx = 27
    val yy = 30
    println(number2 == number1 && xx == yy) //AND operator
    println(number2 == number1 || xx == yy) //OR operator
    println(!(number2 == number1) && xx == yy) //NOT operator
    println("Is the two number equal ${number1 == number2}")
    println("Is number1 grater than number2  ${number1 > number2}")
    println("Is number1 less than number2  ${number1 < number2}")
    println("Is number1 not equal to  number2  ${number1 != number2}")

    //practise
    val simpleExpression = 3 > 4 || 4 > 3 && 4 <= 4
    println(simpleExpression)

    val bool = true
    val m = 9
    val n = 3
    val y = 9

    val hardExpression = !(m!=y)&&bool || y>(m+n)&&(!bool || n<y)
    println(hardExpression)
}
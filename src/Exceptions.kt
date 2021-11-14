fun main() {
   val division = try {
       divideTwoNumbers(2.2,0.0)
   } catch (e:DivideByZeroException){
       0.0
   }
    println("Your answer for division is : $division")

    println("please enter a number")
    //try executed when the input is of the right format
    //catch is executed if the input is of wrong format
    //finally is executed on both conditions
    val input = try {
        readLine()?.toInt()
    } catch(e: NumberFormatException){
        0
    }
    finally {
        println("this is a finally block")
    }
    println("You entered number is  $input")
}
class DivideByZeroException :Exception("You cannot divide by zero") //creating exception class

fun divideTwoNumbers(a:Double ,b:Double):Double{
    throw DivideByZeroException() //rendering the created exception
    return a/b
}
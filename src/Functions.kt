fun main() {
   val  num1=multiply(num = 2,multiplier = 5) //parameter named arguments
   val num3= multiply(2,10)//giving default values

    println(num3)
    println(num1)
    val mult = ::multiply //assign function to variable using method reference operator(::)
    println(mult(2,4))

}
//defining a function with return type
fun multiply (num:Int, multiplier:Int) : Int{
    return num*multiplier
}
fun valueIncrementNumber(mult:(Int,Int)->Int/*function as variable */,values:Int){ //parameter as value
    val newValue=values+1
    println(newValue)
}

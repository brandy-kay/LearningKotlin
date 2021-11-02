fun main() {
    val num1 = multiply(num = 2, multiplier = 5) //parameter named arguments
    val num3 = multiply(2, 10)//giving default values
   // powerValue(3,5)
    val pow = powerValue(3,5)
    println("The power of 3 and 5 is $pow")
    sumValue(5)

    println(num3)
    println(num1)
    val mult = ::multiply //assign function to variable using method reference operator(::)
    println(mult(2, 4))

    fun sum(a: Int, b: Int) = a + b //single line function

    //search for entered value
    val list = listOf(1,3,4,5,2,6,7,8,9,10)
    println("Search for this number")
    val input = readLine()?.toInt()
    if(input!=null){
        println("The index of $input is ${indexOf(list,input)}")

        //extension function
        if(input.isPrimeNumber()){
            println("$input is prime number")
        }
        else{
            println("$input is not a prime number")
        }
    }
}

//defining a function with return type
fun multiply(num: Int, multiplier: Int): Int {
    return num * multiplier
}

fun valueIncrementNumber(mult: (Int, Int) -> Int/*function as parameter */, values: Int) { //parameter as value
    val newValue = values + 1
    println(newValue)
}
// function that return a power value of two parameters
fun powerValue(base:Int,exponent:Int) :Int{
    var result = 1
    for (i in 1..exponent){
        result *= base
    }
   // println("The value $base to the power $exponent is $result")
    return  result
}
fun sumValue (num: Int){
    var sum=0
    for (i in 1..num){
        sum += i
    }
    println("The sum of $num is $sum")
}
// searches for index of value entered if present in a list
fun indexOf(list:List<Int>,value:Int):Int{
    for (i in 0..list.size-1){
        if (list[i]==value){
            return i
        }
    }
    return -1
}
//Extension functions
fun Int.isPrimeNumber():Boolean{
    for(i in 2 until this-1){
        if (this%i==0){
            return false
        }
    }
    return true

}
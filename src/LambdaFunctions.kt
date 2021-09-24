fun main() {
    //declaration of variable that hold lambda functions
    val mulitplyLambda : (Int,Int)  -> Int

    //assigning lambda with function
    mulitplyLambda={a:Int,b:Int -> Int
        a*b
    }
    println(mulitplyLambda)

    //using it
    var doubleLambda = {a:Int ->
        2*a
    }
    doubleLambda = {2*it}
    println(doubleLambda)

    //it used in new declaration
    var square:(Int) -> Int = {it*it}
    println(square)
    operationNumbers(4,2 ,oper = {a:Int,b:Int -> a+b})

}
//lambda as an argument
fun operationNumbers(
    a:Int,
    b:Int,
    oper:(Int,Int)->Int)/*lambda as an argument */:Int{
    val result =oper(a,b)
    println(result)
    return result
}
fun main() {
    var age : Int? = 21  // declare variable of null type
    println(age)

    //println(age+1)  //raises an error
    //to remove null
    val afterbirthday = age!!+1 //!! not-null assertion operator
    println(afterbirthday)
    val ageC=age?.toChar() //?. safe call
    println(ageC)

    val userInput = readLine() //allow user to enter inputs
    if (userInput != null)
        println(userInput.toInt()-5) //performs arithmetic operations when enters a string causes an error

//assignment


}
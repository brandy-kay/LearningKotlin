fun main() {
    var age: Int? = 21  // declare variable of null type
    println(age)

    //println(age+1)  //raises an error
    //to remove null

    //!! not-null assertion operator
    val afterbirthday = age!! + 1
    println(afterbirthday)

    //?. safe call allows the use of various methods
    val ageC = age?.toChar()
    println(ageC)

    //smart casts
    val userInput = readLine() //allow user to enter inputs
    if (userInput != null)
        println(userInput.toInt() - 5) //performs arithmetic operations when enters a string causes an error

//let() function is used with the help of safe call ?.
    val authorName: String? = "Daphine"
    authorName?.let {
        var nonNullableAuthor = authorName
        var nameLength = authorName.length

        println(nonNullableAuthor)
        println(nameLength)
    }

    //Elvis operator ?:
    var num: Int? = null
    var mustHaveNum = num ?: 0 //using elvis operator mustHaveNum will either cointain num value if not null or 0 if num is null.
    println(mustHaveNum)

    //example
    println("Please enter your age")
    val ageNum = readLine() ?. toInt()

   if (ageNum!=null) //using smart cast
   {
       if (ageNum>0 && ageNum <18){
           println("You are not an adult yet")
       }
       else if(ageNum >=18 && ageNum <=65){
           println("You are an adult")
       }
       else{
           println("You  are to old")
       }
   }



}
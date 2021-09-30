fun main() {
    var age = readLine()?.toInt()
    val x =5

    when (age) {
        in 1..5 -> println("You are so young")
        in 6..17 -> if (x==6){           //making condition with when
            println("you are a teenager")
            println("Not an elder member")
        }
        18 -> println("you are now 18")
        19,20 -> println("you are a young adult")
        in 21..65 -> println("You are an adult")
        else ->{
            println("Able to vote ")
            println("an elder member")
        }
    }
    println("Enter a number?")
    val num = readLine()?.toInt()
    var i = num
    if (i != null) {
        println("lets count now")
        while (i >= 0){
            println(i)

            i--
        }
    }


 // nested if else

 /*if (age<18){
     val z = if(age>18) 22 else 16 //giving value to z according to conditions
     println("Not able to vote")
 }
 else if (age>60)
 {
     println("able to vote and an elder member")
 }
 else{
     println("able to vote and a young citizen")
 }*/


/*    if(age<18){
     println("Not able to vote")
 }
 else{
     println("Can vote")
     if (age>60){
         println("an elder member")
     }
     else{
         println("Young member")
     }
 }*/
   //palindrome
   val string = "Brandy"  //"racecar"
   if(string==string.reversed()){
       println("The string is a palindrome")
   }
    else{
        println("Augh!! not a palindrome")
   }
}

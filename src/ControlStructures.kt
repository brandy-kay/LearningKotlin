fun main() {
    var age = 70

    when (age) {
        in 1..17 -> println("Not able to vote")
        in 18..60 -> {
            println("able to vote")
            println("Not an elder member")
        }
        else ->{
            println("Able to vote ")
            println("an elder member")
        }
    }


 // nested if else
 /*if (age<18){
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
}
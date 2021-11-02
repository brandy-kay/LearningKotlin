fun main() {
    val array = intArrayOf(15,16,17,18,19,20)
    val max = getMax(1,2,3,4,5,6,7,8,9,10,*array,30,15,23,45,11)
    println("The maximum number is $max")
    searchFor("How to be come a best programmer") //searchEngine is initialised can still be omited it takes the default
    searchFor("How to become a google developer","OperaMini")

    //Named parameter
    searchFor(search = "How to be come a good ml expert",searchEngine = "Chrome")
}
//Defaults
fun searchFor(search:String,searchEngine:String="Google"){
    println("Searching for '$search' on $searchEngine")
}

//varargs
fun getMax(vararg  numbers:Int):Int{
    var max = numbers[0]
    for (number in numbers){
        if (max<number){
            max=number
        }
    }
    return max
}

/*
fun alternatingSum(vararg numbers:Int):Int{

}*/

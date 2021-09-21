fun main() {
    //creating map using mapOf()
    var yearOfBirth = mutableMapOf( //takes key as String and value as Integer
        "Brenda" to 1999,
        "Brandon" to 1998,
        "Brandy" to 2000,
        "Breanna" to 2001,
    )
    //creating empty map
    /*var nameAndScore = hashMapOf(20) //20 is the capacity of the map created
    var nameAndScore = mutableMapOf()*/

    //Accessing map values
    println(yearOfBirth["Brenda"]) //using key
    println(yearOfBirth.get("Brandy")) //using property method
    println(yearOfBirth.isEmpty())
    println(yearOfBirth.size)

    //adding element to the map
    yearOfBirth.put("beberu",1998) //using put method
    yearOfBirth["baba"]=1989 //using index
    //use of infix operator
    val pair = "Barbra" to 2009
    yearOfBirth += pair
    println(yearOfBirth)

    //removing pair
    yearOfBirth.remove("baba")

    //iterating through map
    for((name, date) in yearOfBirth) {
        println("$name - $date")
    }
    //iterating map key
    for (name in yearOfBirth.keys){
        print(" $name ")
    }


}
import sun.audio.AudioPlayer
import sun.audio.AudioPlayer.player

fun main(args: Array<String>) {
    val evenNumber = arrayOf(2, 4, 5, 66)//creating an array which is of type Array<Int>
    println(evenNumber[3])
    val fiveFives = Array(5, { 5 }) //{5}-lambdas in kotlin
    val vowel = arrayOf("a", "e", "i", "o", "u") //creating array of type String

    //creating array of specific type
    val oddNumber = intArrayOf(1, 3, 5, 7, 9, 11) //array of type integer
    println(oddNumber[4])
    val zeros = DoubleArray(4)
    println(zeros[3])
    val other = arrayOf(1,2,3,45,5,6,7,).toIntArray() //is of type Int and not Array<Int>

    //LIST

    //creating list elements which cannot be altered with
    val innerPlanets = listOf("Mercury","Venus","Earth","Mars") //is immutable and cannnot be altered
    val outerPlanets = arrayListOf("Jupiter","Saturn","Uranus","Neptune") //creating list of type array

    //creating list that can be altered with
    var number = mutableListOf(1,2,3,4,5,6,) //list of numbers
    val player = mutableListOf("Brandy","Sophy","Daphy","Vivian") //using mutableListof makes it altered with
    println(player.isEmpty()) //checks if the list is empty

    //to set players
    if (player.size<2){
        println("We need at least two")
    }
    else{
        println("Start to play")
    }
    // several methods of list
    var currentPlayer = player.first()
    println("Current player is $currentPlayer")
    var lastPlayer = player.last()
    println("Last player is $lastPlayer")
    var minimumNumber = number.minOrNull()
    println("Minimum Number is $minimumNumber")
    var maximumNumber = number.maxOrNull()
    println("Maximum Number is $maximumNumber")

    //accessing elements using indexing
    val firstPlayer = player[0] //using indexing
    println("First player is $firstPlayer")
    val secondPlayer = player.get(1) //using get method
    println("Second player is $secondPlayer")

    //using range to slice
    val upcomingPlayer = player.slice(1..3)
    println("Upcoming players are $upcomingPlayer")

    //cheeking for an element in list
    player.slice(1..3).contains("Sophy") //using contain method
  /*  fun isEliminated(playee:String) : Boolean{
        return playee !in AudioPlayer.player
    }*/

    //Modifying Elements in list
    player.add("Chris") //appending element
    player +="Fineess" //using += operator
    println(player.joinToString()) //including the added players

    //inserting elements
    player.add(5,"Scovia") //specify the index and the element
    println(player)
    //removing player
    val eliminated = player.removeAt(5) //removing by index
        //remove("fineess") //removing player by element
    println("eliminated player $eliminated")

    //updating elements
    player[5] = "macreen"
    player.set(2,"isaack") //update by specifying index and element
    player.sort() //arrange by laters
    println(player.joinToString())

    //iterating through a list with a for loop
    for (playee in player) {
        println(playee)
    }
}


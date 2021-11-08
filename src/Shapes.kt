 abstract class Shapes(var name:String) {

    init {
        println("My name is $name")
    }
    fun changeName(newName:String){
        name=newName
    }
     abstract fun area():Double
     abstract fun perimeter():Double
     //abstract fun perimenter(): String
 }
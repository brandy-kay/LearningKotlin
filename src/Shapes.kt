 open class Shapes(var name:String) {

    init {
        println("My name is $name")
    }
    fun changeName(newName:String){
        name=newName
    }
}
class CustomTripleGenericClass<A:Any,B:Any,C:Any>(
    val first:A,
    val second:B,
    val third:C
) {
    fun printType(){
        println("The first value is ${first::class}")
        println("The first value is ${second::class}")
        println("The first value is ${third::class}")
    }
}

fun main() {
    val customTripleGenericClass= CustomTripleGenericClass<Int,String,Boolean>(3,"Daphy",true)
    customTripleGenericClass.printType()

    fun doSomething(x: Int): List<Int> {
        val list = mutableListOf<Int>()
        var bool = false
        for(i in 2..x) {
            for(j in 2 until i) {
                if(i % j == 0) {
                    bool = true
                }
            }
            if(!bool) {
                list.add(i)
            }
            bool = false
        }
        return list
    }
}
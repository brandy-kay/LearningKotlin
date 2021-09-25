import kotlin.system.exitProcess

class Mpesa(private var balance: Int, private val charges: Int) {
    fun checkBalance(): Int {
        return balance
    }

    fun deposit(amount: Int) {
        balance += amount
        println("you have deposited $amount your balance is $balance")
    }

    fun withdraw(amount: Int) {
        if (amount <= charges) {
            println("the amount to be withdrawn is minimal")
        } else {
            balance = balance - charges - amount
            println("you have withdrawn $amount your balance is ${balance}")
        }
    }
}

data class User(
    val name: String,
    val email: String,
    val phoneNumber: Int,
)

fun main() {
    val mpesa =Mpesa(3000,30)

    while (true){
        println("choose 1 to check balance")
        println("choose 2 to deposit amount")
        println("choose 3 to withdraw amount")
        println("choose 4 to exit" )

        var choice: Int = readLine()!!.toInt()
        if (choice != null){
            when (choice){
                1 -> {
                    println(mpesa.checkBalance())
                }
                2 -> {
                    mpesa.deposit(2000)
                }
                3 ->{
                    mpesa.withdraw(600)
                }
                4 ->{
                    exitProcess(0)
                }
                else ->{
                    println("no such service")
                }
            }
        }
    }
}
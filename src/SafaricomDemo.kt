class SafaricomDemo : Safaricom {
    override fun sendMoney() {
        val amount = 2000
        val balance = 1000
        val sent = amount-balance
        println(sent)
    }

    override fun withdraw() {
        TODO("Not yet implemented")
    }

    fun checkBalance(amount: Int){

    }

    fun checkBalance(amount: Double){

    }
}
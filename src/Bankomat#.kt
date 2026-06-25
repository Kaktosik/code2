data class Card(private var pincode : String,
    private var balance: Double = 0.0
){
    fun showBalance(){
        println("You have a $$balance ")
    }
    fun PincodeChecker(pin : String) : Boolean{
        return pin == pincode
    }
}

fun main(){
    val card = Card()
    println("Write a Pincode")

}

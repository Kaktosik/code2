import java.util.Scanner

data class Card(private var pincode : String,
                private var balance: Double = 0.0
){
    fun showBalance(){
        println("You have a $$balance ")
    }
    fun pincodeChecker(pin : String) : Boolean{
        return pin == pincode
    }
    fun addDeposit(amount: Double){
        if (amount > 0){
            balance += amount
        } else println("Вводить отрицательные числа, категорически запрещено!")
    }
    fun withdrawl(amount: Double){
        val a = amount + amount * 0.5 / 100
        if (balance >= a) balance-=a
        else println("У вас недостаточно средств.")
    }

}

fun main(){
    val scan = Scanner(System.`in`)



    val cardd = Card("654321")
    println("Write a Pincode")
    if(cardd.pincodeChecker(scan.next())){
        while (true){
            println("1). Проверить баланс.")
            println("2). Перевести деньги на карту.")
            println("3). Вывести деньги с карты.")
            println("4). Отмена.")
            val cmd = scan.nextInt()
            when(cmd){
                1 -> println(cardd.showBalance())
                2 -> {
                    println("Введите сумму перевода.")
                    val deposit = scan.nextDouble()
                    cardd.addDeposit(deposit)
                }
                3 -> {
                    println("Введите сумму вывода с карты.")
                    val withDrawl = scan.nextDouble()
                    cardd.withdrawl(withDrawl)
                }
                else -> break
            }
        }
    } else println("Pincode неверный.")



}

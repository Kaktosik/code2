import java.util.Scanner
import kotlin.coroutines.suspendCoroutine
import kotlin.math.sqrt

fun Ll(slovo: String): Int{
    return slovo.length
}
fun Int.chet(){
    if (this % 2 == 0) println(true)
    else println(false)
}
fun Double.pp(){
    if (this > 0) println("+")
    else if (this < 0) println("-")
    else println(0)
}



fun kVnaiti(number: Int){
    val kvadrat = number * number
    println(kvadrat)
}
fun st(number: Int){
    var n = 1
    for (i in 1..number){
        n *= number
    }
    println(n)

}

fun main() {
    /*println("Bla bla bla ble ble ble blu blu blu")
    Privet("Rock")
    println(Summa(60, 7))
    val  scan = Scanner(System.`in`)*/
    println(kVnaiti(42))
    println(st(42))
    println(Privet())
    println(chtoto(5, 6))

    println(Ll("Daniel"))

    67.chet()
    25.5.pp()

    println(powerA3(3f))
}

fun Privet(komu: String = "Joseph"){
    println("Hi, $komu")
}

fun Summa(a: Int, b: Int): Int{
    return a+b
}

fun chtoto(a: Int, b: Int): Int{
    return if (a>b){
        a
    } else b
}

fun powerA3(x: Float){
    var cube = 1f
    for (i in 1 .. 3){
        cube *= x
    }
    println("$x³ = $cube")
}







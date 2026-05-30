import java.util.Scanner

fun main(){
    val scan = Scanner(System.`in`)
    val m = MutableList(10){scan.nextInt()}
    val m1 = mutableListOf<Int>()

    m1.add(6776)

    m.remove(6)

    println(m)
    println(m1)
}
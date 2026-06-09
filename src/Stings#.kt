import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)

    val slovo = "Здрасте 67"
    val sixseven = "67"
    val name = "Daniel"
    println(sixseven.reversed())
    println(slovo.reversed())
    println(name.reversed())
    println(name.uppercase())
    println(name.lowercase())
    println(name.replace('l' , 'k'))
    println(name.contains('d',  true))
    println(name.contains("d", true))

    val k = "kOtLiN"
    val a = k.toCharArray()
    for (i in a.indices){
        if (a[i].isLowerCase())a[i] = a[i].uppercase()[0]
            else a[i] = a[i].lowercase()[0]
    }
    println(a.joinToString(""))








}



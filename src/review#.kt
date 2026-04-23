import java.util.Scanner

fun main(){
    val scan= Scanner(System.`in`)


    //1
    /*val a=scan.nextInt()
    val b=scan.nextInt()
    println(a+b)*/


    //2
    /*val a=scan.nextInt()
    if (a%2==0) println("чётное число.")
    else if (a%2==1)println("нечётное число.")
    else println("error")*/


    //3
    /*val a=scan.nextInt()
    val b=scan.nextInt()
    if (a>b){
        println(a)
    }
    else if (a<b){
        println(b)
    }
    else println(-1)*/

    //4
    /*val a=scan.nextInt()
    if (a>0) println("positive")
    else if (a<0)println("negative")
    else println("zero")
*/


    //5
    /*val a=scan.nextInt()
    var aa= a
    for (i in 1..10){
        aa*=i
        println(aa)
    }*/


    //6
    /*val n = scan.nextInt()
    var k= 0
    for (i in 1..n){
        k+=i
    }
    println(k)*/

    //7
    /*val a=scan.nextInt()
    var k= 1
    for (i in 1..a){
        k*=i
    }
    println("факториал числа $a равен $k")
*/

    //8
   /* val a=scan.nextInt()
    val b=scan.nextInt()
    val ab= a+b
    val aa= a-b
    val bb= a*b
    val ba= a/b
    println("a+b=$ab\na-b=$aa\na*b=$bb\na/b=$ba")*/

    //9
    /*val a=scan.nextInt()
    val aa= when(a){
        0..59 -> "F"
        60..69 -> "D"
        70..79 -> "C"
        80..89 -> "B"
        90..100 -> "A"
    }
    println(aa)*/

    //10
    /*val a=scan.nextInt()
    if (a % 4==0 && a%100 !=0) println("високосный год")
    else println("обычный год")*/


    //13
    /*val n= scan.nextInt()
    for (i in 0..n step 2){
        println(i)
    }*/


    //14
    /*var a=scan.nextInt()
    var k= 0
    while (a>0){
        val ak= a%10
        k+= ak
        a/=10
    }
    println(k)*/



 }
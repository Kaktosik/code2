import java.util.Scanner
import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sin
import kotlin.math.sqrt

fun main(){
    val scan= Scanner(System.`in`)
    //for loop1
    /*val n= scan.nextInt()
    val k= scan.nextInt()
    for (i in 1..n)
    println("$k $i")*/

    //for loop2
    /*val a= scan.nextInt()
    val b= scan.nextInt()
    var count= 0
    for (n in a..b){
        println(n)
        count++
    }
        println(count-2)*/

    //for loop3
    /*val a= scan.nextInt()
    val b= scan.nextInt()
    var c= 0
    for (i in b downTo a) {
        println(i)
        c++
    }
    println(c-2)*/

    //for loop4
    /*val a= scan.nextDouble()
    for (i in 1..10)
        println("$i kg konfet stoit ${i*a}")*/

    //for loop5
    /*val a=scan.nextDouble()
    for (i in 1..10) println("${i*0.1} kg конфет стоит ${i*a*0.1}")*/

    //for loop6
    /*val a=scan.nextDouble()
    for (i in 12..20 step 2) println("${i*0.1} кило конфет стоит ${i*a*0.1}")*/

    //for loop7
    /*val a=scan.nextInt()
    val b=scan.nextInt()
    var s=0
    for(i in a..b){ 5-10
        s+=i
    }
    println(s)*/

    //for loop8
    /*val a=scan.nextInt()
    val b=scan.nextInt()
    var k=1
    for(i in a..b) {
        k*=i
    }
    println(k)*/

    //for loop9
    /*val a=scan.nextInt()
    val b=scan.nextInt()
    var k= 0
    for (i in a..b) {
        k+= i*i
    }
    println(k)*/

    //for loop10
    /*val a=scan.nextInt()
    var k= 0.0
    for (i in 1..a) {
        k+=1/i.toDouble()
    }
    println(k)*/

    //for loop11
    /*val a=scan.nextInt()
    var k= 0
    for(i in 0..a){
        k+= (a+i)*(a+i)
    }
    println(k)*/

    //for loop12
    /*val l=scan.nextInt()
    var k= 0.0
    for (i in 1..l){
        k+= (i*10)/10.0
    }
    println(k)*/

    //for loop13
    /*val a= scan.nextInt()
    var t= 1
    var s= 0.0
    for (i in 1..a){
        s+=(10+i)/10.0*t
        t*= -1
    }
    println("$s")*/

    //for loop 14
    /*val n= scan.nextInt()
    var k=0
    for (i in 1..n*2-1 step 2){
        k+= i
    }
    println(k)*/

    //for loop 15
    /*val a=scan.nextDouble()
    val n=scan.nextInt()
    var k= 1.0
    for (i in 1..n){
        k*=a
    }
    println(k)*/

    //for loop 16
    /*val a = scan.nextDouble()
    val n= scan.nextInt()
    var k=1.0
    for (i in 1..n){
        k*=a
        println("$a ^ $i = $k")
    }*/

    //for loop 17
    /*val a=scan.nextDouble()
    val n= scan.nextInt()
    var k= 0.0
    var p= 1.0
    for (i in 1..n){
        k+=p
        p*=a
    }
    println(p)*/

    //for loop 18
    /*val a=scan.nextDouble()
    val n=scan.nextInt()
    var k= 0.0
    var p= 1.0
    for (i in 0..n){
        k+=p* (-1.0).pow(i.toDouble())
        p*=a
    }
    println(p)*/

    //for loop 19
    /*val a= scan.nextInt()
    var k=1.0
    for (i in 1..a){
        k*=i
    }
    println(k)*/

    //for loop 20
    /*val n= scan.nextInt()
    var k=1.0
    var p= 0.0
    for (i in 1..n){
        k*=i
        p+=k
    }
    println(p)*/


    //for loop 21
    /*val n=scan.nextInt()
    var k= 1.0
    var p= 1
    for (i in 1..n){
        p*=i
        k+= 1.0 / p
    }
    println(k)*/


    //for loop 22
    /*val x= scan.nextDouble()
    val n= scan.nextInt()
    var k= 1.0
    var p= 1.0
    var y= 1.0
    for (i in 1..n){
        p*= i
        y*= x
        k+= y / p
    }
    println(k)*/

    //for loop 29
    /*val a=scan.nextDouble()
    val b=scan.nextDouble()
    val n=scan.nextInt()
    var x= (b-a) / n
    for (i in 1..<n){
        println(a+x*i)
    }*/

    //for loop 30
  /*  val a=scan.nextDouble()
    val b=scan.nextDouble()
    val n= scan.nextInt()
    var x= (b-a) / n
    for (i in 1..<n){
        println(1- Math.sin(a+x*i))
    }
*/
    //for loop 31
    /*val n=scan.nextInt()
    var a= 2.0
    for (i in 1..n){
        val aNext= 2+1/a
        print("$aNext ")
        a=aNext
    }*/

    //for loop 32
    /*val n= scan.nextInt()
    var a= 1.0
    for (i in 1..n){
        val aNext= (a+1)/i
        print("$aNext ")
        a= aNext
    }*/


    //for loop 33
    /*val n= scan.nextInt()
    var f1 = 1
    var f2 = 1
    print("$f1 $f2")
    for (i in 1..n){
        val f= f1+f2
        f2=f1
        f1=f
        print("$f1 $f2")
    }*/

    //for loop 34
    /*val n= scan.nextInt()
    var a1= 1.0
    var a2= 2.0
    for (i in 1..n){
        val ak= (a2+2*a1)/3
        print("$ak ")
        a1=a2
        a2=ak
    }*/

    //for loop 35
    /*val n=scan.nextInt()
    var a1= 1.0
    var a2= 2.0
    var a3= 3.0
    for (i in 2..n){
        val ak= a1+a2-2*a3
        print("$ak ")
        a1=a2
        a2=a3
        a3=ak
    }*/

    //for loop 36
    /*val n= scan.nextInt()
    val k= scan.nextInt()
    var s= 0
    for (i in 1..n){
        var p= 1
        for (j in 1..k){
            p*=i
        }
        s+=p
    }
    println(s)*/

    //for loop 37
    /*val n= scan.nextInt()
    var s= 0
    for (i in 1..n){
        var p=1
        for (j in 1..i){
            p*= i
        }
        println(p)
        s+= p
    }
    println(s)*/

    //for loop 38
    /*val n=scan.nextInt()
    var s= 0.0
    for (i in 1..n){
        var p= 1.0
        for (j in 1..n-i+1){
            p*=i
        }
        println(p)
        s+=p
    }
    println(s)*/

    //for loop 39
    /*val a=scan.nextInt()
    val b=scan.nextInt()
    for (i in a..b){
        for (j in 1..i){
            print("$i ")
        }
        println()
    }
*/

    //for loop 40
    /*val a=scan.nextInt()
    val b=scan.nextInt()
    for (i in a..b){
        for (j in a..i){
            print("$i ")
        }
        println()
    }*/


}
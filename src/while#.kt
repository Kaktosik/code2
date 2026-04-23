import com.sun.tools.javac.Main
import java.util.Scanner

fun main(){
    val scan= Scanner(System.`in`)


    //while 1
    /*var a=scan.nextInt()
    var b=scan.nextInt()
    // a % b
    while (a >= b){
        a-=b
    }
    println(a)*/

    //while 2
    /*var a= scan.nextInt()
    var b= scan.nextInt()
    var s= 0
    while (a >= b){
        a-=b
        s++
    }
    println(s)
*/

    //while 3
    /*var n=scan.nextInt()
    var k=scan.nextInt()
    var a= 0
    while (n >= k){
        n-=k
        a++
    }
    println("$a  $n")
    */

    //while 4
    /*val n=scan.nextInt()
    var p=1
    while (p < n){
        p*=3
    }
    println(p==n)*/

    //while 5
    /*var n=scan.nextInt()
    var p= 1
    var k = 0
    while (p < n){
        p*=2
        k++
    }
    println(k)*/

    //while 6
    /*var n=scan.nextInt()
    var a= 1
    while (n>0){
        a*= n
        n-=2
    }
    println(a)
*/
    //while 7
    /*var n=scan.nextInt()
    var k = 0
    while (k * k <= n){ //k * k > n
        k++
    }
     println(k)*/

    //while 8
   /* var n=scan.nextInt()
    var k= 0
    while ((k + 1)*(k + 1) <= n){
        k++
    }
    println(k)*/

    //while 9
    /*var n=scan.nextInt()
    var k= 0
    var p = 1
    while (p<=n){
        p*=3
        k++
    }
    println(k)*/

    //while 10
    /*var n=scan.nextInt()
    var k= 0
    var p= 1
    while (p*3<=n){
        k++
        p*=3
    }
    println(k)*/

    //while 11
    /*val a=scan.nextInt()
    var k=0
    var s=0
    while (s<a){
        k++
        s+=k
    }
    println("s=$s,k=$k")*/

    //while 12
    /*var a=scan.nextInt()
    var k=0
    var s=0
    while (s+k+1<a){
        k++
        s+=k
    }
    println("s=$s\nk=$k")*/

    //while 13
    /*var a= scan.nextInt()
    var s= 0
    var d= 0
    while (){
        d++
        s+=d
    }
    println("k=$d, s=$s")*/

    //while 14
    /*var a=scan.nextInt()
    var k= 0
    var s= 0
    while ()*/

    //while 15
    /*val bucks= scan.nextDouble()
    val em= scan.nextDouble()
    val k= bucks * em / 100
    var money = bucks
    var month=0
    while (money <= 2 * bucks ){
        month++
        money+= k
    }
    println("через $month месяцев ваш баланс будет состовлять $money")*/


    //while 16
    /*var s= 10.0
    var p= scan.nextInt()
    var j= s
    var k= 1
    while (j <= 200){
        s+= s*p / 100
        j+= s
        k++
    }
    println("$k спустя он пробежит $j km")*/

    //while 17
    /*var n=scan.nextInt()

    while (n>0){
        val a= n%10
        print("$a ")
        n/=10
    }*/

    //while 18
    /*var a=scan.nextInt()
    var kk=0
    var k1= 0
    while (a>0){
        val k= a%10
        kk++
        a/=10
        k1+=k
    }
    println("сумма=$k1 \nколичество=$kk")*/

    //while 19
    /*var a=scan.nextInt()
    var kk= 0
    while (a>0){
        val k= a%10
        kk = kk*10 + k
        a/=10
    }
    println(kk)*/

    //while 20
    /*var n=scan.nextInt()
    var k=0
    while (n>0){
    }
    println(k)
    */

    //while 22
    /*val n=scan.nextInt()
    val m= Math.sqrt(n.toDouble()).toInt()
    var i = 2
    var checker= true
    while (i <= m){
        if (n%i==0){
            checker=false
            break
        }
        i++
    }
    if (checker)print("well")
    else print("not")*/

    //while 23
    /*val a= scan.nextInt()
    val b= scan.nextInt()
    var s= a ; var d = b
    while (s>0) {
        val t= s
        s= d%s
        d=t
    }
    println("НОД($a; $b) = $d")
    val o= a*b/d
    println("НОК($a; $b) = $o")*/

    //while 24
    /*val n=scan.nextInt()
    var f1= 1
    var f2= 1
    while ((f1+f2)>n){
        val f= f1+f2
        f1=f2
        f2=f
    }
    if (f2==n)println("Yes")
    else println("No")*/

    //while 25
    /*val n= scan.nextInt()
    var f1=1
    var f2=1
    while (f2 <= n){
        val f= f1+f2
        f1=f2
        f2=f
    }
    println(f2)*/

    //while 26
    /*val n= scan.nextInt()
    var f1=1
    var f2=1
    while ((f1+f2) <= n){
        val f= f1+f2
        f1=f2
        f2=f
    }
    println("f↓k-1 = $f1\nf↓k+1 = ${f1+f2}")*/

    //while 27
   /* val n=scan.nextInt()
    var f1=1
    var f2=1
    var k= 0
    while ((f1+f2) < n){
        val f= f1+f2
        f1=f2
        f2=f
        k++
    }
    println(k)*/

    //while 28
    /*val e= scan.nextDouble()
    var aPrev= 2.0
    var k= 1
    while (true){
        val aNext= 2+1 / aPrev
        k++
        if (Math.abs(aNext - aPrev) < e){
            println("$aNext, $aPrev, $k")
            break
        }
        aPrev = aNext
    }*/

    //while 29
   /* val e= scan.nextDouble()
    var aPreev= 1.0
    var aPrev= 2.0
    var k= 1.0
    while (true){
        val aNext= (aPrev+2*aPreev)/3
        k++
        if (Math.abs(aNext - aPrev) < e){
            println("$aNext, $aPrev, $k")
            break
        }
        aPrev = aNext
    }
*/


    //while 30
    /*var a=scan.nextInt()
    var b=scan.nextInt()
    var c=scan.nextInt()
    var a1=0
    var b1=0
    var otv=0
    while (a>=0){
        a-=c
        a1++
    }
    while (b>=0){
        b-=c
        b1++
    }
    println("$a1\n$b1")
    while (b1>0){
        otv+=a1
        b1--
    }
    println(otv)*/

}
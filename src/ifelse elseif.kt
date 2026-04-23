import java.util.Scanner
import kotlin.math.max
import kotlin.math.pow


fun main() {
    val input = Scanner(System.`in`)

   /*var a= input.nextInt()           //If else 1
    if(a>0) a++

    println(a)*/

    /*var a = input.nextInt()         //If else 2
    if (a>0) a++ //a = a + 1
    else
        a -= 2 //a = a - 2
    println(a)*/

    /*var a= input.nextInt()          //If else 3
    if(a>0) a += 1
    else if (a<0) a-=2
    else
        a= 10
    println(a)*/

    /*var a= input.nextInt()          //If else 4
    var s= input.nextInt()
    var d= input.nextInt()
    var k= 0
    if(a>0) k++
    if(s>0) k++
    if(d>0) k++
    println("кол-во положительных чисел= $k")*/

    /*var a= input.nextInt()          //If else 5
    var s= input.nextInt()
    var d= input.nextInt()
    var k= 0
    var g= 0
    if(a>0) k++
    else if(a < 0) g++
    if(s>0) k++
    else if(s<0) g++
    if(d>0) k++
    else if(d<0) g++

    println("Положительные = $k. отрицательные = $g.")*/

    /*val a = input.nextInt() //1     //If else 6
    val b = input.nextInt() //2

    if(a > b) println(2)
    else if(a < b){
        println(1)
    } else println("ravno")*/


    /*var a= input.nextInt()          //If else 7
    var s= input.nextInt()
    if(a<s) println(1)
    else if(a>s) println(2)
    else println("=")*/

    /*var a= input.nextInt()          //If else 8
    var s= input.nextInt()
    if(a<s) println("$s, $a")
    else if(a>s) println("$a, $s")
    else println("Они равны между собой.")*/

    /*var a= input.nextInt()          //If else 9
    var b= input.nextInt()
    val A= a
    val B= b
    if(a>=0) {
        a=B
        b=A
    }
    println("a=$a,b=$b")*/

    /*var a=input.nextInt()            //If else 10
    var b=input.nextInt()

    if(a != b)  {
        a += b //3
        b = a
    }
    else {
        a=0
        b=0
    }
    println("$a, $b")*/

    /*var a= input.nextInt()          //If else 11
    var b= input.nextInt()
    if(a!=b){
        if(a<b) b=a
        else b=a
    } else {
        a = 0
        b = 0
    }
    println("$a, $b")*/

    /*var a= input.nextInt()          //If else 12
    var b= input.nextInt()
    var c= input.nextInt()
    var min= b
    if(a<min) min = a
    if(c<min) min = c
    println(min)*/

    /*var max = b
    if(a>max) max = a
    if(c>max) max = c
    println(max)*/

    /*var a= input.nextInt()          //If else 13
    var b= input.nextInt()
    var c= input.nextInt()
    var abc= b
    var bca= b
    if(a>abc) abc = a
    else if(c>abc) abc = c
    if(a<bca) bca = a
    else if(c<bca) bca = c
    val cab= (a+b+c) - (abc+bca)
    println(cab)*/

    /*var a= input.nextInt()          //If else 14
    var b= input.nextInt()
    var c= input.nextInt()
    var abc= b
    var bca=b
    if(a<abc) abc=a
    else if(c<abc) abc=c
    if(a>bca) bca=a
    else if(c>bca) bca=c
    println("наибольшее число = $abc,наименьшее число = $bca")*/

    /*var a=input.nextInt()           //if else 15
    var b=input.nextInt()
    var c=input.nextInt()
    var abc= b
    if(a<abc) abc=a
    else if(c<abc) abc=c
    val cab= (a+b+c) - abc
    println(cab)*/

    /*var a= input.nextInt()          //If else 16
    var b= input.nextInt()
    var c= input.nextInt()

    if(a<b && b<c) {
        a *= 2 // a += a
        b *= 2
        c *=2
    }
    else {
        a = -a
        b = -b
        c = -c
    }
    println("$a,$b,$c")*/

    /*var a= input.nextInt()          //If else 17
    var b= input.nextInt()
    var c= input.nextInt()
    if(a<b&&b<c || a>c&&b>c) {
        a *=2
        b*=2
        c*=2
    }
    else {
        a = -a
        b=-b
        c=-c
    }
    println("$a,$b,$c")*/

    /*var a= input.nextInt()          //If else 18
    var b= input.nextInt()
    var c= input.nextInt()
    if(a==b && a != c) println(3)
    else if(a==c && a!=b) println(2)
    else println(1)*/

    /*var a=input.nextInt()           //If else 19
    var b=input.nextInt()
    var c=input.nextInt()
    var d=input.nextInt()
    if (a==b && a==c && a!=d) println(4)
    else if (a==c && a==d && a!=b) println(2)
    else if(a==d && a==b && a!=c) println(3)
    else println(1)*/

    /*var a=input.nextInt()           //If else 20
    var b=input.nextInt()
    var c=input.nextInt()
    val ac= Math.abs(a-c)
    val ba= Math.abs(a-b)
    if(ac<ba) println("$a=$ac")
    else if(ac>ba) println("$c=$ac")
    else println("Они равны между собой.")*/


    /*var x= input.nextInt()          //If else 21
    var y= input.nextInt()
    val xy= if (x==0 && y==0) println(0)
    else if (y==0) println(1)
    else if(x==0) println(2)
    else println(3)
    println(xy)*/

    /*var x=input.nextInt()           //If else 22
    var y=input.nextInt()
    val xy= if (x>0 && y>0) println(1)
    else if (x>0 && y<0) println(2)
    else if(x<0 && y<0) println(3)
    else println(4)
    println(xy)*/

    /*val x1=input.nextInt()          //If else 23
    val x2=input.nextInt()
    val x3=input.nextInt()
    val y1=input.nextInt()
    val y2=input.nextInt()
    val y3=input.nextInt()
    val xxy= if (x1==x2) x3
    else if (x1==x3) x2
    else x1
    val yyx= if (y1==y2) y3
    else if(y1==y3) y2
    else y1
    println("$xxy;$yyx")*/

    /*val x= input.nextDouble()       //If else 24
    val fx= if (x>0) Math.sin(2*x)
    else 6-x
    println(fx)*/

    /*var x= input.nextDouble()       //If else 25
    val fx= if (x<-2 || x>2) x*2
    else -3*x
    println(fx)*/

    /*val x=input.nextDouble()        //If else 26
    val fx= if(x<=0) -x
    else if (0<x && x<2) Math.pow(x, 2.0)
    else if (x>=2) 4
    else println("q")
    println(fx)*/

    /*val x= input.nextDouble()       //If else 27
    val fx= if (x<0) 0
    else if (x>=0 && x>=2) 1
    else if () -1
    else println("q")
    println(fx)*/

    /*val g=input.nextInt()           //If else 28
    if (g%4==0 && g%100!=0 || g%400==0) println(366)
    else println(365)*/

    /*val a=input.nextInt()           //If else 29
    if (a%2==0 && a>0) println("Положительное четное число.")
    else if (a%2==1 && a>0) println("Положительное нечетное число.")
    else if (a%2==0 && a<0) println("Отрицательное четное число.")
    else if (a%2==1 && a<0) println("Отрицательное нечетное число.")
    else println("Неправильно введённое число.")*/

    /*val a=input.nextInt()           //If else 30
    if (a%2==0 && a>=10) println("четное двузначное число.")
    else if (a%2==1 && a>=10) println("нечетное двузначное число.")
    else if (a%2==0 && a>=100) println("четное трехзначное число.")
    else if (a%2==1 && a>=100) println("нечетное трехзначное число.")
    else if (a%2==0 && a>=1) println("четное однозначное число.")
    else if (a%2==1 && a>=1) println("нечетное однозначное число.")
    else println("ERROR")*/


}
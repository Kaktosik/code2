import com.sun.tools.javac.Main
import java.util.Scanner
import kotlin.math.abs
import kotlin.math.sqrt

fun main () {

    val input = Scanner(System.`in`)

    /*println(100+23)
    println("100"+"23")
    println("Hello World")*/ //ctrl + Shift + /     /* */
    //println("Daniyar") // ctrl+/ - bir qatarli comment
    //println(14) // 141
    /*
    println(124+54)
    println(245-55)
    println(254*2)
    println(246/3)
    println(51*2-65)*/

    /*println("Senin jasin neshede")
    val age = readln().toInt()
    println(age+1) //"123"*/

    /*println("Kvadratin tarepi neshege ten?") // Begin1.
    val p= readln(). toInt()
    val a= 4*p
    println("Kvadratin perimetri=$a")*/

    /* println("Kvadratning tomoni nechaga ten?") //Begin2
    val a=readln().toInt()
    val b= a*a
    println("Kvadratning yuzasi = $b")*/

    /*println("To`g`ri to`rtburchakning tomonlari nechaga ten?") //Begin3
    val a = readln().toInt()
    val b = readln().toInt()
    val s= a*b
    val p=2*(a+b)
    println("Perimetr=$p")
    println("Yuza=$s")*/

    /*println("Чему равен диаметр круга?") //Begin4
    val k=readln().toInt()
    val d= 3.14
    val l=k*d
    println("Длина круга равна=$l")*/

    /*println("Введите число чему равна внутрь куба.") //Begin5
    val a= readln().toInt()
    val v= a*a*a
    val s= 6*(a*2)
    println("Внутрь куба=$v")
    println("Поверхность куба=$s")*/

    /*println("Введите значения которым равны стороны паралелипипеда.")
    val a= readln().toInt()  //Begin6
    val b=readln().toInt()
    val c=readln().toInt()
    val v= a*b*c
    val s= 2*(a*b+b*c+a*c)
    println("V=$v")
    println("S=$s")*/

    /*println("Введите радиус круга ввиде R") //Begin7
    val r=readln().toInt()
    val l=2*3.14*r
    val s=3.14*(r*r)
    println("Ответ равен $l и $s")*/

    /*println("Введите A и B чтобы найти средний арифметик")
    val a=readln().toInt()  //Begin8
    val b=readln().toInt()
    val k= (a*b)/2
    println("Ответ равен $k")*/

    /*println("Введите A и B для того чтобы найти средний геометрик")
    val a=readln().toInt()
    val b=readln().toInt()
    val sum= a+b
    val k= a*b
    val A=
    println("Ответ равен $k")*/


    /*val dareje = Math.pow(4.0, 4.toDouble()) //3, 4  3^4
    println(dareje)

    val kvadratKoren = Math.sqrt(40.0)
    println(kvadratKoren)

    val modul = Math.abs(-1234)
    println(modul)*/

    /*val a= readln().toDouble()
    val b= readln().toDouble()
    val o= a+b  //Begin10
    val i= a*b
    val u= Math.sqrt(a)
    val y= Math.sqrt(b)
    println("$o  $i ")
    println("$u $y")*/

    /*println("Введите числа не равные нулю, чтобы их объединить,умножить и найти модуль каждого числа")
    val a= readln().toDouble()  //Begin11
    val b= readln(). toDouble()
    val l=a+b
    val k= a*b
    val j= Math.abs(a)
    val h= Math.abs(b)
    println("Объединение=$l умножение=$k модуль 1=$j модуль 2=$h")*/

    /*println("Введите A и B")
    val a= readln(). toDouble() //Begin12
    val b= readln().toDouble()
    val A= Math.pow(a, 2.0)
    val B= Math.pow(b, 2.0)
    val c= Math.sqrt(A+B)
    val k= a+b+c
    println("ответ= $c и $k")*/

    /*println(" aylananing radiuslarin kiriting")
    val r1=readln(). toDouble() //Begin13
    val r2=readln().toDouble()
    val s1= 3.14*r1
    val s2=3.14*r2
    val s3=3.14*(r1-r2)
    println(" aylananing yuzalari $s1 $s2 $s3")*/

    /*println("Введите R и S")
    val r=readln(). toDouble() //Begin14
    val r2= Math.pow(r, 2.0)
    val s= 3.14*r2
    val l=2*3.14*r
    println("Ответ S=$s,L=$l")*/

    /*println("Введите R")
    val r= readln().toDouble() //Begin15
    val l=2*3.14*r
    val r2= Math.pow(r, 2.0)
    val s= 3.14*r2
    println("Ответ L=$l, S=$s")*/

    /*println("Найдите расстояние между двумя точками на числовой прямой")
    val x1= readln().toDouble() //Begin16
    val x2=readln().toDouble()
    val R= Math.abs(x2-x1)
    println(R)*/

    /*println("Введите позиции точек A,B,C.")
    val A=readln().toDouble()
    val B= readln().toDouble() //Begin17
    val C= readln().toDouble()
    val AC= Math.abs(A-C)
    val BC= Math.abs(B-C)
    println("Расстояние между точками AC=$AC, BC=$BC")*/

    /*println("Введите позиции точек A и B")
    val A=readln().toDouble() //Begin18
    val B= readln().toDouble()
    val c=0
    val Ac= Math.abs(A-c)
    val Bc= Math.abs(B-c)
    println("Расстояние отрезков равны= AC=$Ac, BC=$Bc")*/

    /*println("Введите координаты углов прямоугольника ")
    val a=readln().toDouble() //Begin19
    val b=readln().toDouble()
    val c=readln().toDouble()
    val d=readln().toDouble()
    val A=(a+b+c+d)
    println("Ответ равен = $A")*/

    /*println("Введите x1, x2, y1, y2")  //Begin20
    val x1=readln().toDouble()
    val x2=readln().toDouble()
    val y1=readln().toDouble()
    val y2=readln().toDouble()
    val X1= (x2-x1)
    val X2= (y2-y1)
    val n= Math.pow(X1, 2.0)
    val n1= Math.pow(X2, 2.0)
    val k= Math.sqrt(n+n1)
    println("Ответ равен = $k")*/

    /*println("Введите x1, x2, y1, y2.")
    val x1=readln().toDouble() //Begin20 Alt.version
    val x2=readln().toDouble()
    val y1=readln().toDouble()
    val y2=readln().toDouble()
    val a= Math.sqrt(Math.pow(x1-x2, 2.0)+ Math.pow(y1-y2, 2.0))*/
    /*println("Введите a,b,c")
    val a= readln().toDouble()
    val b=readln().toDouble()
    val c= readln().toDouble()
    val p= (a+b+c)/2
    val l= (p-a)
    val l2=(p-b)
    val l3=(p-c)*/

    /*println("Введите a,b,c.") //Begin21
    val a=readln().toDouble()
    val b=readln().toDouble()
    val c=readln().toDouble()
    val p=(a+b+c)/2
    val S= Math.sqrt(Math.pow(a-b, 2.0)+Math.pow(b-c, 2.0)+Math.pow(b-c, 2.0))
    println(S)*/

/* a=>(x1-x3)2 + (y1-y3)2. */

    /*println("Введите A и B.") //Begin22
    var a= input.nextInt()
    var b=input.nextInt()
    val c= a
     a=b
    b=c
    println("A=$a,B=$b")*/

    /*println("Введите A,B,C")
    var a= input.nextInt()
    var b= input.nextInt()
    var c= input.nextInt()
    val v= a
    val j=b
    val k= c
    a=j
    b=k
    c=v
    println("Ответы A=$a, B=$b, C=$c")*/


   /* println("Введите A,B,C для замены значений.") //Begin24
    val A=readln().toDouble()
    val B=readln().toDouble()
    val C=readln().toDouble()
    val a= C
    val b=A
    val c=B
    println("Замена значений прошла успешно.Ответы=$a,$b,$c")*/

   /* println("Введите X")
    val x= readln().toDouble() //Begin25
    val x1= Math.pow(x, 6.0)
    val xx= Math.pow(x, 2.0)
    val y= 3*x1-6*xx-7
    println("Ответ=$y")*/

    /*println("Введите X")
    val k= readln().toDouble() //Begin26
    val x= Math.pow((k-3), 6.0)
    val l= Math.pow((k-3), 3.0)
    val y= 4*x-7*l+2
    println("Ответ равен= $y")*/

    /*println("Введите А, для вычисления его в степени.")
    val a= readln().toDouble() //Begin27
    val m= Math.pow(a, 2.0)
    val m1= Math.pow(a, 4.0)
    val m2= Math.pow(a, 8.0)
    println("Степени А. $m, $m1, $m2")*/

    /*println("Введите А, для вычисления его в степени.")
    val a= readln().toDouble()
    val m= Math.pow(a, 2.0) //Begin28
    val m1= Math.pow(a, 3.0)
    val m2= Math.pow(a, 5.0)
    val m3= Math.pow(a, 10.0)
    val m4= Math.pow(a, 15.0)
    println("Степени А. $m, $m1,$m2,$m3,$m4.")*/

    println("Введите А.") //Begin29


}
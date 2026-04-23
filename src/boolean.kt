import com.sun.tools.javac.Main
import java.util.Scanner


fun main() {
    val input = Scanner(System.`in`)

    /*println("Введите А")
    val a= input.nextInt()             //Boolean1
    val bool= a>0
    println("Ответ=$bool")*/

    /*println("Введите А.")
    val a= input.nextInt()             //Boolean2
    val a1= a % 2 == 0
    println("Ответ=$a1")*/

    /*println("Введите А.")
    val a= input.nextInt()             //Boolean3
    val a1= a%2==0
    println(a1)*/


    /*val k= input.nextInt()           //Boolean4
    val s= input.nextInt()
    val d= k>2 && s<=3
    println(d)*/

    /*val a= input.nextInt()           //Boolean5
    val b= input.nextInt()
    val d= a>=0 || b<-2
    println(d)*/

    /*val a= input.nextInt()           //Boolean6
    val b= input.nextInt()
    val c= input.neatInt()
    val s= a<b && b<c
    println(s)*/

    /*val a= input.nextInt()           //Boolean7
    val b= input.nextInt()
    val c= input.nextInt()
    val s= a<b  && b<c || a> b && b>c
    println(s)*/

    /*val a= input.nextInt()           //Boolean8
    val b= input.nextInt()
    val k= a % 2 == 1 && b % 2 == 1
    println(k)*/

    /*val a= input.nextInt()           //Boolean9
    val b= input.nextInt()
    val k= a % 2 == 1 || b % 2 == 1
    println(k)*/

    /*val a= input.nextInt()           //Boolean10
    val b= input.nextInt()
    val k= a % 2 == 1 && b % 2 == 0 || a % 2 == 0 && b % 2 == 1
    println(k)*/

    /*val a= input.nextInt()           //Boolean11
    val b= input.nextInt()
    val m=  a % 2 == 1 && b % 2 == 1 || a % 2 == 0 && b % 2 == 0
    println(m)*/

    /*val a=input.nextInt()           //Boolean12
    val b=input.nextInt()
    val c=input.nextInt()
    val k= a > 0 && b > 0 && c > 0
    println(k)*/

    /*val a= input.nextInt()          //Boolean13
    val b= input.nextInt()
    val c= input.nextInt()
    val k= a>0 || b>0 || c>0
    println(k)*/

    /*val a= input.nextInt()         //Boolean14
    val b= input.nextInt()
    val c= input.nextInt()
    val k= a>0 && b<0 && c<0 || a<0 && b>0 && c<0 || a<0 && b<0 && c>0
    println(k)*/

    /*val a= input.nextInt()         //Boolean15
    val b= input.nextInt()
    val c= input.nextInt()
    val k= a>0 && b>0 && c<0 || a>0 && b<0 && c>0 || a<0 && b>0 && c>0
    println(k)*/

    /*val a= input.nextInt()        //Boolean16
    val k= a%2==0 && a>=10 && a<100
    println(k)*/

    /*val a= input.nextInt()        //Boolean17
    val k= a%2==1 && a>=100 && a<1000
    println(k)*/

    /*val a= input.nextInt()          //Boolean18
    val b= input.nextInt()
    val c= input.nextInt()
    val k= a == b || b == c || a == c
    println(k)*/

    /*val a= input.nextInt()          //Boolean19
    val b= input.nextInt()
    val c= input.nextInt()
    val k= a == -b || c == -a || b == -c
    println(k)*/

    /*val a= input.nextInt()          //Boolean20
    val b= a / 100
    val s= a % 100 / 10
    val c= a % 10
    val k= b != s && s != c && b != c
    println(k)*/

    /*val q= input.nextInt()          //Boolean21
    val b=  q / 100
    val s= q % 100 / 10
    val c=  q % 10
    val k= c>s && s>b
    println(k)*/

    /*val a= input.nextInt()          //Boolean22
    val b= a / 100
    val s= a % 100 / 10
    val c= a % 10
    val k= c>s && s>b || c<s && s<b
    println(k)*/

    /*val a= input.nextInt()          //Boolean23
    val b= a / 1000
    val c= a % 1000 / 100
    val d= a % 1000 % 100 / 10
    val e= a % 10
    val k= b == e && c == d
    println(k)*/

    /*val a= input.nextDouble()       //Boolean24
    val b= input.nextDouble()
    val c= input.nextDouble()
    val b2= Math.pow(b, 2.0)
    val d= b2-4*a*c*/

    /*val a= input.nextInt()          //Boolean25
    val b= input.nextInt()
    val k= a < 0 && b>0
    println(k)*/

    /*val a=input.nextInt()           //Boolean26
    val b=input.nextInt()
    val k= a>0&&b<0
    println(k)*/

    /*val x= input.nextInt()          //Boolean27
    val y=input.nextInt()
    val k= x<0 && y!=0
    println(k)*/

    /*val a= input.nextInt()          //Boolean28
    val b= input.nextInt()
    val k= a > 0 && b > 0 || a < 0 && b < 0
    println(k)*/

    /*val x= input.nextInt()          //Boolean29
    val x1= input.nextInt()
    val x2= input.nextInt()
    val y= input.nextInt()
    val y1= input.nextInt()
    val y2= input.nextInt()
    val k= x>x1 && x<x2 && y>y2 && y<y1
    println(k)*/

    /*val a=input.nextInt()           //Boolean30
    val b=input.nextInt()
    val c=input.nextInt()
    val k= a==b && b==c
    println(k)*/

    /*val a= input.nextInt()          //Boolean31
    val b= input.nextInt()
    val c= input.nextInt()
    val k= (a == b && a != c) || (a == c && a != b) || (b==c && c !=a)
    println(k)*/

    /*val a= input.nextInt()          //Boolean32
    val b= input.nextInt()
    val c= input.nextInt()
    val k= c*c == a*a + b*b
    println(k)*/

    /*val a= input.nextInt()          //Boolean33
    val b= input.nextInt()
    val c= input.nextInt()
    val k= a+b>c && b+c>a && c+a>b
    println(k)*/

    /*val x= input.nextInt()          //Boolean34
    val y= input.nextInt()
    val a= (x+y) % 2 == 1
    println(a)*/

    /*val x= input.nextInt()          //Boolean35
    val y= input.nextInt()
    val x1= input.nextInt()
    val y1= input.nextInt()
    val a= (x+y) % 2 == (x1+y1) % 2
    println(a)*/

    /*val x1= input.nextInt()         //Boolean36
    val x2= input.nextInt()
    val y1= input.nextInt()
    val y2= input.nextInt()
    val a= x1 == x2 || y1 == y2
    println(a)*/

    /*val x1= input.nextInt()         //Boolean37
    val x2= input.nextInt()
    val y1= input.nextInt()
    val y2= input.nextInt()
    val a= Math.abs(x1-x2) <= 1 && Math.abs(y1-y2) <= 1
    println(a)*/

    /*val x1= input.nextInt()         //Boolean38
    val x2= input.nextInt()
    val y1= input.nextInt()
    val y2= input.nextInt()
    val a= Math.abs(x1-x2) == Math.abs(y1-y2)
    println(a)*/

    /*val x1= input.nextInt()         //Boolean39
    val x2= input.nextInt()
    val y1= input.nextInt()
    val y2= input.nextInt()
    val a= Math.abs(x1-x2) == Math.abs(y1-y2) || (x1==x2 || y1==y2)
    println(a)*/

    /*val x1= input.nextInt()         //Boolean40
    val x2= input.nextInt()
    val y1= input.nextInt()
    val y2= input.nextInt()
    val x= Math.abs(x1-x2)
    val y= Math.abs(y1-y2)
    val a= x==2 && y==1 || y==2 && x==1
    println(a)*/
}
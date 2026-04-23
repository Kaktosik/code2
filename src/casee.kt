import java.util.Scanner

fun main () {
    val scan = Scanner(System.`in`)

    //case1
   /* val a=scan.nextInt()
   val otv= when(a) {
       1-> "понедельник"
       2-> "вторник"
       3-> "среда"
       4-> "четверг"
       5-> "пятница"
       6-> "суббота"
       7-> "воскресенье"
       else -> "неправильное введённое число."
    }
    println(otv)*/

    //case2
    /*val a=scan.nextInt()
    val otv=when(a){
        1-> "плохо"
        2-> "неудовлетворительно"
        3-> "удовлетворительно"
        4-> "хорошо"
        5-> "отлично"
        else -> "неправильно написанное число"
    }
    println(otv)*/

    //case3
    /*val a=scan.nextInt()
    val otv=when(a){
        1,2,12 -> "зима"
        3,4,5 -> "весна"
        6,7,8 -> "лето"
        9,10,11 -> "осень"
        else -> "неправильно введённое число."
    }
    println(otv)*/

    //case4
    /*val a=scan.nextInt()
    val otv= when(a) {
        1,3,5,7,8,10,12-> "31 days"
        2-> "28 days"
        4,6,9,11 -> "30 days"
        else -> "error"
    }
    println(otv)*/

    //case5
    /*val d=scan.nextInt()
    val a=scan.nextInt()
    val b= scan.nextInt()
    val otv= when(d){
        1-> a+b
        2-> a-b
        3-> a*b
        4-> a/b
        else -> "error"
    }
    println(otv)*/

    //case9
   /* var m=scan.nextInt()
    var d=scan.nextInt()
    when(m){
        1,3,5,7,8,10,12 -> {
            if (d > 0 && d < 31) d++
            else if (d==31) {
                d = 1
                m++
            }
            else d=-2
            if (m==13) {
                m=1
            }
        }
        4,6,9,11 ->{ if (d>0 && d<30) d++
        else if (d==31) {
            d=1
            m++
        }
        else {
            d==-2
        }
        }
        2 -> {
            if (d < 1 || d > 28) d = 0
            else if (d==28) {
                d=1
                m++
            }
        }
        else -> {
            println("error")
            return
        }
    }
     if (d!= -2){
         val otv=
        when(m){
        1-> "$d January"
        2-> "$d February"
        3-> "$d March"
        4-> "$d April "
        5-> "$d May"
        6-> "$d June"
        7-> "$d Jule"
        8-> "$d August"
        9-> "$d September"
        10-> "$d October"
        11-> "$d November"
        else -> "$d December"
    }
    println(otv)
    }
    else println("wrong month or day.")*/

    //case10
   /* val a=scan.next()[1]
    val b= scan.nextInt()
    val st=when(a){
        1 -> 'С'
        2 -> 'З'
        3 -> 'Ю'
        4 -> 'В'
        else -> "error"
    }
    */

    //case15
   /* val s= scan.nextInt()
    val c=scan.nextInt()
    val sn= when(s){
        1-> "пики"
        2-> "трефы"
        3-> "бубны"
        4-> "червы"
        else -> ""
    }
    val n= when(c){
        6-> "шестерка"
        7-> "семерка"
        8-> "восьмерка"
        9-> "девятка"
        10-> "десятка"
        11-> "валет"
        12-> "дама"
        13-> "король"
        14-> "туз"
         else -> ""
    }
    println("$n $sn")*/

    //case16
   /* val a=scan.nextInt()
    if (a in 20..<70){
        val d= a/10
        val e= a%10
        val des= when(d){
            2-> "двадцать"
            3-> "тридцать"
            4-> "сорок"
            5-> "пятдесять"
            else -> "шестдесять"
        }
        val edi= when(e){
            1-> "один"
            2-> "два"
            3-> "три"
            4-> "четыре"
            5-> "пять"
            6-> "шесть"
            7-> "семь"
            8-> "восемь"
            9-> "девять"
            else ->  ""
        }
        val g= when(e) {
            0,5,6,7,8,9-> "лет."
            1,2,3,4 -> "год."
            else -> ""
        }
        println("$des $edi $g")
    }
    else println("неправильно введено.")*/

    //case17
    /*val a= scan.nextInt()
    if (a in 10..40){
        val aa= a/10
        val a2= a%10
        val d= when(aa){
            1-> {
                when(a2) {
                    1 -> "одинадцать"
                    2 -> "двенадцать"
                    3 -> "тринадцать"
                    4 -> "четырнадцать"
                    5 -> "пятнадцать"
                    6 -> "шестнадцать"
                    7 -> "семнадцать"
                    8 -> "восемнадцать"
                    9 -> "девятнадцать"
                    else -> ""
                }
            }
            2-> "двадцать"
            3-> "тридцать"
            4-> "сорок"
            else -> ""
        }
        var e = ""
        if(aa != 1){
            e = when(a2){
                1-> "одно"
                2-> "две"
                3-> "три"
                4-> "четыре"
                5-> "пять"
                6-> "шесть"
                7-> "семь"
                8-> "восемь"
                9-> "девять"
                else -> ""
            }
        }
        val ad= when(a2){
            1-> "учебное задание"
            2,3,4,5,6,7,8,9-> "учебных заданий"
            else -> ""
        }
        println("$d $e $ad")
    }
    else println("неправильно введено.")
*/
    //case18
    /*val eds=scan.nextInt()
    val e= eds % 10
    val d= eds % 100 / 10
    val s= eds / 100
    if (eds in 100..999) {
        var ee=""
        if (e!=1) {
            ee = when (e) {
                1 -> "один"
                2 -> "два"
                3 -> "три"
                4 -> "четыре"
                5 -> "пять"
                6 -> "шесть"
                7 -> "семь"
                8 -> "восемь"
                9 -> "девять"
                else -> ""
            }
        }
        val dd= when(d){
            1 -> when(d){
                1->"одинадцать"
                2->"двенадцать"
                3->"тринадцать"
                4->"четырнадцать"
                5->"пятнадцать"
                6->"шестнадцать"
                7->"семнадцать"
                8->"восемнадцать"
                9->"девятнадцать"
                else->""
            }
            2 -> "двадцать"
            3 -> "тридцать"
            4 -> "сорок"
            5 -> "пятьдесят"
            6 -> "шестьдесят"
            7 -> "семьдесят"
            8 -> "восемьдесят"
            9 -> "девяноста"
            else -> ""
        }
        val ss= when(s){
            1->"сто"
            2->"двесте"
            3->"триста"
            4->"четыреста"
            5->"пятьсот"
            6->"шестьсот"
            7->"семьсот"
            8->"восемьсот"
            9->"девятьсот"
            else->""
        }
        println("$ss $dd $ee")
    }
    else {
        println("error")
    }*/


}
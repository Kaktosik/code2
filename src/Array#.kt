import java.util.Scanner

fun main(){
    val scan= Scanner(System.`in`)


    //array 1
    /*val n = scan.nextInt()
    val array = IntArray(n)
    var t = 1
    for (i in 0 until n){
        array[i] = t
        t += 2
    }
    for (i in 0 until n){
        print("${array[i]} ")
    }*/

    //array 2  my ver.
    /*val n = scan.nextInt()
    val array = IntArray(n)
    var ch = 2
    for (i in 0 until n){
        array[i] = ch
        ch *= 2
    }
    for (i in 0 until n) print("${array[i]} ")*/

    //array 2  ver 2.0
    /*val n = scan.nextInt()
    val arr = IntArray(n) //0 0 0 0
    arr[0] = 1 // ^ 0

    //input output
    for(i in 1 until n){
        arr[i] = arr[i - 1] * 2
    }

    for(e in arr){
        print("$e ")
    }*/

    //array 3
    /*val n = scan.nextInt()
    val array = IntArray(n)
    var t = 1
    val d = scan.nextInt()
    val a = scan.nextInt()
    for (i in 0 until n){
        array[i] = a + t * d
        t += 1
    }
    for (i in 0 until n) print("${array[i]} ")*/


    //array 3 ver 2.0
    /*val n = scan.nextInt()
    val array = IntArray(n)
    array[0] = scan.nextInt()
    val d = scan.nextInt()
    for (i in 1 until n){
        array[i] = array[i - 1] + d
    }
    for (i in 0 until n) print("${array[i]} ")*/

    //array 4
















}
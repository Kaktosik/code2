import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)


    //1
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

    //2  my ver.
    /*val n = scan.nextInt()
    val array = IntArray(n)
    var ch = 2
    for (i in 0 until n){
        array[i] = ch
        ch *= 2
    }
    for (i in 0 until n) print("${array[i]} ")*/

    //2  ver 2.0
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

    //3
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


    //3 ver 2.0
    /*val n = scan.nextInt()
    val array = IntArray(n)
    array[0] = scan.nextInt()
    val d = scan.nextInt()
    for (i in 1 until n){
        array[i] = array[i - 1] + d
    }
    for (i in 0 until n) print("${array[i]} ")*/

    //4
    /*val n = scan.nextInt()
    val array = IntArray(n)
    array[0] = scan.nextInt()
    val d = scan.nextInt()
    for (i in 1 until n){
        array[i] = array[i - 1] + d *  d
    }
    for (i in 0 until n) print("${array[i]} ")*/

    //5
    /*val n = scan.nextInt()
    val a= IntArray(n)
    a[0] = 1
    a[0] = 1
    for (i in 2 until n){
        a[i] = a[i - 1] + a[i - 2]
    }

    for (i in 0 until n) print("${a[i]} ")*/

    //6
    /*val n = scan.nextInt()
    val a = IntArray(n)
    a[0] = scan.nextInt()
    a[1] = scan.nextInt()
    var k = a[0] + a[1]
    for (i in 2 until n){
        a[i] = k
        k *= i
    }
    for (i in 0 until n){
        print("${a[i]} ")
    }*/

    //7
    /*val n = scan.nextInt()
    val a = IntArray(n)
    for (i in 0 downTo n){
    }*/


    //8
    /*val n = scan.nextInt()
    val a = IntArray(n)
    var d = 0
    for (i in 0 until n){
        a[i] = scan.nextInt()

        if (a[i] % 2 != 0){
            d++
            print("${a[i]} ")
        }
    }
    println(". $d количество нечетных чисел")*/


    //9
    /*val n = scan.nextInt()
    val a = IntArray(n)
    var d = 0
    for (i in 0 until n) {
        a[i] = scan.nextInt()
    }
    for (i in n-1 downTo 0){
        if (a[i] % 2 != 1) {
            d++
            print("${a[i]} ")
        }
    }
    println(". $d количество чётных чисел есть")*/


    //10
    /*val n = scan.nextInt()
    val a = IntArray(n)
    var d = 0
    var b = 0
    for (i in 0 until n){
        a[i] = scan.nextInt()
    }
    for (i in n-1 downTo 0){
        if (a[i] % 2 != 0){
            b++
            print("${a[i]} ")
        }
    }
println()
    for (i in 0 until n){
        if (a[i] % 2 != 1){
            d++
            print("${a[i]} ")
        }
    }
    println()
    println("$b количество нечетных чисел\n$d количество четных чисел")
*/

    //11
    /*val n = scan.nextInt()
    val a = IntArray(n)
    for (i in 0 until n){
        a[i] = scan.nextInt()
    }
    val k = scan.nextInt()
    for (i in k until n step k){
        print("${a[i]} ")
    }*/

    //12
    /*val n = scan.nextInt()
    val a = IntArray(n)
    for (i in 0 until n){
     a[i] = scan.nextInt()
    }
    for (i in 0 until n step 2){
        print("${a[i]} ")
    }*/

    //13
    /*val n = scan.nextInt()
    val a = IntArray(n)
    for (i in 0 until n) {
        a[i] = scan.nextInt()
    }
    for (i in n-2 downTo 0 step 2){
        print("${a[i]} ")
    }*/


    //14
    /*val n = scan.nextInt()
    val a = IntArray(n)
    for (i in 0 until n){
        a[i] = scan.nextInt()
    }
    for (i in 0 until n step 2){
        print("${a[i]} ")
    }
    println()
    for (i in 1 until n step 2){
        print("${a[i]} ")
    }*/

    //15
    /*val n = scan.nextInt()
    val a = IntArray(n)
    for (i in 0 until n) {
        a[i] = scan.nextInt()
    }
    for (i in 0 until n step 2){
        print("${a[i]} ")
    }
    println()
    for (i in n-1 downTo 0 step 2){
        print("${a[i]} ")
    }*/

    //16
    /*val n = scan.nextInt()
    val a = IntArray(n)
    for (i in 0 until n){
        a[i] = scan.nextInt()
    }
    for (i in 0 until n/2){
        print("${a[i]} ${a[n-1-i]}  ")
    }
    if (n%2!=0){
        print("${a[n / 2]}")
    }*/

    //17
    /*val n = scan.nextInt()
    val a = IntArray(n) { scan.nextInt() }
    var s = 0
    var e = n - 1
    while (s <= e){
        print("${a[s]} ")
        s++
        if (s <= e){
            print("${a[s]} ")
            s++
        }
        repeat(2) {
            if (e >= s) {
                print("${a[e]} ")
                e--
            }
        }
    }*/

    //18
    /*val n = scan.nextInt()
    val a = IntArray(n){scan.nextInt()}
    for (i in 0 until n){
        if (a[i] < a[n-1] ){
            print("${a[i]} ")
        }
    }*/


    //19
    /*val n = scan.nextInt()
    val a = IntArray(n){scan.nextInt()}
    var j = 0
    for (i in 1 until n-1){
        if (a[i] > a[0] && a[i] < a[n-1]){
            j = i
        }
    }
    println(j)*/

    //20
    /*val n = scan.nextInt()
    val k = scan.nextInt()
    val l = scan.nextInt()
    val a = IntArray(n){scan.nextInt()}
    var sum = 0
    for (i in l .. k){
        sum+=a[i]
    }
    print(sum)*/

    //21
    /*val n = scan.nextInt()
    val l = scan.nextInt()
    val k = scan.nextInt()
    val a = IntArray(n){scan.nextInt()}
    var s = 0f
    for (i in l .. k){
        s += a[i]
    }
    var oa = s / (k - l + 1)
    print(oa)*/

    //22
    /*val n = scan.nextInt()
    val l = scan.nextInt()
    val k = scan.nextInt()
    val a = IntArray(n){scan.nextInt()}
    var s = 0
    for (i in 0 until n){
        if (i !in l..k){
            s+=i
        }
    }
    print(s)*/

    //23
    /*val n = scan.nextInt()
    val l = scan.nextInt()
    val k = scan.nextInt()
    val a = IntArray(n){scan.nextInt()}
    var s = 0
    for (i in 0 until n){
        if (i !in l .. k){
            s += a[i]
        }
    }
    val oa = s / (k - l + 1)
    print(oa)*/


    //24
    /*val n = scan.nextInt()
    val a = IntArray(n){ scan.nextInt() }
    var d = a[1] - a[0] //ayirma

    for(i in 2 until n){
        if(d != a[i] - a[i - 1]){
            d = 0
            break
        }
    }

    print(d)*/

    //25
    /*val n = scan.nextInt()
    val a = IntArray(n){scan.nextInt()}
    var d = a[1] - a[0]
    for (i in 2 until n){
        if (d != a[i] - a[i - 1] * i){
            d=0
            break
        }
    }
    print(d)*/

    //26
    /*val n = scan.nextInt()
    val a = IntArray(n){scan.nextInt()}
    var otvet = 0
    for (i in 0 until n - 1){
        val s = a[i] - a[i + 1]
        if (s % 2 == 0){
            otvet = i
            break
        }
    }
    println(otvet)*/

    //27
    /*val n = scan.nextInt()
    val a = IntArray(n){scan.nextInt()}
    var o = 0
    for (i in 0 until n-1){
        val s = a[i] - a[i+1]
        if (s < 0){
            o = i
            break
        }
    }
    println("$o")
*/

    //28
    /*val n = scan.nextInt()
    val a = IntArray(n){scan.nextInt()}
    var min = a[0]
    for (i in 2 until n step 2){
        if (min > a[i]){
            min = a[i]
        }
    }
    print(min)*/

    //29
    /*val n = scan.nextInt()
    val a = IntArray(n){scan.nextInt()}
    var max = a[0]
    for (i in 1 until n step 2){
        if (max < a[i]){
            max = a[i]
        }
    }
    println(max)*/

    //30
    /*val n = scan.nextInt()
    val a = IntArray(n){scan.nextInt()}
    var k = 0
    var s = 0
    for (i in 0 until n){
        if (a[i] > a[i+1]){
            s = i
            print("${a[i]} , ${a[i+1]}")
        }
    }
    println("$s")*/








}
import java.util.Scanner
import kotlin.coroutines.CoroutineContext
import kotlin.math.abs
import kotlin.math.min

fun main() {
    val scan = Scanner(System.`in`)
    val n = scan.nextInt()
    var a = IntArray(n){scan.nextInt()}


    //    inkrementaciya  -> Increase
    //    dekrementaciya  -> Decrease

    /*var k = 9
    var l = k--
    k++
    ++k
    --l
    println(k)
    println(l)*/

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
            s+=a[i]
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
    for (i in 0 until n-1){
        if (a[i] > a[+1]){
            k++
            print("$i ")
        }
    }
    println("\n$k ")*/


    //31
    /*val a = IntArray(n){scan.nextInt()}
    var k = 0
    for (i in n - 1 downTo 1){
        if (a[i-1] < a[i]){
            k++
            print("$i ")
        }
    }
    print("\n$k ")*/


    //32
    /*val a = IntArray(n){scan.nextInt()}
    var k = 0
    for (i in 1 until n-1){
        if (a[i] < a[i+1] && a[i-1] > a[i]){
            k++
            print("$i ")
        }
    }
    println("\n$k")*/



    //33
    /*var k = 0
    for (i in 1 until n-1){
        if (a[i] > a[i+1] && a[i] > a[i-1]){
            k++
            print("$i ")
        }
    }
    println("\n$k ")*/

    //34
    /*var s = 0
    for (i in 1 until n-1){
        if (a[i] < a[i+1] && a[i] < a[i-1]){
            if (a[i] > s){
                s = a[i]
            }
        }
    }
    println(s)*/

    //35
    //1 3 2 5 8 6
    /*var s = 0
    for (i in 1 until n-1){
        if (a[i] > a[i+1] && a[i] > a[i-1]){
            if (a[i] > s){
                s = a[i]
            }
        }
    }
    println(s)*/


    //36
    /*var max = a[0]
    for (i in 1 until n-1){
        val lmx = a[i] > a[i+1] && a[i] > a[i-1]
        val lmi = a[i] < a[i+1] && a[i] < a[i-1]

        if (!(lmx || lmi) && max < a[i]) max = a[i]
    }
    println(max)*/

    //37
    /*var cc = 0
    var k = false
    for (i in 1 until n){
        if (a[i] > a[i-1]){
            if (!k){
                cc++
            }
            k = true
        } else {
            k = false
        }
    }
    println(cc)*/

    //38
    /*var cc = 0
    var k = false
    for (i in 1 until n){
        if (a[i] < a[i-1]){
            if (!k){
                cc++
            }
            k = true
        } else {
            k = false
        }
    }
    println(cc)*/

    //39
    /*var cc = 0
    var k = false
    var l = false
    for (i in 1 until n){
        if (a[i] > a[i-1]){
            if (!l) cc++
            l = true
        } else l = false

        if (a[i] < a[i-1]){
            if (!k) cc++
            k = true
        } else k = false
    }
    println(cc)*/


    //40
    /*val r = scan.nextInt()
    var cl = a[0]
    var minL = Math.abs(r - cl)
    for (i in 1 until n){
        var x = abs(r - a[i])
        if (x < minL){
            minL = x
            cl = a[i]
        }
    }
    println(minL)
    println(cl)*/


    //41
    /*var e1 = a[0]
    var e2 = a[1]
    var maxSum = e1 + e2
    for (i in 2 until n){
        val s = a[i] + a[i-1]
        if (s > maxSum){
            e1 = a[i-1]
            e2 = a[i]
            maxSum = s
        }
    }
    println("$e1 $e2")*/


    //42
    /*val r = scan.nextInt()
    var minL = Int.MAX_VALUE
    var i1 = -1
    var i2 = -1
    for (i in 0 until n-1){
        val x = abs(r-(a[i] + a[i +1]))
        if (x < minL ){
            minL = x
            i1 = i
            i2 = i+1
        }
    }
    println(a[i1])
    println(a[i2])
    println(minL)*/


    //43
    /*var counter = 1
    for (i in 0 until n-1){
        if (a[i] != a[i+1]) counter++
    }
    println(counter)*/

    //44
    /*for (i in 0 until n-1){
        for (j in i+1 until n){
            if (a[i] == a[j]){
                println("${i+1} ${j+1}")
            }
        }
    }*/

    //45
    /*for (i in 0 until n-1){
        if (a[i] == a[i+1]){
            print("${a[i]} ")
        }
    }*/

    //46
    /*var i1 = -1
    var i2 = -1
    val r = scan.nextInt()
    var minLength = Int.MAX_VALUE

    for(i in 0 until n - 1){
        for(j in i + 1 until n){
            val s = a[i] + a[j]

            val x = abs(r - s)
            if(x < minLength){
                minLength = x
                i1 = i
                i2 = j
            }
        }
    }
    println(minLength)
    println("$i1 $i2")*/

    //47
    /*var c = 0
    for (i in 0 until n-1){
        var isP = false
        for (j in 0 until i){
            if (a[i] == a[j]){
                isP = true
                break
            }
        }
        if (!isP) c++
    }
    println(c)*/


    //48
    /*var mc = 0
    for (i in 0 until n-1){
        var bo = false
        for (j in 1 until i){
            if (a[i] == a[j]){
                mc++
            } else {
                bo = true
                break
            }
        }
    }
    println(mc)*/

    //49
    /*var samozvanec = -1
    for (i in 0 until n-1){
        if (a[i] !in 0..n){
            println(i)
            break
        }
        var tf = false
        for (j in 0 until i){
            if (a[i] > a[j]){
                samozvanec = 0
            } else {
                samozvanec = i
                tf = true
            }
        }
        if (!tf) samozvanec = 0
    }
    println(samozvanec)*/

    //50
    /*var samozvanec = -1
    for (i in 0 until n-1){
        if (a[i] !in 0..n){
            println(i)
            break
        }
        var tf = false
        for (j in 0 until i){
            if (a[i] > a[j]){
                samozvanec = 0
            } else {
                tf = true
                samozvanec = i
            }
        }
    }
    println(samozvanec)*/


    //51
    /*var b = IntArray(n){scan.nextInt()}
    for (i in 0 until n){
        val t = a[i]
        a[i] = b[i]
        b[i] = t
    }
    println(a.joinToString())
    println(b.joinToString())*/


    //52
    /*val b = FloatArray(n)
    for (i in 0 until n){
        if (a[i] < 5){
            b[i] = a[i] * 2f
        } else {
            b[i] = a[i] / 2f
        }
    }
    println(a.joinToString())
    println(b.joinToString())*/

    //53
    /*val b = IntArray(n){scan.nextInt()}
    val c = IntArray(n)
    for (i in 0 until n){
        if (a[i] > b[i]){
            c[i] = a[i]
        } else {
            c[i] = b[i]
        }
    }
    println(a.joinToString())
    println(b.joinToString())
    println(c.joinToString())*/


    //54
    /*val b = IntArray(n)
    for (i in 0 until n){
        if (a[i] % 2 == 0){
            b[i] = a[i]
        }
    }
    println(a.joinToString())
    println(b.joinToString())*/


    //55
    /*val b = IntArray(n)
    for (i in 0 until n step 2){
        b[i] = a[i]
    }
    println(a.joinToString())
    println(b.joinToString())*/


    //56
    /*val b = IntArray(n)
    for (i in 2 until n step 3){
        b[i] = a[i]
    }
    println(a.joinToString())
    println(b.joinToString())*/


    //57
    /*val b = IntArray(n)
    val c = IntArray(n)
    for (i in 0 until n step 2){
        b[i] = a[i]
    }
    for (i in 1 until n step 2){
        c[i] = a[i]
    }

    println(a.joinToString())
    println(b.joinToString())
    println(c.joinToString())*/

    //58
    /*val b = IntArray(n)
    var k = 0
    for (i in 1 until n){
        k += b[i-1] + a[i]
        b[i] = k
    }
    println(a.joinToString())
    println(b.joinToString())*/


    //59
    /*val b = FloatArray(n)
    var sum = 0f
    for (i in 0 until n) {
        a[i] = scan.nextInt()
        sum += a[i]
        b[i] = sum / (i+1)
    }
    println(b.joinToString())*/

    //60
    /*val b = IntArray(n)
    for (i in 1 until n){
        b[i] = a[i-1] + a[i]
    }
    println(b.joinToString())*/

    //61
    /*val b = FloatArray(n)
    for (i in 0 until n-1){
        b[i] = (a[i] + a[i+1].toFloat()) / 2
    }
    println(b.joinToString())*/

    //62
    /*val b = IntArray(n)
    val c = IntArray(n)
    for (i in 0 until n){
        if (a[i] > 0){
            b[i] = a[i]
        } else {
            c[i] = a[i]
        }
    }
    println(b.joinToString())
    println(c.joinToString())*/


    //63
    /*val b = IntArray(n){scan.nextInt()}
    val c = IntArray(2*n)
    var i = 0 //a
    var j = 0 //b
    var k = 0 //c
    while (i < n && j < n){
        if (a[i] < b[j]){
            c[k++] = a[i++]
        } else {
            c[k++] = b[j++]
        }
    }
    while (i < n){
        c[k++] = b[j++]
    }*/


    //64
    /*val b = IntArray(n){scan.nextInt()}
    val c = IntArray(n){scan.nextInt()}
    val d = IntArray(n*3)
    var i = 0 //a
    var j = 0 //b
    var k = 0 //c
    var l = 0 //d
    while (i < n && j < n && k < n){
        if (a[i] > b[j] && a[i] > c[k]){
            d[l++] = a[i++]
        } else if (c[k] > a[i] && c[k] > b[j]){
            d[l++] = c[k++]
        } else if (b[j] > a[i] && b[j] > c[k]){
            d[l++] = b[j++]
        }
    }
    if (i == n) {
        while (j < n && k < n){
            d[l++] = if (b[j] > c[k]) b[j++]
            else c[k++]
        }
    } else if (j == n){
        while (i < n && k < n){
            d[l++] = if (a[i] > c[k]) a[i++]
            else c[k++]
        }
    }
    else if (k == n){
        while (i < n && j < n){
            d[l++] = if (a[i] > c[k]) a[i++]
            else b[j++]
        }
    }

    println(a.joinToString())
    println(b.joinToString())
    println(c.joinToString())
    println(d.joinToString())

    //test case
    5
    98 78 64 15 67
    68 13 65 49 28
    31 62 95 84 76
*/


    //65
    /*val k = scan.nextInt()    //ver from Mentor
    for ( i in 0 until n){
        if (i == k) continue
        a[i] += a[k]
    }
    a[k] += a[k]*/

    /*val p = a[k]     //ver from B
    for (i in 0 until n) {
        a[i] += p
    }
    println(a.joinToString())*/



    //66
    /*var ch = 0
    for ( i in 0 until n){
        a[i] = scan.nextInt()
        if (a[i] != 0 && ch == 0 && a[i] % 2 == 0) ch = a[i]
    }
    for (i in 0 until n){
        if (a[i] % 2 == 0) a[i] += ch
    }
    println(a.joinToString())*/

    //67
    /*var notch = 0
    for (i in 0 until n){
        a[i] = scan.nextInt()
        if (a[i] != 0 && notch == 0 && a[i] % 2 == 1) notch = a[i]
    }
    for (i in 0 until n){
        if (a[i] % 2 == 1) a[i] += notch
    }
    println(a.joinToString())*/

    //68
    /*var min = Int.MAX_VALUE
    var max = Int.MIN_VALUE
    var minInd = 0
    var maxInd = 0
    for (i in a.indices){
        a[i] = scan.nextInt()
        if (a[i] > max){
            max = a[i]
            maxInd = i
        }
        if (a[i] < min){
            min = a[i]
            minInd = i
        }
    }
    a[maxInd] = a[minInd].apply { a[minInd] = a[maxInd] }
    println(a.joinToString())*/

    //68 v2
    /*var minInd = 0
    var maxInd = 0
    for (i in 1 until n){
        if (a[i] > a[maxInd]){
            maxInd = i
        }
        if (a[i] < a[minInd]){
            minInd = i
        }
    }
    a[maxInd] = a[minInd].apply { a[minInd] = a[maxInd] }
    println(a.joinToString())*/


    //69
    /*for (i in 0 until n step 2){
        a[i] = a[i+1].also { a[i+1] = a[i] }
    }
    println(a.joinToString())*/



    //70
    /*val h = n / 2
    for(i in 0 until h){
        a[i] = a[h + i].also { a[h + i] = a[i] }
    }
    println(a.joinToString())*/

    //71
    /*a.reverse()
    println(a.joinToString())*/

    /*println(a.joinToString().reversed())*/

    //72
    /*val k = scan.nextInt()
    val l = scan.nextInt()
    for ( i in 0 .. (l-k) / 2){
        a[k+i] = a[l-i].also { a[l-i] = a[k+i] }
    }
    println(a.joinToString())*/

    //73
    /*val k = scan.nextInt()
    val l = scan.nextInt()
    for ( i in 0 until (l-k) / 2){
        a[k+i] = a[l-i].also { a[l-i] = a[k+i] }
    }
    println(a.joinToString())*/

    //74
    /*var max = Int.MIN_VALUE
    var min = Int.MAX_VALUE
    var maxInd = 0
    var minInd = 0
    for (i in 0 until n){
        if (a[i] > max){
            max = a[i]
            maxInd = i
        }
        if (a[i] < min){
            min = a[i]
            minInd = i
        }
    }
    val left = minOf(minInd, maxInd) + 1
    val right = maxOf(minInd, maxInd)
    for (i in left until right) a[i] = 0

    println(a.joinToString())*/


    //75
    /*var max = Int.MIN_VALUE
    var min = Int.MAX_VALUE
    var minInd = 0
    var maxInd = 0
    for (i in 0 until n){
        if (a[i] > max){
            max = a[i]
            maxInd = i
        }
        if (a[i] < min){
            min = a[i]
            minInd = i
        }
    }
    val l = minOf(minInd, maxInd)
    val r = maxOf(minInd, maxInd)
    for (i in l until r) a[l+i] = a[r-i].also{ a[r-i] = a[l+i]}
    println(a.joinToString())*/

    //76
    /*var i = 1
    while (i < n-1){
        if (a[i] > a[i-1] && a[i] > a[i+1]){
            a[i] = 0
            i+=2
        } else i++
    }
    println(a.joinToString())*/

    //77
    /*var i = 1
    while (i < n-1){
        if (a[i] < a[i-1] && a[i] < a[i+1]){
            a[i] = a[i] * a[i]
            i += 2
        } else i++
    }
    println(a.joinToString())*/

    //78






    //79
    /*for (i in n-1 downTo 1){
        a[i] = a[i-1]
    }
    a[0] = 0
    println(a.joinToString())*/


    //80
    /*for (i in 1 until n-1){
        a[i] = a[i+1]
    }
    a[0] = 0
    println(a.joinToString())*/

    //81
    /*val k = scan.nextInt()
    for (i in 0 until n-k){
        a[i] = a[i+k]
    }
    println(a.joinToString())*/

    //82
    /*val k = scan.nextInt()
    for (i in 0 until n-k){
        a[i] = a[i+k]
    }
    for (i in n-k until n){
        a[i] = 0
    }
    println(a.joinToString())*/

    //83
    val m = a[0]
    for (i in n-1 downTo 0){
        a[i] = a[i+1]
    }
    a[n] = m
    println(a.joinToString())


}
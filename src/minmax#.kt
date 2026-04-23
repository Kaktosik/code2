import java.util.Scanner
import kotlin.math.max
import kotlin.math.min

fun main(){
    val scan= Scanner(System.`in`)

    //minmax1
    /*val a=scan.nextInt()
    var max= Int.MIN_VALUE
    var min= Int.MAX_VALUE
    for (i in 1..a){
        val n= scan.nextInt()
        if (n>max) max=n
        if (n<min) min=n
    }
    println("$max, $min")*/

    //minmax2
    /*val a=scan.nextInt()
    var min= Int.MAX_VALUE
    for (i in 1..a){
        val n=scan.nextInt()
        if (n<min ) min=n
    }
    println(min)*/

    //minmax3
    /*val n=scan.nextInt()
    var min= Int.MAX_VALUE
    var minInd= -1
    repeat(n){
        val x=scan.nextInt()
        if (x<min){
            min = x
            minInd = it+1
        }

    }
    println(minInd)*/


    //minmax4
    /*val n=scan.nextInt()
    var min= Int.MAX_VALUE
    var minInd= -1
    repeat(n){
        val x= scan.nextInt()
        if (x<min){
            min = x
            minInd = it+1
        }
    }
    println(minInd)*/


    //minmax5
    /*val n= scan.nextInt()
    var maxT= Float.MIN_VALUE
    for (i in 1..n){
        val m=scan.nextFloat()
        val v=scan.nextFloat()
        val t= m/v
        if (t>maxT) maxT=t
    }
    println(maxT)*/

    //minmax6
    /*val n=scan.nextInt()
    var min= Int.MAX_VALUE
    var max= Int.MIN_VALUE
    var minInd=0
    var maxInd=0
    for (i in 1..n){
        val x=scan.nextInt()
        if (x<min){
            min=x
            minInd=i
        }
        if (x>=max){
            max=x
            maxInd=i
        }
    }
    println("$maxInd position = $max\n$minInd position = $min")*/

    //minmax7
    /*val n=scan.nextInt()
    var min= Int.MAX_VALUE
    var max= Int.MIN_VALUE
    var minInd= 0
    var maxInd= 0
    for (i in 1..n){
        val x=scan.nextInt()
        if (x<=min){
            min=x
            minInd=i
        }
        if (x>max){
            max=x
            maxInd=i
        }
    }
    println("$minInd min position = $min\n$maxInd max position = $max")
*/
    //minmax8
    /*val n=scan.nextInt()
    var min= Int.MAX_VALUE
    var minInd= 0
    var minInd1=0
    for (i in 1..n){
        val x=scan.nextInt()
        if (x<min){
            min=x
            minInd=i
        }
        else if(x==min){
            minInd1=i
        }
    }
    println("first min = $minInd\nLast min = $minInd1")*/

    //minmax9
   /* val n=scan.nextInt()
    var max = Int.MIN_VALUE
    var maxInd = 0
    var maxInd1= 0
    for (i in 1..n){
        val x=scan.nextInt()
        if (x>max){
            max=x
            maxInd=i
        }
        else if (x==max) maxInd1=i
    }
    println("first max = $maxInd\nlast max = $maxInd1")*/

    //minmax10
    /*val n=scan.nextInt()
    var min= Int.MAX_VALUE
    var max= Int.MIN_VALUE
    var minind=0
    var maxind=0
    for (i in 1..n){
        val x=scan.nextInt()
        if (x>max){
            max=x
            maxind=i
        }
        if (x<min){
            min=x
            minind=i
        }
    }
    if (minind<maxind)println("pos: $minind, numb: $min")
    else println("pos: $maxind, numb: $max")*/

    //minmax11
    /*val n=scan.nextInt()
    var min= Int.MAX_VALUE
    var max= Int.MIN_VALUE
    var minind= 0
    var maxind= 0
    for (i in 1..n){
        val x=scan.nextInt()
        if (x>max){
            max=x
            maxind=i
        }
        if (x<min){
            min=x
            minind=i
        }
    }
    if (minind<maxind)println("pos: $maxind, numb: $max")
    else println("pos: $minind, numb: $min")*/

    //minmax12
    /*val n=scan.nextInt()
    var min= Int.MAX_VALUE
    var minInd= 0
    for (i in 1...n){
        val x=scan.nextInt()
        if (x<min){
            min=x
            minInd=i
        }
    }
    if (minInd>0)println("pos: $minInd, numb: $min")
    else println("0")*/

    //minmax13
    /*val n=scan.nextInt()
    var max= Int.MIN_VALUE
    var maxind= 0
    for (i in 1..n){
        val x=scan.nextInt()
        if (x>max){
            max=x
            maxind=i
        }
    }
    if (maxind%2==1)println("pos: $maxind, numb: $max")
    else println("pos: -1, numb: -1")*/

    //minmax14
    /*val b=scan.nextInt()
    var min= Int.MAX_VALUE
    for (i in 1..10){
        val x= scan.nextInt()
        if (x > b && x < min){
            min=x
        }
    }
    if (min == Int.MAX_VALUE) min=0
    println(min)*/

    //minmax15
    /*val b=scan.nextInt()
    val c=scan.nextInt()
    var max= Int.MIN_VALUE
    var maxInd= 0
    for (i in 1..10){
        val x=scan.nextInt()
        if (x>b && x>c && x>max){
            max=x
            maxInd=i
        }
    }
    if (max>b && max > c)println("pos: $maxInd, numb: $max.")*/

    //minmax16
    /*val n=scan.nextInt()
    var min = Int.MAX_VALUE
    var minInd= 0
    for (i in 1..n){
        val x=scan.nextInt()
        if (x<min){
            min = x
            minInd=i
        }
    }
    minInd--
    println("pos: $minInd")*/

    //minmax17
    /*val n=scan.nextInt()
    var max= Int.MIN_VALUE
    var max1=0
    var max2=0
    for (i in 1..n){
        val x=scan.nextInt()
        if (x>max){
            max = x
            max1=i
        }
        else if (x==max){
            max2 = i
        }
    }
    println(max2-n)*/


    //minmax18
    /*val n=scan.nextInt()
    var max= Int.MIN_VALUE
    var maxInd= 0
    var maxLast=0
    for ( i in 1..n){
        val x=scan.nextInt()
        if (x>max){
            max=x
            maxInd=i
        }
        else if (x==max){
            maxLast = i
        }
    }
    println(maxLast-maxInd-1)*/


    //minmax19
    /*val n=scan.nextInt()
    var min= Int.MAX_VALUE
    var minInd= 0
    var minCount=0
    for (i in 1..n){
        val x=scan.nextInt()
        if (x < min){
            min=x
            minInd=1
        }
        else if (x==min) minCount++

    }
    println("pos: $minInd, numb: $min, count: $minCount.")*/


    //minmax20
    /*val n=scan.nextInt()
    var max= Int.MIN_VALUE
    var min = Int.MAX_VALUE
    var maxCount = 0
    var minCount = 0
    for (i in 1..n){
        val x=scan.nextInt()
        if (x>max){
            max=x
            maxCount=1
        }
        else if (x==max){
            maxCount++
        }
        if (x<min){
            min=x
            minCount=1
        }
        else if (x==min) minCount++
    }
    println(minCount+maxCount)*/

    //minmax21
    /*val n=scan.nextInt()
    var min= Int.MAX_VALUE
    var max= Int.MIN_VALUE
    var minCount=0
    var maxCount=0
    val s=scan.nextDouble()
    for (i in 1..n){
        val x=scan.nextInt()
        if (x < min){
            min=x
            minCount = 1
        }
        else if (x==min) minCount++

        if (x > max){
            max=x
            maxCount=1
        }
        else if (x==max) maxCount++
    }
    val oA= (s - min * minCount - max * maxCount) / (n - minCount - maxCount)
    println(oA)*/

    //minmax22
    /*val n=scan.nextInt()
    var min1= Int.MAX_VALUE
    var min2= Int.MAX_VALUE

    for (i in 1..n){
        val x=scan.nextInt()
        if (x < min2){
            min1=min2
            min2=x
        }
        else if (x < min1){
            min1 = x
        }
    }
    println("$min2, $min1")*/

    //minmax23
    /*val n=scan.nextInt()
    var max3= Int.MIN_VALUE
    var max1= Int.MIN_VALUE
    var max2= Int.MIN_VALUE
    for (i in 1..n){
        val x = scan.nextInt()
        if (x > max1){
            max3=max2
            max2=max1
            max1=x
        }
        else if (x > max2){
            max2=max1
            max2=x
        }
        else if (x > max3){
            max3=x
        }
    }
    println("$max1, $max2, $max3.")*/


    //minmax24
    /*val n=scan.nextInt()
    var maxSum = Int.MIN_VALUE
    var prev= 0
    for (i in 1..n){
        val x=scan.nextInt()
        if (i != 1){
            prev += x
            if (prev > maxSum){
                maxSum = prev
            }
        }
        prev = x
    }
    print(maxSum)*/

    //minmax25
    /*val n=scan.nextInt()
    var min = Int.MAX_VALUE
    var prev=1
    for (i in 1..n){
        val x=scan.nextInt()
        if (i != 1){
            prev *= x
            if (prev < min){
                min = prev
            }
        }
    }
    println("$prev")*/



    //minmax26
    /*val n = scan.nextInt()
    var max = Int.MIN_VALUE
    var maxInd = 0
    var maxCount = 0
    var curCount = 0
    repeat(n){
        val a = scan.nextInt()
        if(a % 2 == 0){
            curCount++
            //if(maxCount < curCount) maxCount = curCount
            maxCount = max(maxCount, curCount)
            maxInd = i
        } else {
            curCount = 0
        }
    }

    println(maxCount)*/


    //minmax27
    /*val n=scan.nextInt()
    var prev = 0
    var maxCount = 0
    var curCount = 0
    var maxInd = -1
    var curInd = 0
    for (i in 1..n){
        val x=scan.nextInt()
        if (i != 1){
            if (x == prev){
                curCount++
            }
            else{
                if (curCount > maxCount){
                    maxCount = curCount
                    maxInd = curInd
                }
                curCount=1
                curInd = i
            }
        }

        prev = x
    }
    println("$maxCount, $maxInd")*/

    //minmax28
    /*val n=scan.nextInt()
    var maxCount = 0
    var curCount = 0
    var maxInd = -1
    var curInd = 0
    for (i in 1..n){
        val x=scan.nextInt()
        if (x == 1){
            curCount++
            if (curCount == 1){
                curInd = i
            }
            if (curCount > maxCount){
                maxCount=curCount
                maxInd=curInd
            }
        } else{
            curCount=0
        }
    }
    println("$maxCount, $maxInd")*/


    //minmax29
    /*val n=scan.nextInt()
    var min = Int.MAX_VALUE
    var curCount=0
    var maxCount = 0
    for (i in 1..n){
        val x = scan.nextInt()
        if (min > x){
            min = x
            curCount = 1
            maxCount = max(maxCount, curCount)
        } else if (min == x){
            curCount++
            maxCount = max(maxCount, curCount)
        } else {
            curCount=0
        }
    }
    println("$maxCount, $min")*/


    //minmax30
    /*val n = scan.nextInt()
    var max = Int.MIN_VALUE
    var minCount = Int.MAX_VALUE
    var curCount = 0
    for (i in 1..n){
        val x = scan.nextInt()
        if (max < x){
            max = x
            curCount = 1
        } else if (max == x){
            curCount++
        } else {
            if (curCount < minCount && curCount > 0){
                curCount = 0
            }
        }
    }
    if (curCount < minCount && curCount > 0){
        curCount = 0
    }

    println("$minCount, $max")*/

    /*repeat(5){
           println("Hello world!")
       }*/

}
//For Loops--------------------------------------------------------------
//import java.util.Scanner
//fun main(){
//    val obj = Scanner(System.`in`)
//    print("Enter Number:")
//    val num = obj.nextInt()
//    for(i in 1..10){
//        println("$num x $i = ${num*i}")
//    }
//}
//-----------------
//fun main(){
//    for(i in 10 until 20){
//        println(i)
//    }
//}
//-------------
//fun main(){
//    for(i in 20 downTo  1){
//        if(i==10) break
//        println(i)
//    }
//}
//---------------
//fun main(){
//    for (sum in 1..30){
//       if(sum==21) break
//        println(sum)
//    }
//}
//------------------
//fun main(){
//    for(value in 30 downTo 1){
//        when(value){
//            9-> break
//        }
//        println(value)
//    }
//}
//------------------
//fun main(){
//    for(x in 1..20 step 2){ // 1 3  5 7 9 11 13 15.....
//        println(x)
//    }
//}
//--------------
//fun main(){
//    for(a in 20 downTo 1 step 2){
//        println(a)
//    }
//}
//-------------
//fun main(){
//
//    var count = 0;
//    for (i in 1..30){
//
//        if(i % 2 != 0) continue
//        count++
//        println(i)
//    }
//    println("Total Number is Even found: $count")
//}
//-----------------------
//fun main(){
//    var multipleNumber = 0
//    for (x in 1..30){
//        if (x%2==0) continue
//            multipleNumber++
//        println(x)
//    }
//    println("Total Number is Odd found: $multipleNumber")
//}


//While Loops-----------------------------------------------------------------
//fun main(){
//    var num = 0;
//    while( num<= 10){
//        println(num)
//        num++
//    }
//}
//----------------------
//fun main(){
//   var i = 0;
//   outer@ while (1<=20){
//       i++
//        if(i in 10..15){
//
//           // continue
//            break
//
//        }
//        println(i)
//    }
//}
//---------------------
//fun main(){
//    var total = 0
//    while (total<=30){
//        total++
//        when(total) {
//            21 -> continue
//
//        }
//        println(total)
//    }
//}
//----------------------
//fun main(){
//    var a = 0
//    while(a<=5){
//        a++
//        println(a)
//
//    var x = 0
//    while(x<=5){
//        x++
//        println("*****$x")
//    }
//    }
//}
//----------------------
//fun main(){
//    var number = 1
//    var NumberCount = 0
//    while(number<=30){
//        number++
//        if((number%2)==0){
//            continue
//        }
//        NumberCount++
//        println(number)
//    }
//    println("Total number of even number found: $NumberCount")
//
//}
//---------------
//fun main(){
//    var sum = 0;
//    var count = 0;
//    while(sum<=30){
//        sum++
//        if(sum%2==0)continue
//        count++
//        println(sum)
//    }
//    println("Total ood  number is found: $count")
//}

//fun main(){
//    print("Enter your number: ")
//    val num = readln().toInt()
//
//    var sum = 0
//    var i = 0
//
//    while (i<num){
//    val count = readln().toInt()
//        sum += count
//        i++
//    }
//    println("The total sum is: $sum")
//}


//fun main(){
//    println("Enter a string: ")
//    val input = readln()
//    for(i in input){
//        println(i)
//    }
//
//}


//fun main(){
//    print("Enter a string: ")
//    val input = readln()
//    for(i in input.lastIndex downTo 0 ){
//        println(input[i])
//    }
//}


//fun main(){
//    print("Enter string: ")
//    val string = readln()
//    println(string.reversed())
//}

//fun main(args: Array<String>){
//  println(seyHallo("Alex", 17  ))
//
//    val internet:Int = 4
//    if(internet==5) someData("short data")
//    else myData()
//
//
//}
//fun seyHallo(name:String, age:Int){
//    println("Hello $name Your age is $age")
//}
//fun someData(data:String){
//    println("Your data is $data")
//}
//fun myData(){
//    println("There is no internet connection")
//}
//--------------------
//import java.util.Scanner
//fun main(){
//    val new = Scanner(System.`in`)//Scanner sc = new Scanner(System.in);
//    print("Enter The Value a: ")
//    val a = new.nextInt()
//    print("Enter The Value b: ")
//    val b = new.nextInt()
//    if(a>b){
//        println("Value: ${a*b}")
//    }
//    else{
//        println(getValue())
//    }
//}
//fun getValue():String{
//    return "No value"
//}
//-------------

//fun sumValue(a:Int, b:Int, c:Int) = a*b*c
//
//fun main(){
//    println("Value = "+sumValue(12,14,34))
//}
//----------
//fun sum(vararg numbers:Int):Int{
//    var result = 0
//    for(number in numbers){
//        result += number
//    }
//    return result
//}
//fun main(){
//    println(sum(1,3,4,5,6,7,8,4))
//}
//------------

//fun main(){
//    print("Enter a Number: ")
//    val num = readln().toIntOrNull()
////    print("Enter a Number 2: ")
////    val num2 = readln().toDouble()
//
//    println("Your Number is $num")
//}

//fun main(){
//    print("Enter Number: ")
//    val num = readln()
//    val num2= num.toIntOrNull()?.inc()
//    println("The Number is $num2")
//}

//fun main(){
//    print("Enter a Number: ")
//    val number = readln().toIntOrNull()
//    if(number != null){
//       val num = if(number % 2 == 0) "The Number is even!"
//        else null
//        println(num)
//
//    }
//    else "Enter a valid number"
//
//    }


fun main(args: Array<String>){
    println(sumValue(1,2,3,4,5,6,7,8,9,10,12,23))
}
fun sumValue(vararg number:Int){
    number.forEach { println(it) }
}
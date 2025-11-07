//fun calculate(x:Int, y:Int, operation:(Int, Int)->Int): Int{
//    return operation (x, y)
//}
//
//val add:(Int, Int) -> Int = { a, b -> a + b }
//val subtract: (Int, Int) -> Int = { a, b -> a - b }
//val multiply: (Int, Int) -> Int = {a, b -> a * b}
//val divide: (Int, Int) -> Int = {a, b -> if(a%b != 0) a / b else 0}
//
//
//fun main() {
//    val x = 10
//    val y = 20
//
//    println("Add: ${calculate(x, y, add)}")
//    println("Subtract ${calculate(x, y, subtract)}")
//    println("Multiply: ${calculate(x, y,multiply)}")
//    println("Divide: ${calculate(x, y,divide)}")
//
//}

//--------
//fun calculate(x:Int, y:Int,operator: (Int, Int) -> Int):Int {
//    return operator(x, y)
//}
//fun calculate(x:Int, y:Int, operator: String):Int{
//    return when(operator){
//        "+" -> calculate(x, y) { a, b -> a + b }
//        "-" -> calculate(x, y) {a, b -> a - b}
//        "*" -> calculate(x, y){a, b -> a * b}
//        "/" -> calculate(x, y){a, b -> if (b!=0) a/b else 0}
//        else 0
//    }
//}
//fun main() {
//    println(calculate(10,20, "+"))
//    println(calculate(5,10,"-"))
//    println(calculate(12,20, "*"))
//    println(calculate(30,50, "/"))
//}
//----
//fun sum(a:Int, b:Int, operator:(Int, Int) -> Int):Int {
//    return operator(a, b)
//}
//
//fun main(){
//    println("Addition: ${sum(20,30 ){a, b -> a + b}}")
//    println("Multiply: ${sum(20,30){ a, b -> a * b}}")
//}
//------

//fun main(){   // Lambda
////    val square: (Int) -> Int = { it * 2 }
////    println(square(10))
//    val add: (Int, Int) ->Int = {a, b -> a * b}
//    println(add(10,20))
//
//}

//-------
//fun circle(area:Double, square:Double, operator:(Double, Double) -> Double):String{
//    return "Rectangle = ${operator(area,square)}"      // Lambda pass parameter
//}
//
//fun main(){
//    val sum = circle(10.20, 20.21){area, square -> area / square}
//    val sum2 = circle(5.23,3.1416){area, square -> area * square}
//
//    println(sum)
//    println(sum2)
//}
//--------
//fun main(){
//    val numbers = listOf(1,2,3,4,5,6,7,8,9,10) // Lambda with collection
//
//    val even = numbers.filter{it % 2 == 0}
//    val square = numbers.map{it * it}
//    val odd = numbers.filter{it % 2 != 0}
//
//    println("Even numbers: $even")
//    println("Square numbers: $square")
//    println("Odd numbers: $odd")
//}
//----
//fun main() {
//    val value = listOf(1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
//    val square = value
//        .filter{it%2==0}
//        .map{it*it}
//    println(square)
//}
//-------
//fun main() {
//    val value = listOf(1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
//    val square = value
//        .filter{it%2==0}
//        .map{it*it}
//        .filter { it <= 50 }
//    println(square)
//}

//-----
//fun main() {
//    val value = listOf(1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
//   for(num in value){
//   if(num % 2 == 0){
//       val square = num * num
//       if(square>60)break
//       println(square)
//     }
//   }
//}


//--------
//inline fun calculateInline(a:Int, b:Int, operation:(Int, Int) -> Int):Int{ // lambda with inline
//    return operation(a, b)
//}
//
//fun main() {
//    val s1 = calculateInline(100,3000){a, b -> a * b}
//    val s2 = calculateInline(200, 50){a, b -> a / b}
//
//    println("Add: $s1")
//    println("Multiply: $s2")
//
//}

//inline fun measureTime(action: () -> Unit) {
//    val start = System.currentTimeMillis()
//    action()
//    val end = System.currentTimeMillis()
//    println("Time taken: ${end - start} ms")
//}
//
//fun main() {
//    measureTime {
//        for (i in 1..1_000_000) {}
//    }
//}
//------






//fun add(a: Int, b:Int, action:(Int)->Unit){
//     action(a + b)
//}
//fun main() {
//    add(10,20,{a:Int -> println(a)})
//}

//---------
//fun main(){
//    val trickFun = ::trick
//    trick()
//    trickFun()
//}
//val trick = {
//    println("No trick")
//}

//-------
//fun main(){
//    val treat:() -> Unit = {
//        println("Have a treat")
//    }
//}

//----------
////val square:(Int)->Int = {x -> x * x}
//val square = {it: Int -> it*it}
//val area:(Int, Int)->Int = {a, b -> a + b}
//val get:()->String = { "Hello kotlin" }
//val value = {it:Int -> it*it}

//fun main(){
//    println(square(20))
//    println(area(10,30))
//    println(get())
//    println(value(2))
//}

//--------
//fun value(a: Int, b: Int,count:(Int,Int) -> Int):Int{
//    return count(a, b)
//}
//
//fun main() {  //Lambda with higher order
//    val v1 = value(10,20,{a, b -> a + b})
//    val v2 = value(300,100,{a, b -> a - b})
//    val v3 = value(10,5,{a, b -> a * b})
//    val v4 = value(300,5){a, b -> a / b}
//
//    println("a + b = $v1")
//    println("a - b = $v2")
//    println("a * b = $v3")
//    println("a / b = $v4")
//}

//---------
//fun main(){
//upperCase("Hello kotlin",{s: String -> s.uppercase()})
//upperCase("HELLO WORLD",{it.lowercase()})
//}
//
//fun upperCase(str: String) {}
//
//fun upperCase(str:String, myFunction:(String) -> String){
//    val uppercaseWord = myFunction(str)
//    println(uppercaseWord)
//}


//fun value(a: Int, b: Int, count:(Int, Int)->Int):Int{
//          return count(a, b)
//}
//fun main(){
//    val v1 = value(20,30){a, b -> a*b}
//    println("a + b = $v1")
//}

fun count(a: Int, b:Int ){

}
fun main(){

}
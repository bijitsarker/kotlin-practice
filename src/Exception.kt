//fun main(){
//    val number = listOf(1)  // exception error
//    println(number[1])
//}
//-------

//fun main() {
//    val a = 10
//    val b = 0
//    val result = try{
//        println(a/b)
//        a/b
//    }catch (e: ArithmeticException){
//        println("you can't drive by zero: ${e.message}")
//    }finally{
//        println("Divide by zero")
//    }
//    println(result)
//}


//fun main(){
//    try{
//   val number= arrayOf(1,2,3)
//        val result = 10/0
//        println(number[5])
//    } catch (e: ArithmeticException){
//        println("The zero is no allowed")
//        0
//    }finally {
//        println("The value is allowed")
//    }
//


fun checkPassword(pass: String){
    if(pass.length < 6){
        throw ArithmeticException("To short Password")  // error throw
    }
    else {
        println("Password is exapted")
    }
}
fun main(){

    try {
        checkPassword("1273")
        //checkPassword("1234567")
    } catch(e: IllegalArgumentException){
       println("Error: ${e.message}")
    }
    println("Password still running")
}
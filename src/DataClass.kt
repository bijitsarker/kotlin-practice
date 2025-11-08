// class User(val name:String, val id:Int)
//    fun main(){
//        val user = User("Bijit", 102)
//        println(user)
//    }

//print as string-----------------------------------------------------------------
//data class Drive(val name:String, val id:Int)
//
//fun main(){
//    val user = Drive("Bijit", 202)
//    println(user)
//}


// compare instances---------------------------------------------------------
//data class User(val name:String, val age:Int)
//
//    fun main(){
//        val fristuser = User("Alex", 10)
//        val seconduser = User("Max",11)
//        val thirduser = User("Alex", 10)
//        println("Compare fristuser to seconduser: ${fristuser==seconduser}")
//        println("Compare fristuser to thirduser: ${ thirduser==fristuser}")
//        println("Compare fristuser to thirduser: ${ seconduser==fristuser}")
//
//}

//copy instances-------------------------------------------------------------------------
//data class People(val email:String, val cgpa: Float)
//
//fun main(){
//    val obj = People("ABC@gmail.com", 5.7F)
//    println(obj.copy())
//    println(obj.copy("abc@gmail.com"))
//    println(obj.copy("Alex@gmail.com", 8.9F))
//}


data class Number(val a: Int, val b: Int){
    fun add(c: Int){
        println("Add Number ${c * 3}")
    }
}

fun main() {
    val number = Number(20, 30)
    val number2 = Number(10, 35)
    number.add(40)

    println("Number = ${number.a * number.b}")
    println("The Compare Number: ${number == number2}")

}
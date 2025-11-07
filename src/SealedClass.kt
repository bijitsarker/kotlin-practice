import Person

//sealed class Fruits
//    class Apple(): Fruits()
//    class Mango(): Fruits()
//    class Banana(): Fruits()
//
//fun describe(fruits: Fruits){
//    when(fruits){
//        is Apple -> println("The fruit is apple.")
//        is Mango -> println("The fruit is mango")
//        is Banana -> println("The fruit is banana")
//    }
//}
//
//fun main(){
//    println(describe(Apple()))
//    println(describe(Mango()))
//    println(describe(Banana()))
//}


//sealed class Fiend {
//    class Error(val error: String) : Fiend()
//    class Successes(val data: String) : Fiend()
//    object Message : Fiend()
//}
//
//fun result(fiend: Fiend): String {
//    return when (fiend) {
//        is Fiend.Error -> "Error: ${fiend.error}"
//        is Fiend.Successes -> "Data: ${fiend.data}"
//        is Fiend.Message -> "Loading...."
//    }
//}
//
//fun main() {
//    println(result(Fiend.Error("Network failed")))
//    println(result(Fiend.Successes("User data loaded")))
//    println(result(Fiend.Message))
//}


sealed class Men{
   open class Person(val name1:String, val age: Int){
       var salary = 0

        fun person(){
            println("Person Name: $name1 \n Person Age: $age \n Person Salary: $salary")
        }
    }

    class Child(val name:String, name1: String, age: Int):Person(name1, age){
        fun child(age: Int, salary: Int){
            person()
            println("Child Name: $name \n Child Age: $age \n Child Salary: $salary")
        }
    }
}

fun main(){
    val per = Men.Child("Alex","Sami",20)
    println(per.child(20,200000))

}

//fun main() {
//    val user = User().apply {
//        firstName = "Alex"
//        lastName = "Sarma"
//        this.age = 20
//    }
//    with(user){
//        println(firstName)
//        println(lastName)
//        println(age)
//    }
//}
//class User{
//    var firstName = ""
//    var lastName = ""
//    var age = 0
//}
//---------
//fun main(){
//    val car = Car()
//    with(car){
//       name = "Tesla"
//       brand = "UMP"
//       year = 2009
//        "text"
//    }
//}
//class Car{
//    var name: String = ""
//    var brand: String = ""
//    var year: Int = 0
//}

//---------
//fun main() {
//    val result = User("Facebook","Whatsapp", 2015).also {
//      //println(result)
//        println(it)
//    }
//}
//
// data class User(val firstName:String, val lastName:String, val year:Int)
//-----
//fun main(){
//    val text: String? = "apple"
//    text?.let{
//        println(text.length)
//        println(text.uppercase())
//    }
//}
//Let--------------------------------------------
//data class Person(var name: String, var age: Int)
//
//fun main() {                         //normal function
//    val person: Person? = Person("Alex",20)
//    if(person != null){
//        println("Age: ${person.age}")
//        println("Name length: ${person.name.length}")
//    }
//}
//------
//data class Person(var name: String, var age: Int)
//
//fun main(){                       // Let function
//    val person:Person? = Person("Alex",20)
//      person?.let {
//          //  println("Age: ${it.age}")
//          // println("Name length: ${it.name.length}")
//
//          println("Age: ${person.age}")
//          println("Name length: ${person.name.length}")
//      }
//}

//ran------------------------------------------------
//data class User(var name: String, var age: Int)
//fun main(){                             //normal function
//    val user = User("Sami",12)
//    println("My name is ${user.name} and i am ${user.age} years old")
//}

//data class User(var name: String, var age: Int)
//
//fun main() {
//    val user = User("Sami",12)
//    val result = user.run{        // run
//        "My name is $name and i am $age years old"
//    }
//    val result2 = with(user){  // with
//        "My name is $name and i am $age years old"
//    }
//    println(result)
//    println(result2)
//
//}

//with----------------------------------------
//data class Gan(var name: String, var year: Int)
//fun main(){       //normal function
//    val gan = Gan("MP40",2009)
//    println("Gun: ${gan.name}, year: ${gan.year}")
//    gan.name = "Ump"
//    gan.year += 5
//    println("updated Gun: ${gan.name}, New year: ${gan.year}")
//}
//-------
//data class Gan(var name: String, var year: Int)
//
//fun main() {
//    val gan = Gan("MP40",2009)
//    val gun = with(gan){
//        println("Gun: $name, year: $year")
//
//        name = "AK47"
//        year = 2015
//        println("updated Gun: $name, New year: $year")
//    }
//}

//apply---------------------------------------------
//data class Car(var name:String, var brand:String, var year: Int)
//fun main(){     // normal function
//    val car = Car("BMW", "M140", 2003)
//    car.name = "Tesla"
//    car.brand = "En24"
//    car.year = 2006
////    println(car.name)
////    println(car.brand)
////    println(car.year)
//    println(car)
//
//}
//------
//data class Car(var name: String, var brand: String, var year: Int)
//
//fun main() {                  // apply
//    val car = Car("Tesla","WR10",2003).apply{
//        name = "Ford"
//        brand = "UMP"
//        year = 2020
//    }
//    println(car)
//}

//also----------------------------------------------
//data class Person(var name:String, var age:Int)
//fun main(){
//    val person = Person("Bijit",17)
//    println("Now updated: $person")
//    person.age += 5
//    println("After updated: $person")
//}
//-----
data class Person(var name: String, var age: Int)

fun main() {
    val person = Person("Bijit", 12).also{
        println("Now updated: $it")
    }.apply{
        age +=100
        name = "Bijit sarker"
    }.also{
        println("After updated: $it")
    }
}
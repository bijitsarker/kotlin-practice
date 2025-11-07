import kotlin.Int

//open class Car(val name:String, val color:String, val doors:Int){
//    fun total(name2:String){
//        println("Car Name: $name\nCar Color: $color\nCar Doors: $doors")
//        println("Car Name: $name2")
//    }
//    fun plain(color2:String){
//        println("Car color: $color2")
//    }
//}
//open class Vehicle(val count:Int):Car(name = "BMW", color = "red", doors = 4){
//    val age:Int = 0
//    val pName = ""
//    fun person(){
//
//        println("Person Name: $pName\nPerson Age: $age")
//    }
//}
//class SuperVehicle(val num:Int):Vehicle(count = 20){
//    fun sum( area:Double){
//        println("The Sum = ${num + area}")
//    }
//
//}
//fun main(){
//    val all = SuperVehicle(20)
//    all.total("Tesla")
//    all.plain("Green")
//    all.person()
//    all.sum(3.1416)
//
//}

//----------------------
//open class ParentClass(val name: String){
//    var age: Int = 0
//    var salary: Int = 0
//    fun parents(){
//        println("Parent Name: $name")
//        println("Parent Age: $age")
//        println("Parent Salary: $salary")
//    }
//}
//
//class ChildClass( name: String, val name2: String): ParentClass(name){
//    fun child(age: Int, salary: Int){
//        println("Child Name: $name2")
//        println("Child Age: $age")
//        println("Child Salary: $salary")
//        parents()
//    }
//}
//
//fun main(){
//    val Child = ChildClass("Alex","Sam")
//    Child.age = 20
//    Child.salary = 800000
//    println(Child.child(17,30000))
//
//}

//--------
open class Gun(val name: String, val size: Double, val damage: Int) {
    private var model: String = ""

    fun privateGun() {
        println("Private gun model: $model")
    }

    fun publicGun() {
        println("gun name: $name \n gun size: $size \n gun damage: $damage")
    }

        fun setModel(m:String){ model = m}
        fun setModel():String{
            return model
        }
      }

    class Car(name:String, size: Double, damage: Int): Gun(name, size, damage){
        fun car(name: String, prize: Int){
            privateGun()
            publicGun()
            println("Car name: $name \n Car prize: $prize")
        }
    }

fun main(){
    val obj = Car("UMP",20.5,2000)
    obj.setModel("MP40")
    obj.car("Tesla", 3000000)

}

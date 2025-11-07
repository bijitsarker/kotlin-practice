//interface Vehicle{
//    fun strat()
//    fun stop()
//}
//class Vehicle1: Vehicle{
//    override fun strat(){
//    println("Strat The car")
//}
//    override fun stop() {
//        println("Stop The car")
//    }
//}
//fun main(){
//    val v1 = Vehicle1()
//    v1.strat()
//    v1.stop( )
//}
//----------
//interface Driver{
//    var name:String
//    var id: Int
//     fun drive(age:Int){
//        println("Driver Name: $name\nDriver Id: $id\nDriver Age: $age")
//    }
//}
//interface Car{
//    var model: String
//    var color: String
//     fun drive2(speed:Double){
//
//    }
//}
//class State(var doors: Int): Driver, Car{
//    override var name = ""
//    override var id = 0
//    override var model = ""
//    override var color = ""
//    override fun drive2(speed: Double){
//        println("Car Model: $model\nCar Color: $color\nCar Speed $speed")
//    }
//}
//fun main(){
//    val state = State(4)
//    state.name = "Alex"
//    state.id = 1012
//    state.drive(20)
//    println()
//    state.model = "Tesla"
//    state.color = "red"
//    state.drive2(2000.00)
//
//}
//-----------
//interface Engin{
//    fun startEngin(min: Int)
//
//    fun stopEngin(min2: Int)
//}
//
//class StartStopEngin(var a: Int,var b: Int): Engin {
//    override fun startEngin(min: Int) {
//        println("The Engin start at ${min + a} minute.")
//
//    }
//
//    override fun stopEngin(min2: Int) {
//       println("The Engin stop after ${min2 + b} minute.")
//    }
//}
//
//fun main(){
//    val and = StartStopEngin(2,3)
//    and.startEngin(2)
//    and.stopEngin(4)
//}
//-------------
//interface Alon{
//    fun engin()
//}
//
//class Car(var model: String, var color: String): Alon {
//    override fun engin() {
//        println("Car Model: $model\nCar Color: $color")
//    }
//}
//
//class Truck(var model:String, var color: String): Alon{
//    override fun engin(){
//        println("Truck Model: $model\nTruck Color: $color")
//        }
//    }
//
//class Plane(var model: String, var color: String): Alon{
//    override fun engin(){
//        println("Plane Model: $model\nPlane Color: $color")
//    }
//}
//
//class Tesla(var model: String, var color: String): Alon{
//    override fun engin(){
//        println("Tesla Model: $model\nTesla Color: $color")
//    }
//}
//
//fun main(){
//    val car = Car("MPO20","Black")
//    val truck = Truck("MP40", "Green")
//    val plane = Plane("Jet20","white")
//    val tesla = Tesla("UMP","Red")
//
//    car.engin()
//    truck.engin()
//    plane.engin()
//    tesla.engin()
//}
//------------
//interface A{
//    fun a1()
//}
//interface B{
//    fun a2()
//}
//class ABC: A {
//    override fun a1() {
//        println("value abc")
//    }
//}
//class MPO: B{
//    override fun a2(){
//        println("value mpo")
//    }
//}
//fun main(){
//    val app = ABC()
//    val app2 = MPO()
//    app.a1()
//    app2.a2()
//}


interface Animal1{
    fun tiger(count: Int,count2: Int): String
}

interface Animal2{
    fun dear(num: Int)
}

class Forest(val name: String,):Animal1,Animal2{
    override fun tiger(count: Int, count2:Int):String {
        return "The Animal in forest ${count + count2}"
    }

    override fun dear(num: Int) {
        println("The dear : $num")
        println("The animal name: $name")
    }

}

fun main(){
    val animal = Forest("LIon")
    println(animal.tiger(20,30))
   println( animal.dear(40))
}

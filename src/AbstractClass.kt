//abstract class  Vehicle(val a:Int, val c:Int) {
//    fun count(b: Int) {
//        println ("The value of $a + $b = ${a + b}")
//    }
//
//    fun count2(h: Double) {
//        println ("The value of $c + $h * ${Math.PI} = ${c + h * Math.PI}")
//    }
//
//    abstract fun count3()
//}
//class Area( a: Int,  c: Int, val square: Int): Vehicle(a,c){
//    override fun count3(){
//        println(" count3 = ${a * square + c}")
//    }
//}
//fun main(){
//    val area = Area(12,10,15)
//    area.count(50)
//    area.count2(30.5)
//    area.count3()
//
//}
//------------------
//abstract class Student{
//    abstract fun user()
//
//    abstract fun user2()
//}
//class Person(val name: String, val roll: Int): Student(){
//    override fun user(){
//        println("The student Name: $name")
//    }
//    override fun user2(){
//        println("The student Roll: $roll")
//    }
//}
//fun main(){
//    val student = Person("Alex", 20)
//    student.user()
//    student.user2()
//}
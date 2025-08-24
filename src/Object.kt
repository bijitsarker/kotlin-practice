//object Animal{
//    val name = "Lion"
//    fun name(animal:String){
//        println("The $name eat $animal")
//    }
//}
//fun main(){
//    println(Animal.Tname("dear"))
//}
// Data Object---------------------------------
//data object Person{
//    fun Deteil(name:String, age:Int, cgpa:Double){
//        println("Your name $name Age $age & Cgpa $cgpa")
//    }
//}
//fun main(){
//    Person.Deteil("Alex",20,6.7)

//}
//Companion Object------------------------------------
//class Number{
//    companion object Count{
//        fun getCount(num:Int, num2:Double, num3:Int):Int{
//            return  (num * num2.toInt() * num3)/2
//        }
//    }
//}
//fun main(){
//    println(Number.getCount(10,12.23,30))
//}
//----------------
//class MyNumber{
//    companion object Number{
//        fun count(a:Int, b:Int, c:Double): String{
//            return "Total Number: ${a + b + c}"
//        }
//    }
//}
//fun main(){
//    println(MyNumber.count(10,12,20.0))
//}
//-----------
//object Forest{
//    val name = ""
//    fun Animal(name:String,count:Int):String{
//        return "Animal Name: $name \n Animal Count: $count"
//    }
////    override fun Animal(name2:String, count2;Int){
////        println ("Animal2 Name: $name2 \n Animal2 Count: $count")
////    }
//}
//fun main(){
//    println(Forest.Animal("Dear",30))
//}
//----------
//object Car{
//    var name:String = ""
//    var model:String = ""
//    var year:Int = 0
//    var price:Int = 0
//    fun getInfo(): String{
//        return "Car Name = $name\nCar Model = $model\nCar Year = $year\nCar Price: $price"
//    }
//}
//fun main(){
//   Car.getInfo()
//    Car.name = "Tesla"
//    Car.model = "UMP"
//    Car.year = 1990
//    Car.price = 20000000
//    println(Car.getInfo())
//
//}
//-----------
//data object Sum{
//    fun count(a:Int, b: Double): String{
//        return "Total Sum = ${a + b}"
//    }
//}
//fun main(){
//    println(Sum.count(12,8.00))
//    val max:Int = Int.MAX_VALUE
//}
//-----------
class Database private constructor(){
    companion object{
        private var instance: Database? = null
        fun getInstance():Database?{
            if(instance == null){
                instance = Database()
            }
           return instance
        }

    }
}
fun main(){
    val ins = Database.getInstance()
    println(ins)
}
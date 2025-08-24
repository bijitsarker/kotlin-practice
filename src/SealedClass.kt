//sealed class Result(val massage:String){
//    class Success(massage: String): Result(massage)
//    class Error(massage: String): Result(massage)
//    fun showMassage(){
//        println("Result: $massage")
//    }
//}
//fun getData(result:Result){
//    when(result){
//        is Result.Error -> println(result.showMassage())
//        is Result.Success -> println(result.massage)
//    }
//}
//fun main(){
//    val success = Result.Success("success")
//    val error = Result.Error("failed")
//    println(getData(success))
//
//}
//--------

//sealed class Shape{
//    class Circle(val radius:Double):Shape(){
//        fun square(power:Int){
//            println("The Power of: ${power * radius}")
//        }
//    }
//    class Rectangle(val length:Double, val wight: Double):Shape()
//    object NoShape: Shape()
//}
//fun area(shape:Shape): String {
//    when (shape) {
//        is Shape.Circle -> return "The Circle value: "+Math.PI * shape.radius + shape.radius
//        is Shape.Rectangle -> return "The Rectangle value: "+Math.PI * shape.length + shape.wight
//        is Shape.NoShape -> return "The NoShape value: "+100.0 * Math.PI
//    }
//}
//fun main(){
//    val value = Shape.Circle(12.25)
//    val value2= Shape.Rectangle(5.0, 10.0)
//    val value3 = Shape.NoShape
//
//    println(area(value))
//    value.square(12)
//    println(area(value2))
//    println(area(value3))
//
//}
//-----------
sealed class Demo{
    class B {
        fun odd() {
            println("The function is odd")
        }
    }
        class A{
            fun even(){
                println("The function is even")
            }
        }
}
fun main(){
    val obj = Demo.B()
    obj.odd()
    val obj2 = Demo.A()
    obj2.even()
}
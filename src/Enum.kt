//enum class Direction(var direction: String, var distance: Int) {
//    NORTH("north", 10),
//    SOUTH("south", 20),
//    EAST("east", 30),
//    WAST("wast", 40);
//
//    fun printData() {
//        println("Direction = $direction\nDistance = $distance")
//    }
//}
//
//fun main() {
//    val direction = Direction.valueOf("east".uppercase())
//    when(direction){
//        Direction.EAST-> {
//            println("The direction is east")
//        }
//        Direction.SOUTH-> println("The direction is south")
//        Direction.NORTH-> println("The direction is north")
//        Direction.WAST-> println("The direction is wast")
//    }
////    println(Direction.NORTH.direction)
////    println(Direction.SOUTH.distance)
////    println(Direction.EAST.direction)
////    println(Direction.WAST.distance)
////
////    Direction.NORTH.printData()
////    Direction.WAST.printData()
////    Direction.SOUTH.printData()
////    Direction.EAST.printData()
//}

//------------
//enum class State{
//  IDLE, RUNNING, ENDING
//}
//
//fun main(){
//
//    val state = State.RUNNING
//   println (when(state){
//        State.IDLE ->  "it is IDLE"
//        State.RUNNING -> "it is RUNNING"
//        State.ENDING -> "it is ENDING"
//    })
//}
//--------
//enum class Day{
//    SATURDAY,
//    SUNDAY,
//    MONDAY,
//    TUESDAY,
//    WEDNESDAY,
//    THURSDAY,
//    FRIDAY
//}
//fun main() {
//    val day = Day.valueOf("monday".uppercase())
//    when (day) {
//        Day.SATURDAY -> println("The day is saturday")
//        Day.SUNDAY -> println("The day is sunday")
//        Day.MONDAY -> println("The day is monday")
//        Day.TUESDAY -> println("The day is tuesday")
//        Day.WEDNESDAY -> println("The day is wednesday")
//        Day.THURSDAY -> println("The day is thursday")
//        Day.FRIDAY -> println("The day is friday")
//
//    }
//}
//-------------
//enum class Color{
//    RED,
//    GREEN,
//    YELLOW,
//    BLACK,
//    PURPLE;
//}
//fun main() {
//    val color = Color.YELLOW
//    when(color){
//        Color.RED-> println("The color is red")
//        Color.YELLOW-> println("The color is yellow")
//        Color.GREEN-> println("The color is green")
//        Color.BLACK-> println("The color is black")
//        Color.PURPLE-> println("The color is purple")
//        else -> println("Nothing")
//    }
//}
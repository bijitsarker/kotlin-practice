//fun main(){
//    val numbers = mutableListOf<Int>(2,4,5,8,10,50,100)
//    numbers.sorted().forEach {println(it)}
//
//    val laptop = mutableListOf(
//        Laptop("Dell",2012, 50000,"16Gb"),
//        Laptop("Acer",2010, 60000,"12Gb"),
//        Laptop("Apple",2008, 70000,"16Gb")
//
//    )
//    println()
//    laptop.sorted().forEach{println(it)}
//    println()
//     laptop.sortedWith(ComparatorRam()).forEach{println(it)}
//    println()
//    laptop.sortedWith(ComparatorYear()).forEach{println(it)}
//    println()
//    laptop.sorted().forEach{println(it)}
//
//}
//data class Laptop(val brand:String, val year: Int, val price: Int,val ram: String): Comparable<Laptop>{
//
//    override fun compareTo(other: Laptop): Int {
//       return  if(this.price > other.price){
//           println("The if statement: ${this.brand} with ${other.brand}")
//           1
//    }
//        else if(this.price < other.price){
//            println("The if statement: ${this.brand} with ${other.brand}")
//           -1
//        }
//        else{
//           0
//       }
//    }
//}
//class ComparatorRam:Comparator<Laptop> {
//    override fun compare(laptop1: Laptop, laptop2: Laptop): Int {
//       return if(laptop1.ram > laptop2.ram){
//           1
//       }
//        else if(laptop1.ram<laptop2.ram){
//            -1
//        }
//        else{
//            0
//       }
//    }
//}
//class ComparatorYear:Comparator<Laptop> {
//    override fun compare(laptop1: Laptop, laptop2: Laptop): Int {
//        return if (laptop1.year > laptop2.year) {
//            1
//        } else if (laptop1.year < laptop2.year) {
//            -1
//        } else {
//            0
//        }
//    }
//}
//class ComparatorPrice: Comparator<Laptop>{
//    override fun compare(laptop1: Laptop, laptop2: Laptop): Int {
//        return if(laptop1.price < laptop2.price){
//            1
//        }
//        else if(laptop1.price > laptop2.price){
//            -1
//        }
//        else{
//            0
//        }
//
//    }
//}
//----------------

//fun main(){
//    val laptop = mutableListOf(
//        Laptop("Dell",30000,2020,8),
//        Laptop("Acer",40000,2021,12),
//        Laptop("Apple",50000,2022,16)
//    )
//    laptop.sortedWith(compareBy{it.brand}).forEach{println(it)}
//    println()
//    laptop.sortedWith(compareBy{it.price}).forEach{println(it)}
//    println()
//    laptop.sortedWith(compareBy{it.year}).forEach{println(it)}
//    println()
//    laptop.sortedBy{it.ram}.forEach{println(it)}
//}
//data class Laptop(var brand: String, var price: Int, var year: Int, var ram: Int)

//-------------
fun main(){
println(searchElement(20, mutableListOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,10)))
}
private fun searchElement(searchElement:Int,numbers: MutableList<Int>){
    var i = 0
    for (number in numbers){
        i++
        println("Searched number: $i")
        if(number==searchElement){

        }
    }
}

//---------------
//fun main(){
//    val color = listOf("Red", "Green", "Yellow")
//    println(color)
//    println(color.size)
//    println(color.count())
//    println(color.first())
//    println(color.last())
//    println(color.contains("Red"))
//    println(color.contains("Pin"))
//}
//---------
//fun main(){
//    val car = mutableSetOf("BMW","Ford","Mazda")
//    car.add("Tesla")
//    car.remove("Mazda")
//    println(car)
//}

//------------
// fun main(args: Array<String>){
//    val element = mutableListOf("Name 1", "Name 2", "Name 3", "Name 4")
//    element.add("Name 5")
//    element[2]
//    element.forEach { (println(it)) }
//    element.remove("Name 1")
//    println(element)
//}
//---------------
//fun main(){
//    val num = mutableListOf(10,12,20,30,40,50)
//    num.add(100)
//    num.remove(50)
//    num[0] = 15 // Update 10 t0 15
//    num[3] = 35 // Update 30 to 35
//    println(num)
//}
//-----------
//fun main(args: Array<String>){
//    val user = User("Name 1")
//    val user2 = User("Name 2")
//    val user3 = User("Name 3")
//    val user4 = User("Name 4")
//    val user5 = User("Name 5")
//    val user6 = User("Bijit")
//val element = mutableSetOf<User>(user,user2,user3,user4,user5,user6)
//element.forEach{println(it.name)}
//}
//class User(val name:String)
//------------
//fun main(){
//    val color = setOf("Red", "Green", "Yellow")
//    println(color)
//    println(color.size)
//    println(color.count())
//    println(color.first())
//    println(color.last())
//    println(color.contains("Red"))
//    println(color.contains("Pin"))
//
//}
//----------
//fun main(args: Array<String>){
//    val users = mapOf(1 to "Maria", 2 to "Alex", 3 to "John")
//    val mutableUser = mutableMapOf(100 to "Red", 200 to "green", 300 to "yellow")
//    println(users[1])
//
//    println(users)
//    println("The MapOf1: ${users.count()}")
//    println("The MapOf2: ${users.contains(1)}")
//    println("The MapOf3: ${users.contains(4)}")
//    println("The MapOf4: ${users.keys}")
//    println("The MapOf5: ${users.entries}")
//    println("The MapOf6: ${users.get(4)}")
//    println("The MapOf6: ${users.getValue(2)}")
//   mutableUser[2]
//}
//--------
//fun main(){
//    val numbers = mutableMapOf("Alex" to 10, "John" to 20, "Sami" to 30)
//    numbers["Alex"] = 12 // UpDete 10 t0 12
//    numbers["Jem"] = 40 // add Jem
//    numbers.remove("Sami") //remove Sami
//    println(numbers)
//}
//-------------
//fun main(args: Array<String>){
//    val array = arrayListOf("A", "B","C")
//    array.add("D")
//    array.forEach{println(it)}
//    println()
//    array.remove("A")
//    array.forEach{println(it)}
//    println(array)
//}
//------------



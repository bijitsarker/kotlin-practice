//List---------------------------------------

//fun main(args : Array<String>){
//    val value = listOf("for", "fun",2,"food","warm", "farm")
//    val color = mutableListOf("Red","Green","Blue","Yellow","Purple")
//
//    //val value = arrayOf(1,2,3,4,5)
//    println("The element of 1: ${value.elementAt(3)}") // warm
//    println("The element of 2: ${value.indexOf(2)}")
//    println("The element of 3: ${value.last()}")
//    println("The element of 4: ${value.first()}")
//    println("The element of 5: ${value.count()}")
//    println("The element of 6: ${value.contains("food")}")
//    println("The element of 7: ${value.contains("Even")}")
//    println("The element of 8: ${value.containsAll(setOf("for", "fun",2,"food","warm", "farm"))}")
//    println("The element of 9: ${value.containsAll(listOf(1,2,3))}")
//    println("The element of 10: $value")
//
//    for (i in value.indices) {
//        println(i)
//    }
//// MutableListOf
//    color.add("Pin")
//    println(color)
//    color.remove("Yellow")
//    println(color)

//}

//Set-------------------------------------
//fun main(args : Array<String>) {
//    val color = setOf("Blue", "Red", 3, "Purple", "green")
//    val car = mutableSetOf("BMW", "Tesla", "Ford", "Mazda")
//
//    println(color)
//    println(car)
//    println("value SetOf 1: ${setOf(1)}")
//    println("value SetOf 2: ${color.first()}")
//    println("value SetOf 3: ${color.last()}")
//    println("value SetOf 4: ${color.count()}")
//    println("value SetOf 5: ${color.indexOf(3)}")
//    println("value SetOf 7: ${color.elementAt(3,)}")
//    println("value SetOf 8: ${color.contains("Green")}")
//    println("value SetOf 9: ${color.contains("Pin")}")
//    println("value SetOf 10: ${color.containsAll(setOf("Blue", "Red", 3, "Purple", "green"))}")
//
//MutableSetOf
//    println("value MutableSetOf 1: ${mutableSetOf("Ford")}")
//    car.add("Blue")
//    println("Add Color: $car")  // add Blue
//    car.remove("Mazda")
//    println("Add Car: $car")  //remove Mazda
//}

//Map-----------------------------------
//fun main(args : Array<String>){
//    val fruit = mapOf("apple" to 100, "Kiwi" to 150, "Orange" to 200,)
//    val color : MutableMap<String, Int> = mutableMapOf()
//    println(fruit)
//    println("The element of 1: $fruit")
//    println("The element of 1: $fruit[2]")
//    println("The element of 1: ${fruit.count()}")
//    println("The element of 1: ${fruit.keys}")
//    println("The element of 1: ${fruit.values}")
//    println("The element of 1: ${fruit.entries}")
////    println("The element of 1: ${fruit.getOrDefault(150, 200)}")
////    println("The element of 1: ${fruit.getValue(150)}")
//    //  println("The element of 1: ${fruit.getOrElse(150,{0})}")
//    println("The element of 1: ${fruit.count()}")
//    println("The element of 1: ${fruit.count()}")
//
//}

// map,filter, find,partition,short, FlatMap,GroupBy, slice,joinToString-------------------------
// map----------------------------
//fun main() {
//    val nameSet = setOf("one", "tow", "three", "four")
//    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15)
//    val colorMap = mapOf("Red" to 1, "Green" to 2, "Yellow" to 3, "White" to 4)
//
//    println("NameSet   1: ${nameSet.map { it.uppercase() }}")
//    println("NumberList2: ${numberList.map { it * 2 }}")
//    println("NameSet   3: ${nameSet.map { it.length }}")
//    println("NumberList4: ${numberList.map { it % 2 != 0 }}") //true or false ==,<>,!=
//    println("NumberList5: ${numberList.map { it * it }}")
//    println("NumberList6: ${numberList.map { it > 17 }}")
//}

// filter---------------------------------
//fun main() {
//
//    val nameSet = setOf("one", "tow", "three", "four")
//    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15)
//    val colorMap = mapOf("Red" to 1, "Green" to 2, "Yellow" to 3, "White" to 4)
//
//    println("NumberList1: ${numberList.filter { it % 2 == 0 }}")
//    println("NumberList2: ${numberList.filter { it % 2 != 0 }}")
//    println("NumberList3: ${numberList.filter { it > 10 }}")
//    println("NumberList4: ${numberList.filter { it * 2 == 0 }}")
//    println("NameSet   5: ${nameSet.filter { it.length > 3 }}")
//    println("NameSet   6: ${nameSet.filterNot { it.length <= 3 }}")
//    println("NameSet   7: ${nameSet.filterIndexed { index: Int, value: String -> (index != 0) && (value.length < 5) }}")
//    println("ColorMap  8: ${colorMap.filter { it.key.endsWith("1") && it.value > 100 }}")
//}

// find--------------------------------
//fun main() {
//
//    val nameSet = setOf("one", "tow", "three", "four")
//    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15)
//    println("NumberList1: ${numberList.find{it * 2 == 0}}")
//
//}

// partition ---------------------------------
//fun main(){
//    val count = listOf(1,2,3,4,5,6,7,8,9,10,11,12)
//    val(even,odd) = count.partition { it % 2 == 0 }
//    println("Even: $even, Odd: $odd")
//    println()
//    val(large,small) = count.partition{it >= 5}
//    println("Large: $large, Small: $small")
//}

//fun main(){
//    val alphabet:Set<Char> = mutableSetOf('A','B','C','D','E','F','G','H','i','j','k','l','m','n','o','p')
//
//    val(smallLetter,bigLetter) = alphabet.partition{it>'i'}
//    println("SmallLetter: $smallLetter")
//    println("bigLetter: $bigLetter")
//}



//groupBy-----------------------------------
//fun main(){
//    val fruits:List<String> = listOf("apple", "banana", "avocado", "blueberry", "orange")
//
//    println(fruits.groupBy{it.length})
//    println(fruits.groupBy{it.last()})
//    println(fruits.groupBy{it.first()})
//    println(fruits.groupBy{it.first().uppercase()})
//    println(fruits.groupBy({it.first().uppercase()},  {it.uppercase()}))
//    println(fruits.groupBy({it.last().uppercase()},{it.uppercase()}))
//    println(fruits.groupBy({it.last()},{it.uppercase()}))
//
//}
//short---------------------------------------
//FlatMap--------------------------------------

//joinToString----------------------------------------
//fun main(){
//    val numberString = listOf("one", "two", "three", "four")
////    println(numberString)
//    println(numberString.joinToString())
//    val listString = StringBuffer("The list of numbers ")
//    println(numberString.joinTo(listString))
//    println(numberString.joinToString  (separator = " | ", prefix = " star ", postfix = " end ") )
//
//    val numbers:List<Int> = (1..50).toList()
//    println(numbers.joinToString( limit = 40, truncated = "<..>"))
//    println(numberString.joinToString{"Element ${it.uppercase()}"})
//}

// +,- ----------------------------------------
//fun main(){
//    val word: List<String> = mutableListOf("apple", "banana", "avocado", "blueberry")
//    val plusWord = word + "orange"
//    val minusWord = word - mutableListOf("apple","avocado")
//    println(plusWord)
//    println(minusWord)
//    println(word)
//}

//fun main(){
//    val count = mutableSetOf(5,10,20,30,40,50)
//    val plus = count + 60 + 70 + 80 + 90 + 100
//    val minus = count - mutableSetOf(40, 50)
//    println("$count\n$plus\n$minus")
//}

//slice------------------------------------
//fun main(){
//    val numbers:List<String> = listOf("one","two","three","four", "five","six", "seven","eight")
//    println(numbers.slice(1..4))
//    println(numbers.slice(1..7 step 2))
//    println(numbers.slice(setOf(3,5,0)))
//    println()
//    println(numbers.take(4))
//    println(numbers.takeLast(3))
//    println(numbers.drop(3))
//    println(numbers.dropLast(5))
//    println()
//    println(numbers.takeWhile{!it.startsWith("i")})
//    println(numbers.dropWhile{it.length <= 3})
//    println(numbers.takeLastWhile {it != "four"})
//    println(numbers.dropLastWhile{it.contains("t")})
//    println()
//    println(numbers.windowed(3))
//    println(numbers.windowed(2))
//    println()
//    val number = (0..4).toList()
//    println(println(number.chunked(2)))
//    println(println(number.chunked(4)))
//}

//---------------------------
//fun main(){
//    val count = listOf(10,12,13,14,15,16,20,30)
//
//    println("The sum is: ${count.sum()}")
//    println("The sum is: ${count.sumOf{it * 2}}")
//    println("The first num: ${count.first()}")
//    println("The last num: ${count.last()}")
//    println("The element ia: ${count.elementAt(3) }")
//    println("The count num: ${count.count()}")
//    println("The index num: ${count.indexOf(5)}")
//    println("The average num: ${count.average()}")
//    println("The max value is: ${count.maxOrNull()}")
//    println("The min value is: ${count.minOrNull()}")
//}


//any, all, none---------------------------------------
//fun main(){
//    val numbers = listOf("one", "two","three","four")
//    println(numbers.any{it.endsWith("a")})
//    println(numbers.none{it.endsWith("a")})
//    println(numbers.all{it.length > 1})
//}

//---------
//fun main(){
//    val mixed = listOf(1,2,3,'A', 'B','C',"Hello world","first","Them")
//    //mixed.filterIsInstance<Int>().forEach{ println(it)}// 1 2 3
//    mixed.filterIsInstance<Char>().forEach{println(it)} // A B C
//   // mixed.filterIsInstance<String>().forEach{println(it)} //Hello world  first  Them
//
//}


//class Box<T>(val value: T)
//fun main(){
//    val intBox = Box<Int>(10)
//    val stringBox = Box<String>("Alex")
//    val doubleBox = Box<Double>(3.1416)
//    println(intBox.value) //int value
//    println(stringBox.value) // string value
//    println(doubleBox.value) // double value
//}

//----------
//fun <T>printItem(item:T){
//   println(item)
//}
//fun main(){
//    printItem(20) // int
//    printItem("Pasta") // string
//    printItem(40.56) // double
//}

//-------
//fun <T:Number> sum(a: T, b: T): Double{
//    return a.toDouble() + b.toDouble()
//}
//fun main (){
//   println("The sun of Int: "+sum(20,10)) // int
//    println("The sum of Double: "+sum(4.5,3.5)) // double
//}

//----------
//class PariBox<A, B>(val first: A, val last: B)
//      fun <T>item(value:T){
//          println(value)
//      }
//fun main(){
//  val box1 = PariBox("Alex",20)
//  val box2 = PariBox(3.1416, true)
//    println(box1.first)
//    println(box1.last)
//    println(box2.first)
//    println(box2.last)
//    println()
//   item("Burger")
//   item(2000)
//   item(30.40)
//   item(true)
//    }

//--------
//class Company<T>(val name:T){
//    //var companyName = name
//    fun late():T{
//        return name
//    }
//}
//fun main(){
//    val c1 = Company("Alex")
//    val c2 = Company(123)
//    println(c1.late())
//    println(c2.late())

//--------
//interface Producer <out T>{                      // generics out
//    fun producer(): T
//}
//
//class StringProducer: Producer<String> {
//    override fun producer():String = "Hello world"
//
//    }
//fun main(){
//    val pro = StringProducer()
//    println(pro.producer())
//}

//---------
//interface Repository<T>{
//    fun save(item:T)
//    fun getAll(): List<T>
//
//}
//class UserRepository:Repository<String>{
//    private val user = mutableListOf<String>()
//    override fun save(item:String){
//        user.add(item)
//    }
//
//    override fun getAll():List<String> = user
//}
//fun main(){
//    val repo = UserRepository()
//    repo.save("Alex")
//    repo.save("Sakib")
//    pri

//--------
//interface Consumer< in T>{         // generics in
//    fun consumer(a: T):Int
//    fun consumer2(b: T):Int
//
//}
//class IntConsumer: Consumer<Int>{
//    override fun consumer(a:Int): Int{
//        return a * 20
//    }
//    override fun consumer2(b:Int):Int{
//        return b + 10
//    }
//}
//fun main(){
//    val cons = IntConsumer()
//    println("The value of a: ${ cons.consumer(10) }")
//    println("The value of b: ${ cons.consumer2(5) }")
//}

//------
//interface Consumer<in T>{  // in
//    fun consumer(item: T)
//}
//class StringConsumer: Consumer<String>{
//    override fun consumer(item: String) {
//        println("Consume: $item")
//    }
//}
//fun main(){
//    val cons:Consumer<String> = StringConsumer()
//    cons.consumer("Pasta")
//    //val cons2:Consumer<Any> = StringConsumer()
//    val cons2:Consumer<String> = StringConsumer()
//    cons2.consumer("Burger")
//}


//fun main(){
//    val football = FootballPlayer("Football Player 1",)
//    val footballPlayer2 = FootballPlayer("Football Player 2")
//    val baseball = BaseBallPlayer("Baseball Player 1")
//    val baseballPlayer2 = BaseBallPlayer("Baseball Player 2")
//
//    val footballTeam:Team<FootballPlayer> = Team("Football team", mutableListOf(football))
//    footballTeam.addPlayer(footballPlayer2)
//    val baseballTeam:Team<BaseBallPlayer> = Team("Baseball team", mutableListOf(baseball))
//    baseballTeam.addPlayer(baseballPlayer2)
//
//}
//class Team<T>(val name: String, val players:MutableList<T>){
//    fun addPlayer(player: T){
//        if(players.contains(player)){
//            println("Player: ${(player as Player).name} is already in the team ${this.name} ")
//        }
//        else{
//            println("Player: ${(player as Player).name} was added in the team ${this.name} ")
//
//        }
//    }
//}
//open class Player(val name: String)
//class FootballPlayer( name: String): Player(name)
//class BaseBallPlayer(name: String):Player(name)

//--------
//class Box<T>(val item: T)   // invariant
//
//fun main(){
//    val box = Box("Name")
//    val box1:Box<String> = Box("Alex")
//    val box2 = Box(20)
//    val box3:Box<Double> = Box(3.1416)
//    println(box.item)
//    println(box1.item)
//    println(box2.item)
//    println(box3.item)
//}

//------
//@Suppress("UNCHECKED_CAST")
//fun main(){
//    val data: Any = 10
//    val value:String = data as String // error
//    println(value)
//}

//-----------
interface Producer<out T>{
    fun producer():T                // out
}

interface Consumer<in T>{
    fun consumer(item:T)          // in
}

class StringProducer:Producer<String>{
    override fun producer(): String = "Hello kotlin"
}

class StringConsumer:Consumer<String>{
    override fun consumer(item: String) = println(item)
}

fun main() {
    val pro:Producer<String> = StringProducer()
    val con:Consumer<String> = StringConsumer()
    println(pro.producer())
    con.consumer("Dobbin")
}


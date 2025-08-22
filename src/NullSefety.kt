//fun main(args: Array<String>){
//  val text:String? = null
//   // text = null
//  if(text != null) println("The length of: ${text.length}")
//    else println("The variable is null")
//}
//------------------------
//fun main(args: Array<String>){
//    val name:String? = null
//    val name2:String = name?: "The name is $name"
//    println(name2)
//}

//-----------------
//fun main(){
////    val a:String? = null /// no output
////    println(a!!.length)
//    val game:String? = "football"
//    println(game!!.length)
//    println(game!!)
//
//}
//-----------------------

//fun main(){
//    val game:String? = null
//    val game2:String = game?: "football"
//    println(game2)
//}
//-------------------
//fun main(){
//    val name:String? = "Alex"
//    val name2:String = name?: "sami"
//    println(name2?.toString())
//    println(name?.uppercase())
//    println(name!!.lowercase())
//    println(name?.trimStart())
//}
//------------------
//fun main(){
//    val count:Int? = null
//    println(count?:1)
//}
//--------------------
//fun main(){
//    val obj:Any? = "Hello kotlin"
//    val str:String? = obj as? String
//    val csr:Int? = obj as? Int
//    println(str)
//    println(csr)
//}
//-------------------
//fun main(){
//    val animal:String? = "Tiger"
//    animal?.let{
//      println("The Animal is: $it")
//    }
//}
//------------------
//fun main(){
//    val user:String? = null
//    val result:String? = user ?: run{
//        "user length"
//    }?: "user not found"
//    println(result)
//}
//-------------------
//fun main(args: Array<String>){
//    val str:List<String?> = listOf("Alex", null, "Kotlin", null)
//    println(str.filterNotNull()) // output [Alex, Kotlin]
//}
//----------------------------------------------------

//fun main(){
//    val set:String? = "code"
//    set?.let{
//        println("The set of: ${it?.length}")
//    }
//}
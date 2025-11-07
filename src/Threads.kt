import kotlin.concurrent.thread
//
//fun main(){
//    val thread1 = thread {
//        for (i in 1..5){
//            println("Thread 1 = $i")
//            Thread.sleep(500)
//        }
//    }
//    val thread2 = thread{
//        for(i in 1..5){
//            println("Thread 2 = $1")
//            Thread.sleep(500)
//        }
//    }
//    thread1.start()
//    thread2.start()
//}
//-----
//class MyTask:Runnable{
//    override fun run(){
//        for (i in 1..5){
//            println("MyTask running: $i")
//            Thread.sleep(400)
//        }
//    }
//}
//
//fun main(){
//    val task = MyTask()
//    val take = Thread(task)
//    take.start()
//}
//-------
//class Number: Thread(){
//    fun num(){
//        for(i in 1..8){
//            println("Number = $i")
//            Thread.sleep(1000)
//        }
//    }
//}
//
//fun main() {
//    val number = Number()
//   number.start()
//
//}

//------
//fun main(){
//    println("Loading......")
//    Thread.sleep(5000)
//    println("Hello kotlin")
//}

//--------
//fun main(){
//    Thread.sleep(300)
//    println("Hello kotlin 1")
//    Thread.sleep(400)
//    println("Hello kotlin 1")
//    Thread.sleep(500)
//    println("Hello kotlin 2")
//    Thread.sleep(600)
//    println("Hello kotlin 3")
//    Thread.sleep(700)
//    println("Hello kotlin 4")
//    Thread.sleep(800)
//    println("Hello kotlin 5")
//    Thread.sleep(900)
//    println("Hello kotlin 6")
//    Thread.sleep(1000)
//    println("Hello kotlin 7")
//    Thread.sleep(1100)
//    println("Hello kotlin 8")
//    Thread.sleep(1200)
//    println("Hello kotlin 9")
//    Thread.sleep(1300)
//    println("Hello kotlin 10")
//    Thread.sleep(1400)
//    println("Hello kotlin 11")
//    Thread.sleep(1500)
//}

fun main() {
    val a = 0
    for (i in 1..100){
        Thread.sleep(100)
        println("${i + a}. Hello kotlin!")
    }
}
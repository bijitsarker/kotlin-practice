//import kotlinx.coroutines.CoroutineScope
//import kotlinx.coroutines.Dispatchers
//import kotlinx.coroutines.launch
//import kotlinx.coroutines.delay
//import kotlin.concurrent.thread
//
//fun main() {
//    println("Main program start: ${Thread.currentThread().name}")
//    CoroutineScope(Dispatchers.Default).launch{
//        println("Fake work start: ${Thread.currentThread().name}")
//        delay(2000)
//        println("Fake work end: ${Thread.currentThread().name}")
//    }
//    Thread.sleep(2000)
//    println("Main program ends: ${Thread.currentThread().name}")
//}


import kotlinx.coroutines.*
fun main() = runBlocking {
    println("Main program start: ${Thread.currentThread().name}")
    launch(Dispatchers.Default){
        println("Fake work start: ${Thread.currentThread().name}")
        delay(2000)
        println("Fake work end: ${Thread.currentThread().name}")
    }

    println("Main work end: ${Thread.currentThread().name}")
}
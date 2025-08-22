interface Vehicle{
    fun strat()
    fun stop()
}
class Vehicle1: Vehicle{
    override fun strat(){
    println("Strat The car")
}
    override fun stop() {
        println("Stop The car")
    }
}
fun main(){
    val v1 = Vehicle1()
    v1.strat()
    v1.stop( )
}
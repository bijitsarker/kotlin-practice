//class Car {
//    var name = ""
//    var model = ""
//    var color = ""
//    var doors = 0
//
//    fun move(a:Int){
//        println("The car is moving $a meter")
//    }
//    fun drive(b:Int){
//        println("The car is drive $b Km")
//    }
//}
//fun main(){
//    val car = Car()
//    car.name = "Tesla"
//    car.model = "MP40"
//    car.color = "Red"
//    car.doors = 4
//
//    println("Car Name: ${car.name}")
//    println("Car Model: ${car.model}")
//    println("Car Color: ${car.color}")
//    println("Car Door: ${car.doors}")
//
//    car.move(2)
//    car.drive(4)
//    println("object car0---------------------")
//    val car0 = Car()
//
//    println("Car Name: ${car0.name}")
//    println("Car Model: ${car0.model}")
//    println("Car Color: ${car0.color}")
//    println("Car Door: ${car0.doors}")
//
//    car0.move(3)
//    car0.drive(5)
//
//}
//------------------------------
//fun main(){
//    val user1 = User("Alex", "Randa", 20)
//}
//class User(name:String, var lastname:String, var age:Int){ //error
//    var name
//    init {
//        if(name.lowercase().startsWith("a"){
//              this.name = name
//            }
//            else{
//                this.name = User
//        }
//
//    }
//}
//----------
fun main(){
    val account = Account("Alex")
    account.deposit(100)
    account.withdraw(200)
    account.deposit(-200)
    account.withdraw(-400)

}
class Account(val accountName: String){
    var balance = 0
    var transactions = mutableListOf<Int>()

    fun deposit(amount: Int){
        if(amount>0){
            transactions.add(amount)
            balance += amount
            println("$amount deposit. balance is now ${this.balance}")
        }
        else{
            println("can not deposit negative sum")
        }

    }
    fun withdraw(withdrawal: Int){
        if(withdrawal>0){
            transactions.add(withdrawal)
           this.balance += withdrawal
            println("$withdrawal deposit. balance is now ${this.balance}")
        }
        else{
            println("can not deposit negative sum")
        }
    }
    fun calculateBalance(value: Int) {
        if (value > 0) {
            println("positive value")
        } else {
            println("negative number")
        }

    }
}


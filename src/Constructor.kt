// Primary constructor---------------------------------------------
//class Student(val name:String, val age:Int, val roll:Int){
//    fun student() {
//        println("Student Name: $name")
//        println("Student Age: $age")
//        println("Student Roll: $roll")
//    }
//    fun student1(name1:String, age1:Int){
//        println("Student1 Name: $name1")
//        println("Student1 Age: $age1")
//    }
//    fun student2(name2:String, age2:Int){
//        println("Student2 Name: $name2 ")
//        println("Student2 Age: $age2")
//    }
//}
//fun main(){
//    val st = Student("Alex", 20,12)
//    println("Student Name: ${st.name}")
//    println("Student Age: ${st.age}")
//    println("Student Roll: ${st.roll}\n")
//    st.student()
//    st.student1("sami",19)
//    st.student2("mark",18)
//}
//------------
//class Add(val a:Int, val b:Int){
//    val c = a*b
//}
//fun main(){
//    val add = Add(20,30)
//    println("The sun of two number c = ${add.c}")
//}

//Secondary constructor---------------------------------------------
//class Animal{
//    var name:String
//    var count:Int
//
//    constructor(name:String, count:Int){
//        this.name = name
//        this.count = count
//    }
//}
//fun main(){
//    val A1 = Animal("Tiger", 20)
//    println("Animal Name: ${A1.name}")
//    println("Animal count: ${A1.count}")
//}
//----------
//class Sum{
//    var area: Int = 0
//    constructor(a:Int, b:Int){
//        area = a * b
//
//        println("The sum of $a + $b = $area")
//    }
//}
//fun main(){
//    val  s1 = Sum(20,30)
//}
//-------------
//class Employee{
//    constructor(id:Int, name:String, salary:Int){
//        println("Employee Id: $id, Employee Name: $name, Employee Salary: $salary")
//    }
//    constructor(id:Int, name:String){
//        println("Employee Id: $id, Employee Name: $name")
//    }
//}
//fun main() {
//    val emp = Employee(20149, "Alex",500000)
//    val emp0 = Employee(4298, "sami")
//}
//--------------
//class User{
//    val email: String
//    var password: Int
//    constructor(email:String, password:Int){
//        this.email = email
//        this.password = password
//    }
//    constructor(email:String) {
//        this.email = email
//        this.password = 0
//    }
//}
//fun main(){
//    val u1 = User("Alex@gmail.com",14253846)
//    val u2 = User("sami@gmail.com",2345)
//    println("User1 Email or Password : ${u1.email}, ${u1.password}")
//    println("User2 Email or Password :${u2.email}, ${u2.password}")
//}
//------------
//class Person{
//    var name:String = ""
//    var salary:Int = 0
//    constructor(x:String, y:Int){
//        name = x
//        salary = y
//    }
//}
//fun main() {
//    val p1 = Person("bird fly in sky", 5000000)
//    println(p1.name)
//    println(p1.salary)
//}
//------------
//class User(var name:String, var lastName:String, var age:Int){
//    constructor(name:String): this(name, "lastName", 0){
//        println("2nd")
//    }
//    constructor(name:String, lastName:String): this(name, lastName,0){
//        println("3rd")
//    }
//}
//fun main(){
//    val user = User("Alex",)
//    val friend = User("sami", "sima")
//    println(user.name)
//    println(user.lastName)
//    println(user.age)
//    println("\n")
//    println(friend.name)
//    println(friend.lastName)
//    println(friend.age)
//}
//-----------

//class Sum{
//    constructor(a:Int, b:Int, c:Int){
//        println("The sun of $a + $b +$c = ${a + b + c}")
//    }
//    constructor(a:Int, b:Int): this(a, b, 7){
//        println("The sum of $a + $b = ${a + b}")
//    }
//}
//fun main(){
//    val s1 = Sum(5,6)
//}
//open class Animal{                 // inheritance
//    constructor(name:String, count:Int){
//        println("Animal Name: $name")
//        println("Animal count: $count")
//    }
//}
//class Person:Animal{
// constructor(name:String, count:Int,name2:String):super(name,count){
//     println("Animal2 Name: $name2")
// }
//}
//fun main(){
//    val animal = Person("Tiger",30,"Lion")
//}

//Init block constructor---------------------------------------------
//class Student(val name:String, val age:Int) {
//    init {
//         println("Name: $name, Age: $age")
//    }
//}
//fun main(){
//    val s1 = Student("Alex", 20)
//}
//-----------------
class MySum(val a:Int, val b:Int, val c:Int){
    constructor (a:Int, b:Int): this(a, b, 10){
        println("Sum $a + $b = ${a + b}")
    }
    constructor(a:Int):this(a,12,8){
        println("Sum $a + $b + $c = ${a + b + c}")
    }
}
fun main(){
    val m1 = MySum(20,10)
    val n1 = MySum(2)
}
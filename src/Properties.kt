//class Rectangle(val width: Int, val height: Int) {
//
//    val area: Int
//        get() = width * height
//
//    var name: String = "Rect"
//        set(value) {
//            field = value.uppercase()
//        }
//}
//
//fun main() {
//    val rect = Rectangle(10, 5)
//
//    println("Area: ${rect.area}")
//
//    rect.name = "box"
//    println(rect.name)
//}
//---------------
//class User(val name:String, val salary:Int) {
//    var Name: String = ""
//        get() = field
//        set(value){
//            field = value
//        }
//}
//fun main(){
//    val user = User("Alex",5000000)
//    println(user.Name)
//}
//-----------
//class Person{
//    var name: String = ""
//        get() = field
//        set(value){
//            field = value
//        }
//}
//fun main(){
//    val p1 = Person()
//    p1.name = "Alex"
//    println(p1.name)
//}
//-------------
//class Animal(var name:String, var count:Int){
//    var name2: String = ""
//        get() = field
//        set(value) {
//            field = value
//        }
//}
//fun main(){
//    val a1 = Animal("lion",20)
//    a1.name2 = "Tiger"
//    println(a1.name)
//    println(a1.count)
//    println(a1.name2)
//}
//------------------
//class Sum(val a:Int, val b:Int){
//    val area: Int
//        get() = a * b
//}
//fun main(){
//    val s1 = Sum(5,10)
//    println(s1.area)
//}
//-----------------
//class Student(val firstName:String, val lastName:String){
//    val fullName: String
//        get() = "$firstName $lastName"
//}
//fun main(){
//    val s1 = Student("Bijit", "Sarker")
//    println("Student FullName: ${s1.fullName}")
//}
//--------------
//class Person{
//    var email:String = ""
//        get() = field.uppercase()
//        set(value){
//            field = value.trim()
//        }
//    var password:Int = 0
//        get() = field
//        set(value){
//            if(value>8) field = value
//            else println("To short password")
//        }
//    var age: Int = 0
//        get () = field
//        set(value){
//            if(value>18) field = value
//            else println("You are child")
//        }
//}
//fun main(){
//    val p1 = Person()
//    p1.email = "alex@gmail.com"
//    p1.password = 15379
//    p1.age = 15
//    println("User Email: ${p1.email}")
//    println("User Password: ${p1.password}")
//    println("User Age: ${p1.age}")
//}
//----------------
//import kotlin .properties.ReadWriteProperty
//import kotlin.reflect.kProperty
//fun main(){
//    val user = User()
//
//
//}
//class User{
//    var firstName by FormatDelegate()
//    var lastName by FormatDelegate()
//}
//class Formate: ReadWriteProperty<Any?, String>{
//    private var formatedString: String
//    override fun getValue(
//        thisRef:Any?
//        property = kProperty<*>):String{
//        return formatedString
//    }
//    override fun setValue(
//        thisRef:Any?
//        property = kProperty<*>
//        value:String
//    ){
//        formatedString = value.lowercase()
//    }
//}

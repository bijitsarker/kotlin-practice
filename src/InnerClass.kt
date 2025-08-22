//class Engin{
//    class Space{
//        fun showSpace(a:Int, b:Double){
//            println("$a engin, $b space")
//        }
//    }
//}
//fun main(){
//    val s1 = Engin.Space().showSpace(130, 9.8)
//    //s1.showSpace(120,9.8)
//}
//------------
fun main(){
    val listView = ListView(arrayOf("Name 1","Name 2","Name 3","Name 4"))
    listView.ListViewItem().displayItem(3)
}
class ListView(val item: Array<String>){
    inner class ListViewItem(){
        fun displayItem(position: Int){
            println(item[position])
        }
    }
}
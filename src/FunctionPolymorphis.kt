

// function polymorphism means all function name are same as well as parameter should be same
// but one thing is different that is datatype


fun showInfo(cardId:Int)
{

    println("cardId: $cardId")

}
 fun showInfo(name:String)
 {

     println("name: $name")

 }



fun main(){

    println(showInfo(145662))
    println(showInfo("Mamata"))

}
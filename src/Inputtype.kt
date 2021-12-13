


fun main(){

    println("Enter the name")
    val name:String= readLine()!!.toString()   // !! this sign basically use for it should be not null
    println("Enter the age")
    val age:Int= readLine()!!.toInt()
    println("Enter the GPA")
    val GPA:Float= readLine()!!.toFloat()

    println("---Personal information---")
    println("name is: $name")
    println("age is: $age")
    println("grade is: $GPA")

}
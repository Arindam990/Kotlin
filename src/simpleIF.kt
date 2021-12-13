


fun main(){

    println("Enter the age")
    val age:Int=readLine()!!.toInt()
    if(age>18)
    {
        println("adult")
    }
    if(age<=18)
    {
        println("teenager")
    }
}
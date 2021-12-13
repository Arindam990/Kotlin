import java.util.*

fun main(){
     println("Enter date of birth")
     val DOB:Int= readLine()!!.toInt()
     val yearInDevice: Int=Calendar.getInstance().get(Calendar.YEAR)
    val age: Int=yearInDevice-DOB
    println("You are $age years old")
 }
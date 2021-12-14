fun addNumber(x: Int, y: Int): Int {
    val temp = x + y
    return temp

}

fun subNumber(x: Double, y: Double): Double {
    var temp = x - y
    return temp

}

fun mulNumber(x: Double, y: Double): Double {
    var temp = x * y
    return temp


}

// when we declare the multiple value in same datatype this type we will create this type of function


fun displayInfo(vararg name: String) {
    for (name in name) {
        println(name)
    }

}
    // this is different type of function but result is same


fun jerseyNumber(number: Array<Any>) {
  for (number in number)
  {
      println(number)
  }
}


fun main() {

    println("call the addNumber function and print result")
    var add = addNumber(45, 50)
    println(add)
    println("call the subNumber function and print result")
    var sub = subNumber(80.05, 40.0)
    println(sub)
    println("Call the mulNumber function and print result")
    var mul = mulNumber(40.25, 8.75)
    println(mul)


    // call the displayInfo function with adding some values.

    displayInfo(name = arrayOf("Messi", "Ronaldo", "Rahul", "sachin"))

    jerseyNumber(number = arrayOf(10,7,"don't know",10))

}
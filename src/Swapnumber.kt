


fun main(){

    println("Enter the first number")
    var num1:Int= readLine()!!.toInt()
    println("Enter the second number")
    var num2:Int= readLine()!!.toInt()


    var temp=0;
    temp=num1
    num1=num2;
    num2 = temp
    println(num1)
    println(num2)


}
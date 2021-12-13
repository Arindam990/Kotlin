



fun main() {

    println("Entering  the main for loop ")

    for (i in 1..10)
    {
        println("Enter the name")
        var name= readLine()!!.toString()
        println("Enter the age")
        var age = readLine()!!.toInt()
        println("Entering nestedloop ")
        while (age>0 )
        {
            if (age>18 && age<30) {
                println("allow to the admission ")
            }
            else
                println("not allow for the admission")
            age-=2
        }

    }



}
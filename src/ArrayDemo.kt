



fun main()
{
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    if ("Volvo" in cars) {
        println("It exists!")
    } else {
        println("It does not exist.")
    }
    println(cars.size)                                  // size mainly use how many index present in array
    val car = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    car[0] = "Opel"                  // replace a element
    println(car[0])



}




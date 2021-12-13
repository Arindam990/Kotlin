import java.util.*

fun main() {
    println("Pets app")
      print("Enter number of pets")
    val maxSize = readLine()!!.toInt()
    // write app in array
    var listOfPets = LinkedList<String>()
    do {
        println("Enter the pet name or exit to quit:")
        val petName = readLine()!!.toString()
        if (petName != "quit") {
            listOfPets.add(petName)
        }
    }while (petName!="quit")



    println("Your pets are using Index")
    for (i in 0 until listOfPets.size) {
        println("pet $i :   ${listOfPets[i]}")
    }
    println("Your pets are using object")
    for (pet in listOfPets) {
        println("pet: $pet")
    }
}

package com.car.maintain


class car(var typeofcar:String,var model:Int,var price:Double,var milesDrive:Int,var Owner:String){
    init {
        println("object class is created")
    }

    // we create a one more function under the car class and call the function inside the main function


    fun getcarPrice():Double{

        return price-(milesDrive*10)
    }


}


fun main(){

    //car is just a name after that calling a class car()

    var car=car("BMW",1458,450000.0,450,"Dip")
     println(car.model)
    println(car.price)
    println(car.getcarPrice())
    var car1=car("KIA",7558,850000.0,800,"Arindam")
    var ca2=car("MARUTI",4585,300000.0,0,"Rohit")
    println(car1.price)
    println(ca2.typeofcar)
    println(ca2.getcarPrice())
    println(car1.getcarPrice())
    println(car1.Owner)


    // is another way using arraylist

    var listOfcar= arrayListOf<car>()
    listOfcar.add(car("BMW",1458,450000.0,450,"Dip"))
    listOfcar.add(car("KIA",7558,850000.0,800,"Arindam"))
    for (car in listOfcar)
    {
        println(car.Owner)
        println(car.model)
        println(car.model)

    }






}
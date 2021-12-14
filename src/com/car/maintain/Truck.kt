package com.car.maintain

class Truck:CarOption {

var subType:String?=null
    constructor(typ: String, model: Int, price: Double, milesDrive: Int, Owner: String,subType:String) :

    super(typ,model,price,milesDrive,Owner)


    {

this.subType=subType

    }

    constructor(typ: String, model: Int, price: Double, milesDrive: Int) :
    super(typ,model,price,milesDrive)

    {
     this.subType=subType

    }
}
fun main() {

    //car is just a name after that calling a class car()

    var truck = Truck("BMW", 1458, 450000.0, 450, "Dip","TATA")
    println(truck.subType)
    println(truck.price)
    println(truck.getcarPrice())
    var truck1 = Truck("KIA", 7558, 850000.0, 800, "Arindam","AsokLeland")
    var truck2 = Truck("MARUTI", 4585, 300000.0, 0, "Rohit","volvo")
    println(truck1.price)
    println(truck2.type)
    println(truck1.subType)
    println(truck2.getcarPrice())
    println(truck1.getcarPrice())
}

package com.car.maintain

open class CarOption () {
    var type:String?=null
    var model:Int?=null
    var price:Double?=null
    var milesDrive:Int?=null
    var Owner:String?=null

    constructor( type:String,model:Int,price:Double,milesDrive:Int,Owner:String):this()
    {
        this.type = type
        this.model = model
        this.price = price
        this.milesDrive = milesDrive
        this.Owner = Owner



    }

    constructor(type:String,model:Int,price:Double,milesDrive:Int ):this()
    {
        this.type = type
        this.model = model
        this.price = price
        this.milesDrive = milesDrive


    }


    // init block created because constructor does not have a body sometime we need to write some logic inside the constructor that's why
    init {
        println("object class is created")
    }

    // we create a one more function under the car class and call the function inside the main function


    fun getcarPrice():Double{

        return this.price!!-(this.milesDrive!!.toDouble()*10)
    }


}


fun main() {

    //car is just a name after that calling a class car()

    var car = CarOption("BMW", 1458, 450000.0, 450, "Dip")
    println(car.model)
    println(car.price)
    println(car.getcarPrice())
    var car1 = CarOption("KIA", 7558, 850000.0, 800, "Arindam")
    var ca2 = CarOption("MARUTI", 4585, 300000.0, 0, "Rohit")
    println(car1.price)
    println(ca2.type)
    println(ca2.getcarPrice())
    println(car1.getcarPrice())
}




/*
    mutable= you can update, add something
    im-mutable= you can not be update and cannot be add during process

 */

fun main (){

    // 1- list
    // im-mutable

    var list= listOf<String>("Sachin","Rohit")
    // list[0]="Dip"   it can't be updated

    for (name in list){
        println(name)
    }

    // mutable
    var listm= mutableListOf<String>("Dip","rahul")
    listm[0]="RAm"
    for (name in listm)
    {
        println(name)
    }


    // map

    val listMap= mapOf(1 to "Messi",2 to "Ronaldo")
    for (name in listMap)
    {
        println(name)
    }

    // for mutable
    val listMap1= mutableListOf(1258 to "kaka",2443 to "Robinho")
    for (name in listMap1)
    {
        println(name)
    }


}



// function overloading means all function name are same but different parameter like it can be different in number of parameter
// it can be different in sequence of parameter.

fun add(number1:Int,number2: Int):Int{

    return(number1+number2)
}


fun add(number1:Int,number2: Int,number3: Int):Int{

    return(number1+number2+number3)
}


fun add(number1:Int,number2: Int,number3: Int,number4: Int):Int{

    return(number1+number2+number3+number4)
}

fun add(number1:Int,number2: Int,number3: Int,number4: Int,number5: Int):Int{

    return(number1+number2+number3+number4+number5)
}


fun main(){

    println(add(10,20))
    println(add(10,20,30))
    println(add(10,20,30,40))
    println(add(10,20,30,40,50))

}
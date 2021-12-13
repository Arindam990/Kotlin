



fun main()
{
    println("Continue Statement")
    for(i in 0..100 step 5){

        if (i==50) {
            continue
        }
    println(i)
    }

     println("Break Statement")
    for (i in 1..30)
    {
        if(i==25)
        {
            break
        }
        println(i)

    }
}



 fun main (){
     var listOfuser =HashMap<Int,String>()
     listOfuser[100]="Arindam"
     listOfuser[200]="Deep"
     listOfuser[300]="Pramanik"
     listOfuser [100]="RAM"     // whenever id is same Arindam is replaced by RAM
     for (i in listOfuser.keys)
     {
         println("$i: ${listOfuser[i]}")
     }



 }
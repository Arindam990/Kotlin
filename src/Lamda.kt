


  fun main(){

     var list=(1..50).toList()
     println(list)
     list=list.filter { it % 2 == 0 }
     println(list)
     list=list.filter { it % 5==0 }
     println(list)
 }




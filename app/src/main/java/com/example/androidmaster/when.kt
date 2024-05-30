package com.example.androidmaster

fun main(){
    getTrimestrer(19)
}



fun result (value: Any) {
     when (value) {
         is Int -> value + value
         is String -> println   (value)
         is Boolean -> if (value) print ("holiwi")
     }

}


fun getTrimestrer (month: Int) = when (month){

            in 1 .. 6 -> "primer trimestre"

            in 7 .. 12 -> "segundo trimestre"

            !in 1 .. 12 -> "trimestre no valido" //sino esta del 1 al 12 dara no valido
        else -> "dasdas"
        }


/* fun getTrimestrer (month: Int){
    when (month) {
        in 1 .. 6 -> println("primer trimestre")

        in 7 .. 12 -> println("segundo trimestre")
        !in 1 .. 12 -> println("trimestre no valido")

    }
}


RANGOS

           
                in 1 .. 6 -> println("primer trimestre")

            in 7 .. 12 -> println("segundo trimestre")

            else -> println("trimestre no valido")

            o tambien
            !in 1 .. 12 -> println("trimestre no valido") si no esta entre el 1 y el 12

fun getMonth(month:Int) {
   when (month) {
       1 -> println("enero")
        2 -> println("febrero")
       3 -> println("marzo")
        4 -> println("abril")
        5 -> println("mayo")
        6 -> println("junio")
       7 -> println("julio")
       8 -> println("agosto")
      9 -> println("septiembre")
        10 -> println("octubre")
       11 -> println("noviembre")
       12 -> println("diciembre")
        else -> println("no es un mes valido") */
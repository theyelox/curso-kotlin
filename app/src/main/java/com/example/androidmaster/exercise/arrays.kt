package com.example.androidmaster.exercise

fun main (){

//indice 0-7
    //tamano 8
    val weekDays = arrayOf("Lunes", "Martes", "Miercoles", "jueves", "viernes", "sabado", "domingo")
println(weekDays[0])


    //modificar valores
    weekDays [0] = "feli lune"

    println(weekDays[0])

    println(weekDays.size)

   //tamanos
    if (weekDays.size >= 8){
        println(weekDays[7])
    }else{
        println("No hay mas valores en el array")
    }

    //buvles pa los array

for (position in weekDays.indices) {

println(weekDays[position])
        }
    for ((position, value ) in weekDays.withIndex()){
        println("la posicion $position, contiene $value")
    }
    for (weekday in weekDays){
        println("ahora es dolar weekday")
    }
}
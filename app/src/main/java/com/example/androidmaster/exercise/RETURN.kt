package com.example.androidmaster.exercise


fun main(){

    val comprador = preguntasDeBoleto(50)

    println("el precio del boleto es $comprador")

    val ejectutametodo: (Int) -> Int

}
fun preguntasDeBoleto(edad:Int):Int{

    when(edad) {
        in 1..5 -> return 10
        in 6..20 -> return 18
        else -> return 25
    }

}

fun preguntasDeBoleto2(edad:Int):Int{

    when(edad) {
        in 1..5 -> return 10
        in 6..20 -> return 18
        else -> return 25
    }

}



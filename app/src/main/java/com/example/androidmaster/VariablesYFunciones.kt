package com.example.androidmaster
//variables
//int es numeros enteros
//string caracteres ej ("=") ej var stringExample:String = "vales verga"
                    //       ej val stringExample2 = "janinluna" tambien asi
// boolean verdadero o false val booleanEcample2:Boolean = false
                    //       val booleanExample = false (sin poner boolean tambien jala)
//double numero decimales 2.0 hasta 14 decimales admite 14 decunakaes
//float numeros decimales pequenos terminan en f 2.0f admite 6 decimeles
//Long entero grande (234541313132)
//char caracteres solo soporta un caracter entre comillas asi var charExample1:Char = 'e' o '@'

val age = 25
fun main(){
    showMyName()
    showMyAge(currentAge = 25)
    add (25, 76)
    val mySubtract = subtract (10, 5)
    println(mySubtract)
}

fun showMyName(){
    println("me llamo lunauwu5")
}

fun showMyAge(currentAge:Int = 25){
    println("tengo $currentAge anos")
}

fun add(firsNumber:Int, secondNumber:Int) { //funcion que suma
 println(firsNumber + secondNumber)
}
fun subtract(firstNumber: Int, secondNumber: Int): Int {
   return firstNumber - secondNumber //restar

}
fun subtractCool(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber - secondNumber //restar

}





fun variablesNumericas2() {
    val age = 25

    //string
    val stringExample:String = "lunauwu5"
    val stringExample2 = "estrada"
    val stringExample3 = "4"
    val stringExample4 = "23a"
    //boolean


    var stringOrdenada:String ="hola"
    val example123:String = age.toString()

    stringOrdenada = "$stringExample $stringExample2 y tengo $age anos"
    print(stringOrdenada)

}

fun variablesAlfanumericas(){
    val charExample1:Char = 'e'
    val charExample2:Char = '2'
    val charExample3:Char = '@'
}

fun variablesBoolean(){
    val booleanExample = true
    val booleanExample2 = false
    val booleanExample3 = false

}

fun variablesNumericas(){

    val age = 25
    var age2 = 28

    age2 = 56
    val floatExample = 30.5f


    val doubleExample = 3120.1213215



    println("Sumar $age $age2:")
    println(age + age2)
    println("restar")
    println(age - age2)

    println("multiplicar")
    println(age * age2)

    println("division")
    println(age/age2)

    println("modulo")
    println(age % age2)

    println("Modulo $age $age2:")
    println(age + age2)
}



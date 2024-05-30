package com.example.androidmaster



//! lo contrario

fun main(){
    ifInt()
}

fun ifMultipleOR(){
    var pet = "dog"
    var isHappys = true

    if (pet == "dog" || (pet == "cat" && pet == "")) {
        print("es un gato o un perro")
    }
}





fun ifMultiple(){
    var age = 18
    var parentPermissions = false
    var imHappy = true


    if (age >= 18 && parentPermissions && imHappy){
        println("puedo beber cerveza")
    }
}

fun ifInt() {

    var age = 29

    if (age > 18){
        println("puede beber alcohol")
    } else {
        println("solo tomara jugo")
    }

}

//ifanidado
fun ifAnidado(){
    val animal = "jaguar"


    if (animal == "dog"){
        println("es un perrito!")

    }else if (animal == "agaporni"){
        println("es la uma")
    } else if (animal == "cat"){
        println("es la luna y el chetes")
    } else{
        println("no hay ni vergas")
    }
}

fun ifBoolean(){
    var soyFeliz = false

    if (!soyFeliz){


    }


}




//fun ifBasic() {
// val age = 10

//   if (age == 10) {
//  println("la edad correcta")
// } else {

//        println("la edad incorrecta")

//  }
//}
package com.example.androidmaster.exercise
//lista solo de lectura
fun main(){
    mutableList()
}
fun mutableList(){ //modificar o anadir valores
        val weekDays:MutableList<String> = mutableListOf ("Lunes", "Martes", "Miercoles", "jueves", "viernes", "sabado", "domingo")
            weekDays.add ("luniDeps")
              println(weekDays)

                if(weekDays.isEmpty()) {
                }else{
                    weekDays.forEach{ println(it)}

                    if (weekDays.isNotEmpty())
                        weekDays.forEach{ println(it)}
                }
        weekDays.last()

}

/*fun inmutableList(){
    val readOnly:List<String> = listOf("Lunes", "Martes", "Miercoles", "jueves", "viernes",
        "sabado", "domingo")
    println(readOnly.size) //el tamano
    println(readOnly) // citar los valores o cuales hay en la lista
    println(readOnly[0]) //citar solo el lunes
    println(readOnly.last()) //dame el ultimo tyamano de la lista
    println(readOnly.first()) //el primero d ela lista


    //filtrar

    //val example = readOnly.filter { it.contains( "o") } //it va a recogerer y filtrer va a filtrar y va a mostrar todos los que tengan a
//println(example)
    readOnly.forEach{ weekday -> println(weekday)}
}*/
package com.ejemplo.androidmasterlaura.sintaxis

fun main(){

    var weekDays= arrayOf("lunes","martes","miercoles","jueves","viernes","sabado","domingo")

    println(weekDays[3])

    for(position in  weekDays.indices){
        println(weekDays[position])
    }
for((position, value) in weekDays.withIndex()){
    println("la posicion $position contiene $value ")

}

    for (weekDay  in  weekDays){

        println("la posicion $weekDay ")

    }
}
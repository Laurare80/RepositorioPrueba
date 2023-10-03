package com.ejemplo.androidmasterlaura.sintaxis


/**
 * variables
 */
fun main(){

    getMonth(9)
}

fun getMonth(month: Int) {

    when (month) {
        1,2,3 -> println("Enero")
        2 -> println("Febrero")
        3 -> {
            println("Marzo")
             println("Marzo")
        }
        4 -> println("Abril")
         else ->   println("no existe")
    }
}
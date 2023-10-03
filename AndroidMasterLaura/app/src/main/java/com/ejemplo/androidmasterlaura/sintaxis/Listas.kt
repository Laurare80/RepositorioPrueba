package com.ejemplo.androidmasterlaura.sintaxis

fun main(){

//inmutableList()
    mutablelist()
}

fun mutablelist(){
  var weekDays:MutableList<String> = mutableListOf("lunes","martes","miercoles","jueves","viernes","sabado","domingo");

    println(weekDays)
    weekDays.add("festivo")
    println(weekDays)

}

fun inmutableList(){
    val readOnly:List<String> = listOf("lunes","martes","miercoles","jueves","viernes","sabado","domingo");
    //println(readOnly.size)
    //println(readOnly.toString())

    //println(readOnly[0])
  //  println(readOnly.first())
   // println(readOnly.last())

 //   var example = readOnly.filter{it.contains("a")}
  //  println(example)

    readOnly.forEach {weekDay->println(weekDay)}
}
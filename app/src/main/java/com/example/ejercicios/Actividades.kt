package com.example.ejercicios

const val pi:Double = 3.14159;

fun main(){

    //Act 1
    var edad:Int = 21;
    var nombre: String = "Miguel";
    var altura: Double = 2.10;


    //act 2
    var radio:Double=2.0;
    var area :Double = pi * radio + pi * radio;
    println("El area es de: $area")


    //act 3
    fun saludar(nombre:String, edad:Int):String{
        return "Hola $nombre tienes $edad años"
    }
    println(saludar(nombre, edad))



    //atc 4
    fun informacionPersonal (nombre:String, edad:Int, ciudad:String):String{
        return "Hola $nombre tienes $edad años y eres de $ciudad"
    }
    println(informacionPersonal(nombre, edad, "Granada"))


}
package arrays

import java.util.Arrays

/*
Realiza un programa que solicite las notas de 4 exámenes, los almacene en un array,
y después recorra el array y obtenga y muestre por pantalla la media aritmética de las notas
(ver tema Estructuras básicas).
 */
fun main() {
    println("Introduzca las notas de 4 examenes")
    var grades = Array(4) { 0 }


    for (value in 0 until 4) {
        println("Introduce el valor de la nota ${value + 1}")
        grades[value] = readln().toInt()

    }


    println("Notas:")
    println(grades.contentToString())
    println("Suma")
    println("${grades.sum()}")
    println("Media aritmetica ${grades.average()}")


}
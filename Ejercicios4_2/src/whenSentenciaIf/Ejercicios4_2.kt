package whenSentenciaIf

/*
Realiza un programa que usando una estructura when como sentencia similar a if else if,
compruebe si la edad introducido está en el rango de 1 a 10, de 11 a 20, 21 a 30, 31 a 40, 41 a 50 o
superior y muestre por pantalla en qué rango está.
 */

fun main(){
    println("Introduce your age")
    val age = readln().toInt()
    when {
        age in 1..10 -> {
            println("You're a bb")
        }
        age in 11..20-> {
            println ("you're young")
        }
        age in 21..30 -> {
            println("You're an adult")
        }
        age in 31..40-> {
            println("Still an adult though")
        }
        age in 41..50 -> {
            println("You're a senior")
        }else -> {
            println("U gotta be f*cking me")
        }
    }
}
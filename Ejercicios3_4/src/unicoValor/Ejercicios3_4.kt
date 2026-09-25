package unicoValor

/*
Realiza un programa en el que definas una función isLeapYear
que reciba un año e indique si es bisiesto o no calculándolo
mediante una única expresión.
Prueba la función con distintos valores.
 */

fun main(){
    println( isLeapYear(2028))
    println(isLeapYear(2007))
    println( isLeapYear(2026))
    println(  isLeapYear(2024))

}
fun isLeapYear(age:Int) :Boolean  = (age % 4 == 0 && age % 100 != 0) || (age % 400 == 0)

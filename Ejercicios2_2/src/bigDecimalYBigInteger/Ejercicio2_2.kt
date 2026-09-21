package bigDecimalYBigInteger

import java.math.BigInteger

/*
Crea una variable que contenga un número entero muy, muy grande (más de 25 dígitos) como un String.
Convierte ese String a BigInteger usando algún método disponible.
Súmale a este BigInteger el número 99, convertido previamente a BigInteger con algún método factoría disponible.
Imprime el resultado final de la suma.
 */
fun main(){
    val numberString = "100750232108200728041081010200741392060984191202026"
    val number99 = BigInteger.valueOf(99)
    val newNumber = numberString.toBigInteger()
    val resultado = newNumber + number99
    println(resultado)

}
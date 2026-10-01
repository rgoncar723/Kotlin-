package excepciones

import kotlin.math.sqrt

/*
Escribe una función en Kotlin llamada calculateSquareRoot(number: Double): String que acepte un número Double como parámetro y devuelva un mensaje con la raíz cuadrada del número "La raíz cuadrada de _ es _". Si el número es negativo, se debe lanzar una excepción con el mensaje "El número no puede ser negativo". La función debe usar try-catch como expresión para manejar la excepción lanzada en caso de que el número sea negativo.
Define una función llamada getValidAge que acepte un único parámetro ageString de tipo String y que devuelva un valor de tipo Int.
Dentro de la función, utiliza una expresión try-catch para determinar el valor de retorno:

En el bloque try, intenta convertir ageString a un Int. Una vez convertido a un entero (age), utiliza la función require() para asegurar que la edad es mayor o igual a 1 y menor o igual a 120. Si la validación falla, proporciona un mensaje de error conciso.
Si ocurre una excepción de tipo NumberFormatException (debido a una cadena no numérica), el bloque catch debe devolver el valor 0.
Si ocurre una excepción de tipo IllegalArgumentException (debido a la validación de require()), el bloque catch debe devolver el valor -1.
En la función main, llama a getValidAge tres veces con las siguientes entradas e imprime el resultado de cada llamada: "25", "abc", y "200".
 */

fun main(){
    println(getValidAge("25"))
    println(getValidAge("abc"))
    println(getValidAge("200"))
}
fun calculateSquareRoot(number:Double):String{

    if(number<0.0){
        throw IllegalArgumentException("El número no puede ser negativo")
    }
    return "La raíz cuadrada de ${number} es ${sqrt(number)}"
}
fun getValidAge(ageString: String): Int {
    return try {
        val age = ageString.toInt()

        require(age in 1..120) {
            "La edad debe estar entre 1 y 120"
        }

        age

    } catch (e: NumberFormatException) {
        0

    } catch (e: IllegalArgumentException) {
        -1
    }
}
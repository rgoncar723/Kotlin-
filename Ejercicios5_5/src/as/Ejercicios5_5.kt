package `as`

/*
Escribe una función en Kotlin
llamada sumIfAllIntegers
que acepte una cantidad variable
de argumentos de tipo Any usando vararg.
La función debe intentar
convertir todos los argumentos a enteros
(Int) usando el operador seguro
de conversión as?.
Si todos los argumentos
se pueden convertir a enteros,
la función debe devolver
la suma de esos enteros.
Si alguno de los argumentos
no se puede convertir a entero,
la función debe devolver null.
 */
fun sumIfAllIntegers(vararg values: Any): Int?{
    var sum = 0
    for (value in values) {
        val number = value as? Int

        if (number == null) {
            return null
        }

        sum += number
    }
    return sum
}
fun main(){
    println(sumIfAllIntegers(1,2,3,4,5))
    println(sumIfAllIntegers(14,5,"Hola",6,7))
}
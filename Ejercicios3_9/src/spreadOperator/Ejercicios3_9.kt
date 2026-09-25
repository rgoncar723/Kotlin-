package spreadOperator

/*
Escribe una función en Kotlin llamada calculateAverage que reciba
una lista variable de número enteros y calcule su media aritmética.
El main() deberá llamar a la función con los valores incluidos en un IntArray definido previamente en el main().

Define una función llamada combineData que acepte un único parámetro dataChunks
marcado como vararg de tipo Int. La función debe recorrer los elementos de dataChunks
e imprimir cada valor en una nueva línea.
En la función main, declara dos arrays inmutables: initialSet,
que contenga los enteros 10, 20, y 30; y extraSet, que contenga los enteros 40 y 50.
Finalmente, llama a la función combineData y, en una sola línea de código,
pásale todos los elementos de initialSet seguidos por todos los elementos de extraSet.
 */

fun main() {
    val numbers: IntArray = intArrayOf(10, 20, 30)

    val average = calculateAverage(*numbers)
    println(average)

    val initialSet: IntArray = intArrayOf(10, 20, 30)
    val extraSet: IntArray = intArrayOf(40, 50)

    combineData(*initialSet, *extraSet)
}

fun calculateAverage(vararg numbers: Int): Double {
    var sum = 0.0

    for (number in numbers) {
        sum += number
    }

    val average = sum / numbers.size
    return average
}

fun combineData(vararg dataChunks: Int) {
    for (data in dataChunks) {
        println(data)
    }
}
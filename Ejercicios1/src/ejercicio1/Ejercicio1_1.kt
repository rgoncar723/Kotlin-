package ejercicio1

//Realiza un programa que solicite por consola tres números enteros, y los muestre por pantalla en orden.
// Nota: los if en Kotlin tienen una estructura similar a en Java.
// NO utilices Kotlin Playground para hacer el ejercicio, porque no podrás introducir datos por consola.
fun main() {

    var numbers: List<Int>

    do {
        println("Por favor, introduzca tres valores numéricos separados por espacios:")

        try {
            numbers = readln().split(" ").map { it.toInt() }
            if (numbers.size != 3) {
                println("Tienes que introducir exactamente tres valores numéricos.")
            }

        } catch (e: NumberFormatException) {


            numbers = emptyList()
        }

    } while (numbers.size != 3)

    println("Los números ordenados son: ${numbers.sorted()}")
}
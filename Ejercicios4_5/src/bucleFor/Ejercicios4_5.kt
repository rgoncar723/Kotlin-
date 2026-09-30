package bucleFor
/*
Escribe un programa que solicite una valor entero correspondiente a la altura del árbol en filas y, usando bucles (sin usar repeat),muestre el árbol de navidad correspondiente, donde la última fila siempre tiene tres asteriscos, ya que corresponde a la base del árbol. Por ejemplo, para n == 5:


   *
  ***
 *****
*******
  ***

Realice el mismo ejercicio anterior usando la función repeat en vez de bucles.
 */

fun main (){
    println("Introduce la altura del árbol:")
    val number = readln().toInt()


    for (rows in 1 until number) {

        for (space in 1..number - rows) {
            print(" ")
        }

        for (star in 1..2 * rows - 1) {
            print("*")
        }

        println()
    }

    for (base in 1..number - 2) {
        print(" ")
    }

    println("***")

    println("Con repeat")

        repeat(number - 1) { rows ->

            repeat(number - rows - 1) {
                print(" ")
            }

            repeat(2 * rows + 1) {
                print("*")
            }

            println()
        }
    
        repeat(number - 2) {
            print(" ")
        }

        println("***")
    }

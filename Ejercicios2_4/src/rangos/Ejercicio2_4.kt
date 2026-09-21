package rangos

/*
Crea una variable llamada closedRange que contenga los números enteros desde 10 hasta 15, ambos inclusive, usando la sintaxis abreviada. Imprime este rango.
Crea una variable llamada openRange que contenga las letras desde A hasta D, excluyendo D, usando el operador la sintaxis abreviada. Recorre e imprime cada carácter dentro de este rango usando un bucle for.
Crea una variable llamada evenProgression que contenga los números pares desde 20 hasta 10, en orden descendente, con un salto (paso) de 2. Recorre e imprime cada número de esta progresión.
Crea una variable isInRange que verifique si el número 12 está dentro de closedRange. Imprime el resultado de esta verificación (debería ser true).
 */
fun main(){
    val closedRange = 10..15
    for( value in closedRange){
        println(value)
    }
    println("Segundo apartado")
    val openRange = 'A' until 'D'
    for(value in openRange){
        println(value)
    }
    println("Tercer apartado")
    val evenProgression = 20 downTo 10
    for ( value in evenProgression step 2){
        println(value)

    }
    println("Cuarto apartado")
    val isInRange = closedRange.contains(12)
    if(isInRange){
        println("isInRange contiene el valor: ${isInRange}")
    }
}
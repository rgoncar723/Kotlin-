package booleanos

/*
Define dentro de la función main tres variables booleanas:
isReady inicializada a true, isProcessing inicializada a false, y isExpensive inicializada a true.
Ahora, crea una variable shortCircuitResult que use el operador && para evaluar la expresión: isProcessing && isExpensive.
Después, crea una variable fullEvalResult que use el método and (con sintaxis infija) para evaluar exactamente la misma expresión: isProcessing and isExpensive.
Por último, crea una variable isNotReady que sea el resultado de negar (!) la variable isReady. - - Finalmente, imprime los valores de shortCircuitResult, fullEvalResult e isNotReady para demostrar cómo operan los diferentes operadores lógicos.
 */
fun main(){
    val isReady = true
    val isProcessing = false
    val isExpensive = true
    val shortCircuitResult = isProcessing && isExpensive
    val fullEvalResult = isProcessing and isExpensive
    val isNotReady = !isReady

    println(shortCircuitResult)
    println(fullEvalResult)
    println(isNotReady)
}
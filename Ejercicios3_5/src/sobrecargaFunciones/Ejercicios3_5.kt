package sobrecargaFunciones

/*
Define tres funciones sobrecargadas en el ámbito principal, todas con el nombre sumValues:

La primera versión de sumValues debe aceptar dos parámetros inmutables, firstNumber y secondNumber,
ambos de tipo Int, y retornar su suma como un Int.

La segunda versión de sumValues debe aceptar un array de valores de tipo Double llamado doubleValues,
y retornar la suma de todos ellos como un Double.

La tercera versión de sumValues debe aceptar dos parámetros inmutables:
una String llamada prefix y un Int llamado count. Esta función debe retornar una
String que contenga el prefix repetido count veces (
por ejemplo, si prefix es "A-" y count es 3, retorna "A-A-A-").

En la función main, haz las tres llamadas necesarias para probar cada versión de sumValues
y guarda los resultados en variables inmutables llamadas resultInt, resultDouble y resultString,
respectivamente. Finalmente, imprime cada uno de esos tres resultados.
 */
fun main(){
        val resultInt = sumValues(2,3)
        val resultDouble = sumValues(arrayOf(3.4,5.8,1.5))
        val resultString = sumValues("B-",4)
    println(resultInt)
    println(resultDouble)
    println(resultString)
}
fun sumValues(number1:Int, number2:Int):Int{
    return number1 + number2
}
fun sumValues(array: Array<Double> ):Double {
    var sum : Double = 0.0

    for(i in array.indices){
        sum += array[i]

    }
    return sum
}
fun sumValues(prefix:String, count:Int):String{
    var strings : StringBuilder = StringBuilder()


    for (i in 0 until count){
        strings.append(prefix)
    }
    return strings.toString()
}
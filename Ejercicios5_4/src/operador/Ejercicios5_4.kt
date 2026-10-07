package operador

/*
Define una función llamada processItem que acepte un parámetro dataString de tipo String? y que imprima el resultado.
Dentro de esta función,
intenta determinar la longitud de dataString
y guardarla en una variable inmutable llamada finalLength.
Para acceder a la propiedad length,
debes utilizar el operador !! y solo ese operador.

En la función main, haz dos llamadas a processItem:

Una llamada pasando la cadena "TestValue".
Una llamada pasando el valor null.
Comenta qué sucede en el segundo caso y por qué es una práctica desaconsejada.
 */
fun processItem(dataString:String?){
val finalLength = dataString!!.length
    println("${finalLength}")
}
fun main(){
    processItem("TestValue")
    processItem(null)
    // Porque no tenemos la certeza de que el valor no sea null.


}
package operadorEvils

/*
Escribe una función en Kotlin llamada formatName que acepte tres parámetros: un nombre (firstName), un apellido (lastName), y un apodo (nickname). Los parámetros lastName y nickname pueden ser null. La función debe devolver una cadena que siga estas reglas:

Si se proporciona el nickname, el formato debe ser nickname.
Si no se proporciona el nickname, pero se proporciona el lastName, el formato debe ser firstName lastName.
Si no se proporciona ni el nickname ni el lastName, el formato debe ser solo firstName.
La función debe utilizar el operador Elvis (?:) para manejar los valores predeterminados de nickname y lastName.

Define una función llamada getProcessedId que acepte un parámetro userMap de tipo Map<String, String>? (un mapa nullable). La función debe devolver un valor de tipo String.

Dentro de la función, en una sola expresión, utiliza una combinación de operadores para:

Acceder de forma segura (?.) al mapa userMap para obtener el valor asociado con la clave "UserID". El resultado será de tipo String?.
Si el resultado del paso 1 es null, utiliza el Elvis Operator (?:) para devolver la cadena por defecto "ID-UNKNOWN".
A continuación, en una nueva función llamada getRequiredId, usa el mismo patrón para acceder a la clave "RequiredID". Si el resultado de la llamada segura es null, utiliza el Elvis Operator (?:) para lanzar una excepción de tipo IllegalStateException con el mensaje "The required ID is missing".

En la función main, haz las siguientes llamadas e imprime los resultados, usando un bloque try-catch para manejar la excepción lanzada por getRequiredId:

Llama a getProcessedId con un mapa que contenga {"UserID": "A123"}.
Llama a getProcessedId con el valor null.
Llama a getRequiredId con un mapa que contenga {"RequiredID": "B456"}.
Llama a getRequiredId con un mapa que contenga {"OtherKey": "Value"} (para forzar el null).
 */
fun formatName(firstName:String,lastName:String?,nickName:String?):String{
    return nickName ?: lastName?.let { "$firstName $it" } ?: firstName
}
fun getProcessedId(userMap : Map<String,String?>):String{
  return userMap?.get("UserID") ?: "ID-UKNOWN"
}
fun getRequiredId(userMap :Map<String,String?>): String {
    return userMap?.get("RequiredID") ?: throw IllegalStateException("The required ID is missing")
}
fun main(){
    println( getProcessedId(mapOf("UserID" to "A123")))
    println(getProcessedId(mapOf()))
    println(getRequiredId(mapOf("RequiredID" to "B456")))
    println( getRequiredId(mapOf("OtherKey" to "Value")))


}
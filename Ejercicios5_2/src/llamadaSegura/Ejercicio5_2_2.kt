package llamadaSegura

/*
Define una función llamada getConfigValue que acepte un parámetro configMap de tipo Map<String, String>?
(un mapa nullable) y un parámetro key de tipo String.
La función debe devolver un valor de tipo String?.
Dentro de la función, en una sola línea de código, utiliza el operador de llamada segura (?.) para:

Acceder de forma segura al mapa configMap.
Si el mapa existe, acceder al valor asociado con la key proporcionada.
En la función main, declara dos variables:

Una variable inmutable settings de tipo Map<String, String>? que contenga el mapa {"Timeout": "5000"}.
Una variable inmutable nullSettings de tipo Map<String, String>? con el valor null.
Llama a getConfigValue dos veces:
una con settings y la clave "Timeout", y otra con nullSettings y cualquier clave.
Imprime los resultados, observando que el tipo de retorno es consistentemente nullable.
 */

fun getConfigValue(configMap : Map<String, String>?, key : String): String?{
    return configMap?.get(key)
}
fun main(){
    val settings : Map<String,String>? = mapOf("Timeout" to "5000")
    val nullSettings : Map<String,String>? = null

    println(getConfigValue(settings,"Timeout"))
    println(getConfigValue(nullSettings,"HI"))
}

package smartCase

/*
Define una función llamada getNameLength que acepte un único parámetro inmutable userName de tipo String?
y que devuelva un valor de tipo Int.

Dentro de la función, utiliza una expresión if/else para:

Comprobar si userName no es null.
Si userName no es null, devuelve la longitud de la cadena (length).
No uses ningún operador de seguridad nula (?., !!).
 Confía en que el compilador de Kotlin aplicará el Smart Cast
 y te permitirá acceder a la propiedad length de forma segura.
Si userName es null, devuelve el valor 0.
En la función main, llama a getNameLength dos veces:
 una con la cadena "Developer" y otra con el valor null. Imprime los resultados de ambas llamadas.
 */
fun main(){
    println(getNameLength("Developer"))
    println(getNameLength(null))
}
fun getNameLength (userName : String?):Int{
    if (userName != null) {
        return userName.length }
    else { 
        return 0
    }
}
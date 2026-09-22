package nullables

/*
Declara una variable userName de tipo String? y asígnale el valor null inicialmente.
Luego, declara otra variable inmutable, defaultName, de tipo String (no nullable) y asígnale el valor "Guest".
A continuación, intenta asignar el valor de userName a una nueva variable inmutable, finalName, de tipo String y observa el error de compilación que se produce.
Finalmente, comenta la línea que causa el error y explica en un comentario de una sola línea, en español, por qué el compilador de Kotlin detiene esta asignación.
 */
fun main(){
    val userName : String? = null
    val defaultName : String = "Guest"
    // val finalName : String = userName
    //El compilador detiene la asignación porque userName puede contener null y finalName no lo admite.
}
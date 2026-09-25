package tipoUnit

/*
Define dos funciones llamadas printWelcomeMessage y logActivity.
La función printWelcomeMessage debe aceptar un único parámetro
llamado user de tipo String e imprimir un mensaje de bienvenida personalizado.
La función logActivity no debe aceptar parámetros,
solo debe imprimir la cadena "Activity logged".
No especifiques un tipo de retorno explícito para ninguna de las dos funciones.
En la función main,
llama a printWelcomeMessage y guarda su resultado en una variable inmutable llamada resultOne.
Luego, llama a logActivity y guarda su resultado en una variable inmutable llamada resultTwo.
Finalmente, imprime los valores de resultOne y resultTwo.
 */
fun main(){
    val resultOne = printWelcomeMessage("Circe")
    val resultTwo = logActivity()
    println(resultOne)
    println(resultTwo)

}
fun printWelcomeMessage(user : String ){
    println("Welcome ${user}!")
}
fun logActivity(){
    println("Activity logged")
}
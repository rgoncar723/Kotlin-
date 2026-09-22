package strings

/*
Realiza un programa que solicite por consola una cadena de caracteres y diga para cada carácter si está en mayúscula,
si está en minúscula o no es una letra (la ñ no cuenta como letra),
para lo que debe comprobar que el código numérico correspondiente al carácter está en el rango numérico de los códigos que van de la A a la Z, o de la a a la z.
 */
fun main(){
    println("Introduza una cadena de caracteres. Ejemplo: aaabbbccc")
    val string = readln()
    var lower = 0
    var upper = 0
    var other = 0
    for ( value in string){
        if(value.code >= 65 && value.code <= 90 ){
            upper ++
        } else if (value.code >= 97 && value.code <= 122){
            lower ++
        }
        else {
            other ++
        }
    }
    println("La cantidad de caracteres en minuscula es ${lower}")

    println("La cantidad de caracteres en mayuscula es ${upper}")

    println("La cantidad de caracteres que no son letras es ${other}")
}
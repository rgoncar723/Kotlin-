package strings

/*
Define dos variables String, firstName inicializada con el valor Alan y lastName inicializada con Turing, y una variable yearOfBirth de tipo Int con el valor 1912.
A continuación, crea una variable fullName concatenando firstName, un espacio y lastName.
Después, crea una variable firstChar que acceda al primer carácter de fullName usando la sintaxis de indexación, e imprime su valor.
Luego, crea una variable isSameName y usa el operador de comparación para verificar si firstName es igual a Alan, e imprime isSameName.
Finalmente, define una variable biography como una cadena multilínea que use trimMargin() con el prefijo | y que contenga la siguiente información usando plantillas de cadena (cada dato en una línea): Full Name: [Valor de fullName]. Year: [Valor de yearOfBirth]. The first letter is: [Valor de firstChar].
Imprime el valor de biography.
 */
fun main(){
    val firstName = "Alan"
    val lastName = "Turing"
    val yearOfBirth: Int = 1912

    val fullName = "$firstName $lastName"

    val firstChar = fullName[0]
    println(firstChar)

    val isSameName = firstName == "Alan"
    println(isSameName)

    val biography = """
        |Full Name: $fullName
        |Year: $yearOfBirth
        |The first letter is: $firstChar
    """.trimMargin()

    println(biography)
}
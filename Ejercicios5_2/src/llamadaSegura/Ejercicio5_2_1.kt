package llamadaSegura
/*
Crea una clase llamada Person que contiene una propiedad name de tipo String? (ver tema POO I).
Escribe una función en Kotlin llamada getNameLength que acepte un objeto de tipo Person? y
devuelva la longitud del nombre si el objeto no es null, o 0 si el objeto es null
o si el nombre dentro del objeto es null, para lo que debe usar el operador de llamada segura.
 */
class Person () {
    var name:String? = null

}
fun getNameLength(user:Person?): Int {
        return user?.name?.length ?: 0

}

fun main(){
    val person1 = Person()
    val person2 = Person()

    person1.name = "Matias"
    person2.name = null

    println(getNameLength(person1))
    println(getNameLength(person2))
}
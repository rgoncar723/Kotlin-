package whenExpresion

/*
Completa al siguiente código para que la función name devuelva "Nothing" si recibe null
, "Small number" si recibe el 1, el 2 o el 3
, "Magic number" si recibe el 7 o el 13
, "Big number" si es número entre 4 y 100
, "String" si es de tipo String
, "Integer" si es de tipo Int o Long,
o "No idea" en cualquier otro caso


fun name(a: Any?): String = when (a) {
    // ...
}
 */
fun main(){
    println(name(3))
    println(name(7))
    println(name("Hello"))
    println(name(1233434343434))
    println(name(null))
    println(name(5))
    println(name(1234L))

}

fun name(a: Any?): String = when (a) {
    null -> "Nothing "
    in 1 .. 3 -> "Small number"
    7, 13  -> "Magic number"
    in 4..10 -> "Big number"
    is String -> "String"
    is Int, is Long -> "Integer"
    else -> "No idea "
   }

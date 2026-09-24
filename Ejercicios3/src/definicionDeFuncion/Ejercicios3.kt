package definicionDeFuncion

/*
Realiza un programa en el que se define una función isPrime que reciba un número entero
y retorne si es número primo o no. La función main() deberá llamar
a la función isPrime varias veces con valores diferentes para probarla
(ver tema Estructuras básicas si lo necesitas)
 */

fun main(){
    val number : Int
    println("Introduzca un numero para comprobar si es primo o no ")
    number = readln().toInt()
    println(isPrime(number))
}
fun isPrime(x:Int) : Boolean {
    if(x <=1 ){
        return false
    }
    for(i in 2..(x-1)){
        if(x%i==0){ // ¿x se puede dividir exactamente entre i?
            return false
        }
    }
    return true
}
package tiposNumericos

//Realiza un programa que defina una variable de tipo Number, inicializada con un valor de tipo Double, Float o Int.
//Después realiza la conversión de la variable a los tres tipos hacia tres variables.
//Finalmente, compara el valor original convertido a Double y el resultado de la conversión del valor original a Int y vuelto a convertir a Double,
// para comprobar si se ha producido pérdida de información.
// - Haz lo mismo para comprobar si se ha producido pérdida de información al pasar a Float.
//Cambia el literal de inicialización de la variable de tipo Number para probar con diferentes posibilidades.

fun main(){
    //Declaración de variables

    val number : Number = 5.4

    //Conversión
    println("Float : ${number.toFloat()}")
    println("Long : ${number.toLong()}")
    println("Decimal : ${number.toDouble()}")
    //Pasar de int a double
    val numberDouble = number.toDouble()
    val numberInt = number.toDouble().toInt()
    println(numberDouble)
    println(numberInt)

    if(numberDouble.equals(numberInt) ){
        println("No se ha perdido información")
    }else{
        println("Se ha perdido información")
    }
    //PAsar de float a Double
    val numberDouble2 = number.toDouble()
    val numberFloatADouble = number.toFloat().toDouble()

    println(numberDouble2)
    println(numberFloatADouble)
    if(numberDouble2 == numberFloatADouble ){
        println("No se ha perdido información")
    }else{
        println("Se ha perdido información ")
    }


}
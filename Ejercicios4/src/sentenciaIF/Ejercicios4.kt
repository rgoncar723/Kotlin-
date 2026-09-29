package sentenciaIF

/*
Escribe un programa que solicite una edad y unos ingresos y clasifique al trabajador indicando la pantalla la categoría a la que pertenece, teniendo en cuenta los siguientes criterios:

Si la persona tiene menos de 18 años, debe clasificarse como "Menor de edad".
Si la persona tiene entre 18 y 64 años:
Si su ingreso anual es menor a 20.000, clasifíquela como "Joven trabajador con bajo ingreso".
Si su ingreso anual está entre 20.000 y 60.000, clasifíquela como "Adulto trabajador con ingreso medio".
Si su ingreso anual es superior a 60.000, clasifíquela como "Adulto trabajador con alto ingreso".
Si la persona tiene 65 años o más:
Si su ingreso anual es menor a 15.000, clasifíquela como "Anciano con bajo ingreso".
Si su ingreso anual está entre 15.000 y 40.000, clasifíquela como "Anciano con ingreso medio".
Si su ingreso anual es superior a 40.000, clasifíquela como "Anciano con alto ingreso".
 */
fun main(){
    println("Introduce your age")
    val age = readln().toInt()
    println("Introduce your anual income")
    val anual_income = readln().toInt()

    if(age < 18){
        println("You are a minor")

    } else if (age in 18 .. 64 ){

        if(anual_income < 20000){
            println("Joven trabajador con bajo ingreso")
        } else if ( anual_income in 20000..60000){
            println("Adulto trabajador con ingreso medio")
        } else{
            println("Adulto trabajador con alto ingreso")
        }
    } else {
        if(anual_income < 15000){
            println("Anciano con bajo ingreso")
        } else if ( anual_income in 15000..40000){
            println("Anciano con ingreso medio")
        }else{
            println("Anciano con alto ingreso")
        }
    }
}
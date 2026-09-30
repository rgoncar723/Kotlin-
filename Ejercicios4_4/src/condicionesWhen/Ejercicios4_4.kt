package condicionesWhen

/*
Define una función llamada calculateDiscount que acepte dos parámetros inmutables:
orderTotal de tipo Double y isLoyalCustomer de tipo Boolean.
La función debe devolver un valor de tipo String que describa el descuento aplicado.

Dentro de la función, utiliza una expresión when con orderTotal como sujeto para determinar el descuento,
aplicando las siguientes condiciones en orden:

Si orderTotal es menor que 10.0, el descuento es "No discount".
Si orderTotal es menor que 50.0 y el cliente es un cliente leal (isLoyalCustomer es true),
el descuento es "5% Loyalty Discount".

Utiliza un bloque else if que compruebe si orderTotal es menor que 100.0
(sin tener en cuenta el estado de lealtad), en cuyo caso el descuento es "10% Standard Discount".

Para cualquier otro caso (else), el descuento es "20% Volume Discount".

En la función main, llama a calculateDiscount al menos tres veces para cubrir
los diferentes caminos de la lógica e imprime los resultados.
 */
fun main(){
    println(calculateDiscount(10.0,true))
    println(calculateDiscount(45.0,false))
    println( calculateDiscount(49.0,true))
    println( calculateDiscount(90.0,false))
    println( calculateDiscount(120.0,false))

}
fun calculateDiscount( orderTotal: Double,  isLoyalCustomer:Boolean) : String {
   return  when(orderTotal){
       in Double.MIN_VALUE.. 10.0 -> "No discount"
       else if  (orderTotal < 50 && isLoyalCustomer)  -> "5% Loyalty Discount"
       else if( orderTotal< 100)  -> "10% Standard Discount"
       else  ->  "20% Volume discount"

        }
}
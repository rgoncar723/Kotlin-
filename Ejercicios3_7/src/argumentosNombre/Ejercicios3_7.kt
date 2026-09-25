package argumentosNombre

/*
Define una función llamada generateReport que tenga la siguiente firma:

generateReport(reportTitle: String, startDate: String, endDate: String = "Today", detailedView: Boolean = true, watermarkText: String? = null)

Dentro de la función, simplemente imprime una línea de texto que muestre todos los parámetros y sus respectivos valores, separados por comas.

En la función main, llama a generateReport tres veces:

Una llamada pasando el argumento reportTitle posicionalmente y el argumento watermarkText por nombre,
permitiendo que todos los demás parámetros usen sus valores por defecto.

Una llamada pasando los tres argumentos de tipo String (reportTitle, startDate, y endDate)
en el orden invertido respecto a la definición de la función, utilizando solo argumentos nombrados.

Una llamada que mezcle argumentos. Pasa reportTitle y startDate posicionalmente,
y luego solo especifica el valor de detailedView utilizando su nombre.
 */
fun main(){
    generateReport("Reporte 1", "25/9/26",watermarkText = "q")
    generateReport(endDate = "28/4/27",startDate = "21/8/26", reportTitle = "Report2")
    generateReport("Report3","29/5/26", detailedView = false)


}
fun generateReport(reportTitle: String, startDate: String, endDate: String = "Today", detailedView: Boolean = true, watermarkText: String? = null) {
    println("${reportTitle}, ${startDate}, ${endDate}, ${detailedView}, ${watermarkText}")
}
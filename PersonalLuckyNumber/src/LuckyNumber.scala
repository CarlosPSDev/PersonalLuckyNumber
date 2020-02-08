/** Clase ejecutable que calcula el número de la suerte (Lucky Number) solicitando la fecha de nacimiento y lo muestra
 * @author Carlos Pardos
 */

object LuckyNumber {
  def main(args: Array[String]): Unit = {

    println("Introduce tu día de nacimiento")
    println("Día: ");
    val dia = scala.io.StdIn.readInt()
    println("Mes: ");
    val mes = scala.io.StdIn.readInt()
    println("Año: ");
    val anio = scala.io.StdIn.readInt()
    
    val suma = sumar(dia, mes, anio)

    println(s"\nTu número de la suerte es: ${calcularLucky(suma)}")   

  }
  def calcularLucky(suma: Int): Int = { 
    val cifras = Array(suma / 1000, suma / 100 % 10, suma / 10 % 10, suma % 10)
    val lucky = cifras.sum
    lucky
  }

  def sumar(valores: Int*): Int = { 
    var result = 0
    for (i <- valores)
      result += i
    result 
  }

}
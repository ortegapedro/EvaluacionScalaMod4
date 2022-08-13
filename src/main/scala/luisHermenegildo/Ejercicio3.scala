package main.scala.luisHermenegildo

/**
 * Desarrollado por Luis Hermenegildo
 *
Ejercicio 3
Se tienen tres tipos válidos de dispositivos:
● Celular
● Laptop
● Tablet
Cada dispositivo cuenta con ciertas características:
El celular tiene:
● SIM
● IMEI
● Marca
La laptop tiene:
● Serie
● Versión del sistema operativo
La tablet cuenta con:
● DNI
● Modelo
Se requiere construir un solo método llamado "imprimirCaracteristicas" que
reciba un único parámetro de entrada y que permita lo siguiente:
1. Regresar el SIM y el IMEI si el dispositivo es un celular, sólo si la
marca es iPhone.
2. Regresar la serie y la versión del sistema operativo si es una laptop.
3. Regresar el DNI y el modelo si se trata de una tablet.
4. En caso de ser algo distinto a lo contemplado en los casos previos, se
deberá lanzar la excepción DispositivoException.

NOTA: Se deberá hacer uso de pattern matching en case clases para
este ejercicio. Deberá ser posible ejecutar lo siguiente:

val someCelular = Celular("12345", "565", "iPhone")
val someTablet = Tablet("2342", "38687")
println(imprimirCaracteristicas(someCelular)) //SIM: 12345 IMEI: 565
println(imprimirCaracteristicas(someTablet)) //DNI 2342 Modelo: 38687
 **/

trait Device
case class Celular(IMEI:String,SIM:String,Marca:String) extends Device
case class Laptop(Serie:String,SO_Version:String) extends Device
case class Tablet(DNI:String,Modelo:String) extends Device
case class Otro(DNI:String,Modelo:String) extends Device



object Ejercicio3 extends App{
  val someCelular = Celular("12345", "565", "iPhone")
  val someTablet = Tablet("2342", "38687")
  val someOther = Otro("2342", "38687")

  def imprimirCaracteristicas(dev:Device):String = {
    dev match {
      case Celular(sim, imei, _) =>
        s"SIM: ${sim}, IMEI:${imei} "
      case Tablet(dni,modelo) =>
        s"DNI: ${dni}, Modelo: ${modelo}"
      case Laptop(serie,so_version) =>
        s"SERIE: ${serie}, SO_VERSION: ${so_version}"
      case _ => throw new RuntimeException("DispositivoException")
    }
  }

  println(imprimirCaracteristicas(someCelular)) //SIM: 12345 IMEI: 565
  println(imprimirCaracteristicas(someTablet)) //DNI 2342 Modelo: 38687
  println(imprimirCaracteristicas(someOther)) // Exception DispositivoException
}
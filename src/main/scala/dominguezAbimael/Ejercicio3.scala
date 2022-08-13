package main.scala.dominguezAbimael

object Ejercicio3 extends App {

  final case class DispositivoExeption(private val message: String = "ERROR. Intente de nuevo, se encontró un patrón no aceptado")
    extends Exception(message)

  sealed trait Dispositivo
  case class Celular (imei: String, sim: String, marca: String) extends Dispositivo
  case class Laptop (serie: String, version: String) extends Dispositivo
  case class Tablet(dni: String, modelo: String) extends Dispositivo

  val someCelular: Dispositivo = Celular ("12345" , "565" , "iPhone")
  val someTablet: Dispositivo = Tablet("2342", "38687")
  val someLaptop: Dispositivo = Laptop("123456789", "v2.0")
  val someFakeCelular: Dispositivo = Celular ("12345" , "565" , "fake_iPhone") // este objeto se utiliza para generar la excepción
  val arreglo_dispositivos = Array(someCelular, someTablet, someLaptop, someFakeCelular)


  def imprimirCaracteristicas(my_array: Array[Dispositivo]) = {

    def whatDevice(x: Dispositivo) = {
      x match {
        case Celular(imei, sim, marca) if marca == "iPhone" =>  println(s"SIM: $sim, IMEI: $imei")
        case Tablet(dni, model) => println(s"DNI: $dni, MODELO: $model")
        case Laptop(serie, version) => println(s"SERIE: $serie, VERSION: $version")
        case _ => throw new DispositivoExeption
      }
    }

    for {
      my_object <- my_array
    } whatDevice(my_object)
  }

  imprimirCaracteristicas(arreglo_dispositivos)

}


/*
Output:

SIM: 565, IMEI: 12345
DNI: 2342, MODELO: 38687
SERIE: 123456789, VERSION: v2.0
Exception in thread "main" main.scala.dominguezAbimael.Ejercicio3$DispositivoExeption: ERROR. Intente de nuevo, se encontró un patrón no aceptado
	at main.scala.dominguezAbimael.Ejercicio3$.whatDevice$1(Ejercicio3.scala:27)
*/
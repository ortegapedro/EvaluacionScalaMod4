package main.scala.carlosMedina

object ejercicio3 extends App {

  final case class DispositivoException(private val message: String = "exception",
                                   private val cause: Throwable = None.orNull)
    extends Exception(message, cause)

  def imprimirCaracteristicas(obj:Aparato): Unit ={
    obj match {
      case Celular(mei,sim,"iPhone") => println("mei: " + mei + " sim: "+sim)
      case Laptop(serie,so) => println("serie: " + serie + " so: "+so)
      case Tablet(dni,modelo) => println("dni: " + dni + " modelo: "+modelo)
      case _ => throw DispositivoException("DispositivoException")
    }
  }

  abstract class Aparato

  case class Celular(mei: String, sim: String, marca:String) extends Aparato
  case class Laptop(serie: String, so: String) extends Aparato
  case class Tablet(dni: String, modelo: String) extends Aparato
  val someCelular = Celular("123445","56S","iPhone")
  val someCelularChafa = Celular("123445","56S","JiPhone")
  val someTablet = Tablet("2345","3874")
  imprimirCaracteristicas(someCelular)
  imprimirCaracteristicas(someTablet)
  imprimirCaracteristicas(someCelularChafa)
}

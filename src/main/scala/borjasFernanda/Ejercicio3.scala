package main.scala.borjasFernanda

object Ejercicio3 extends App{
  trait Disp
  case class Celular(IMEI:String, SIM:String, Marca:String) extends Disp
  case class Laptop(Serie:String, Version:String) extends Disp
  case class Tablet(DNI:String, Modelo:String) extends Disp

  def imprimirCaracteristicas(e: Disp): String = e match {
    case Celular(i, s, m) if m == "iPhone" => s"SIM: $s IMEI: $i"
    case Laptop(s, v) => s"SERIE: $s VERSION: $v"
    case Tablet(d, m) => s"DNI: $d MODELO: $m"
    case _ => throw new RuntimeException("DispositivoException")
  }

  val someCelular = Celular("12345", "565", "iPhone")
  val someTablet = Tablet("2342", "38687")

  println(imprimirCaracteristicas(someCelular))
  println(imprimirCaracteristicas(someTablet))
}

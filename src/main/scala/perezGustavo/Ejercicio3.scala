package main.scala.perezGustavo

import scala.language.postfixOps

//By Gustavo Perez B
object Ejercicio3 extends App {
  trait Device
  case class Celular(imei: String, sim: String, marca: String) extends Device
  case class Laptop(serie: String, version: String) extends Device
  case class Tablet(dni: String, modelo: String) extends Device

  val someCelular = Celular("12345", "565", "iPhone")
  val someTablet = Tablet("2342", "38687")
  println(someCelular.isInstanceOf[Celular])
  println(someCelular.sim)
  def imprimirCaracteristicas(value: Device): String ={
    value match{
      case Celular(imei, sim, marca) =>  println("SIM:", this.someCelular.sim,"IMEI:",this.someCelular.imei)
      case Tablet(dni, modelo) =>  println("DNI:", this.someTablet.dni,"Modelo:",this.someTablet.modelo)
    }
    return ""
  }
  println(imprimirCaracteristicas(someCelular)) //SIM: 12345 IMEI: 565
  println(imprimirCaracteristicas(someTablet)) //DNI 2342 Modelo: 38687
}
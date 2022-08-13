package main.scala.carbajalIvan

import scala.io.Source

object Ejercicio1 extends App {

  def parseFile(pathToFile:String): Unit = {
    val source = io.Source.fromFile(pathToFile)   // Leer archivo
    var location: List[String] = List()   // Listas vacías que contendrán la info
    var price: List[String] = List()

    for (line <- source.getLines) {
      val cols = line.split(",").map(_.trim)
      location = location:+cols(1)
      price = price:+cols(2)
    }
    source.close

    for (element <- location){
      println(s"${element}")
    }
    for (element <- price){
      println(s"${element}")
    }
  }

  parseFile("src/resources/RealEstate.csv")


}

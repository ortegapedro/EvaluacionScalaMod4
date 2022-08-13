package main.scala.dominguezAbimael
import scala.io.Source


object Ejercicio1 extends App {

    def parseFile(pathToFile: String): Unit = {

      val data = Source.fromFile(pathToFile)

      for (line <- data.getLines().drop(1)) {
        val cols = line.split(",").map(_.trim)
        println(s"|${cols(1)}|${cols(2)}|")
      }
      data.close
    }

  parseFile(pathToFile="src/resources/RealEstate.csv")

  /*
  Output:
  |Arroyo Grande|795000|
  |Paso Robles|399000|
  |Paso Robles|545000|
  |Morro Bay|909000|
  ...
  */

}

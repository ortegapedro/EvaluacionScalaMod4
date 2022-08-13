package main.scala.borjasFernanda

import scala.io.Source

object Ejercicio1 extends App {
  def parseFile(pathToFile: String): Unit = {
    val df = Source.fromFile(pathToFile)
    for (line <- df.getLines) {
      val cols = line.split(",").map(_.trim)
      println(s"${cols(1).replaceAll("\\s", "")}|${cols(2)}")
    }
  }
}



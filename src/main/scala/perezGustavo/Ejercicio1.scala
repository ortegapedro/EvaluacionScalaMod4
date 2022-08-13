package main.scala.perezGustavo

object Ejercicio1 extends App {
  val bufferedSource = io.Source.fromFile("src/resources/RealEstate.csv")
  var c = 0;
  for (linea <- bufferedSource.getLines) {
    if (c > 0){
    val columnas = linea.split(",").map(_.trim)
    // do whatever you want with the columns here
    println(s"Location:${columnas(1).replace(" ", "")} Price:${columnas(2)}")
    }
    c=c+1
  }
  bufferedSource.close

}

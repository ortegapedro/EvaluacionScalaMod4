package main.scala.carlosMedina

object ejercicio1 extends App{
  def parseFile(pathToFile:String): Unit ={
    val bufferedSource = io.Source.fromFile(pathToFile)
    for (line <- bufferedSource.getLines) {
      val cols = line.split(",").map(_.trim)
      if(cols(1) != "Location"){
        println(s"${cols(1).replaceAll("\\s", "")}|${cols(2)}")
      }
    }
    bufferedSource.close
  }
  //println("Month, Income, Expenses, Profit")
  parseFile("/Users/carlos/Google Drive/DiplomadoBigData/EvaluacionScalaMod4/src/resources/RealEstate.csv")
}

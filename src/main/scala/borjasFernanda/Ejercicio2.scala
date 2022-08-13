package main.scala.borjasFernanda
// class MyCustomException(s: String) extends Exception(s) {}

object Ejercicio2 extends App{
  def countCharacters(word:String): Int = {
    if (word == null) {
      println ("Entrada nula")
      0
    }
    else if (word == "") {
      println ("Entrada cero")
      0
    }
    else {
      1 + countCharacters (word.substring (1) )
    }
  }
}







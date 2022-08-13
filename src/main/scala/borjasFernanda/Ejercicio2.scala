package main.scala.borjasFernanda
// class MyCustomException(s: String) extends Exception(s) {}

object Ejercicio2 extends App{
  def countCharacters(word:String): Int = {
    def recursive_count_char(word:String): Int = {
      if (word == "") {
        0
      } else {
        1 + recursive_count_char(word.substring (1) )
      }
    }

    if (word == null) {
      println ("Your string is null")
      0
    }
    else if (word == "") {
      println ("Your string is empty")
      0
    }
    else {
      1 + recursive_count_char(word.substring (1) )
    }
  }
}







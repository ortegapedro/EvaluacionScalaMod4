package main.scala.dominguezAbimael

import scala.annotation.tailrec

object Ejercicio2 extends App{

  var n: Int = 0

  def countCharacters(word: String): Int = {

      if (word.length < 1)
        1
      else {
        countCharacters(word.substring(0, word.length-1))
        n = n + 1
        n
      }
  }
    println(countCharacters("Hellos"))

}

package main.scala.carbajalIvan

object Ejercicio2 extends App {

  def countCharacters(word:String):Int = {
    var counter:Int = 0
    if(word == null){
      println("Your String is null")
      counter = 0
    } else if (word == ""){
      return 0
    } else if (word != "") {
      return 1 + countCharacters(word.substring(1))
    }

    if (counter == 0) {
      println("Your String is empty")
    }
    return counter
  }

  println(countCharacters(""))

}

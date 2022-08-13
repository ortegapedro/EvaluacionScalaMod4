package main.scala.carlosMedina

object ejercicio2 extends App {

  final case class StringException(private val message: String = "exception",
                                    private val cause: Throwable = None.orNull)
    extends Exception(message, cause)

  def countCharacters(word:String):Int ={
    word match {
      case null => throw StringException("Your string is null")
      case "" => return 0; throw StringException("Your string is null")
      case _ => return countCharacters(word.substring(1)) + 1;
    }
  }
  println(countCharacters("w"))
}

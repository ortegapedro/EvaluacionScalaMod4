//By Gustavo Perez B
object Ejercicio2 extends App {
    // Function define
  var count = 0
    def countCharacters(word: String): Int = {
      try {
        if (word.isEmpty) {
          if (count == 0) {
            println("Your string is empty");
            return 0;
          } else {
            return count
          }
        } else {
          val c = word.head
          count = count + 1;
          println(c)
          countCharacters(word.tail)
        }
      }catch {
        case e: java.lang.NullPointerException => -1

      }
    }

  println("caracteres:",countCharacters("hola mundo"))
}
package main.scala.luisHermenegildo


import scala.util.{Failure, Random, Success, Try}
/**
 * Desarrollado por Luis Hermenegildo
 *
Ejercicio 2

Escriba una función recursiva, llamada “countCharacters”, que devuelva el
número de caracteres que componen a una cadena (String), misma que debe
ser el único parámetro que reciba. El valor de retorno debe ser de tipo Int.
Nota: Deberás atrapar la excepción que aplique para cada caso:
● Caso 1: La entrada es null, tu programa deberá imprimir “Your string is
null” y devolver un 0
● Caso 2: La entrada es una cadena vacía “”, tu programa deberá imprimir
“Your string is empty” y devolver un 0

 **/


object Ejercicio2 extends App{

  def countCharacters(word: String):Int = {
    if(word == null){
      try{
        throw new RuntimeException("Your string is null")
      }catch {
        case e: Exception => {
          println("Your string is null")
          0
        }
      }
    }else if (word.length == 0) {
      try{
        throw new RuntimeException("La entrada es una cadena vacía")
      }catch {
        case e: Exception => {
          println("La entrada es una cadena vacía")
          0
        }
      }
    }else if(word.length == 1) {
      1
    } else if (word.length > 1){
      1 + countCharacters(word.substring(0,word.length -1))
    }else{
      0
    }
  }

  var cadena = "Hola mundo segundo ejercicio en scala"
  //println(cadena.substring(0,cadena.length -1))
  println(s"El tamaño de la cadena es ${countCharacters(cadena)}")
  println(s"El tamaño de la cadena es ${countCharacters("")}")
  println(s"El tamaño de la cadena es ${countCharacters(null)}")
}

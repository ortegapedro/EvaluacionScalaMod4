package main.scala.dominguezAbimael

object Ejercicio4 {

  sealed trait Coatlicue
  case class Ixtlilton(start: String) extends Coatlicue {

    def diagnoticar_sistema(s: Any*): List[String] = {
      s.map(_.toString).toList
    }
    def changeState() = {

    }
  }
  case class Yacatecuhtli() extends Coatlicue
  case class Quetzalcoatl() extends Coatlicue

}

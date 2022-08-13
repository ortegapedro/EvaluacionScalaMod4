package main.scala.carlosMedina

object ejercicio4 extends App{

  class Ixliton(var estado: Boolean,var nombre: String, var fecha:String, var hora:String, var parametros:String*) {
    def diagnostico() = println("Ixtlilton:\nEjecutando sistema de inspección con los parámetros:" + parametros)

    def cambiarEstado(): Unit ={
      this.estado = !this.estado
    }

    def imprimirEstado() = {
      if (this.estado){
        println("Módulo Ixliton en funcionamiento")
      }else{
        println("Módulo Ixliton apagado")
      }
    }
  }

  class Yacatecuhtli(var estado: Boolean, var drones:Int, var territorio:String, var nombre: String, var fecha:String, var hora:String) {
    def diagnostico() = println(s"Yacatecuhtli:\nDesplegando $drones drones de reconocimiento en el territorio $territorio")

    def cambiarEstado(): Unit ={
      this.estado = !this.estado
    }

    def imprimirEstado() = {
      if (this.estado){
        println("Módulo Yacatecuhtli en funcionamiento")
      }else{
        println("Módulo Yacatecuhtli apagado")
      }

    }
  }

  class Quetzalcoatl(var estado: Boolean,var nombre: String, var fecha:String, var hora:String){
    def diagnostico() = {
      if (this.estado){
        println("Quetzalcóatl: Los sistemas dedefensa se encuentran activos.")
      }else{
        println("Quetzalcóatl: Los sistemas dedefensa se encuentran desactivados.")
      }
    }

    def cambiarEstado(): Unit ={
      if(!this.estado){
        println("Quetzalcóatl: Reactivando sistemas de defensa, tiempo estimado 1 minuto")
      }else{
        println("Quetzalcóatl: Sistemas de defensa desactivados")
      }
      this.estado = !this.estado
    }

    def imprimirEstado() = {
      if (this.estado){
        println("Módulo Quetzalcóatl en funcionamiento")
      }else{
        println("Módulo Quetzalcóatl apagado")
      }

    }
  }

  var ix = new Ixliton(true,"Ixliton","13/ago/22","13:51","Hola","Hola 2")
  println(ix.diagnostico())
  println(ix.imprimirEstado())
  var ya = new Yacatecuhtli(true,2, "Halo","Ixliton","13/ago/22","13:51")
  println(ya.diagnostico())
  var que = new Quetzalcoatl(true, "Quetzalcoatl","13/ago/22","13:51")
  println(que.diagnostico())
}

package main.scala.luisHermenegildo

import scala.collection.mutable.ListBuffer
import java.time.LocalDateTime

/**
 * Desarrollado por Luis Hermenegildo
 *
 * Ejercicio 4: Modelado POO
 * ● Como parte de un programa secreto has sido reclutado para ser uno de
*los mejores desarrolladores de software que existen en el mundo.
*● Después de contarte la situación que está azotando al planeta te dan a
*conocer parte de los requerimientos para construir un sistema de
*defensa que inicialmente contará con tres módulos principales
*(Ixtlilton, Yacatecuhtli, Quetzalcóatl) y un administrador de
*estos(Coatlicue).
*Módulos que conformarán el sistema:
*● Módulo 1 (Ixtlilton): Es uno de los módulos satélite que se encarga de
*realizar diagnósticos en el sistema garantizando el correcto
*funcionamiento del mismo. ○ Deberá contener un atributo que
*representará si el módulo se encuentra apagado o encendido.
*○ Deberá ser capaz de ejecutar una tarea de diagnóstico con los
*parámetros especificados
*■ La cantidad de parámetros que recibirá es variable y de
*tipo String.
*■ Basta con imprimir a través de consola lo siguiente "Ixtlilton:
*Ejecutando sistema de inspección con los parámetros: A, B,....,
*N".
*■ Donde: A, B,...., N son todos los parámetros ingresados.
*○ Debe proporcionar un método que permita cambiar el estado de
*apagado a encendido y viceversa.
*○ Debe proporcionar un método que imprima en pantalla el estado
*del módulo
*■ Ejemplo: "Módulo X apagado" y si está encendido imprimirá
*"Módulo X en funcionamiento".
 *
 *● Módulo 2 (Yacatecuhtli): Es uno de los módulos satélite que se encarga
*de realizar tareas de reconocimiento en terrenos hostiles.
*○ Deberá contener un atributo que representará si el módulo se
*encuentra apagado o encendido.
*○ Deberá ser capaz de ejecutar una tarea de reconocimiento con las
*siguientes características.
*○ Recibirá la cantidad de drones a desplegar así como el nombre del
*territorio en el cual se realizará la tarea de reconocimiento.
*○ Basta con imprimir a través de pantalla lo siguiente "Yacatecuhtli:
*Desplegando N drones de reconocimiento en el territorio X"
 *
 *● Donde:
*○ N: Número especificado.
*○ X: Nombre del territorio que se solicitó.
 *
 *○ Debe proporcionar un método que permita cambiar el estado de
*apagado a encendido y viceversa.
*○ Debe proporcionar un método que imprima en pantalla el estado
*del módulo
 *
 *■ Ejemplo: "Módulo X apagado" y si está encendido imprimirá
*"Módulo X en funcionamiento".
 *
 *● Módulo 3 (Quetzalcóatl): Módulo defensivo que permite desplegar un
*escudo de plasma capaz de absorber explosiones y proyectiles.
*○ Deberá contener un atributo que representará si el módulo se
*encuentra apagado o encendido.
*○ Debe proporcionar un método que:
*■ Cuando el módulo se encuentre apagado informará a través
*de un mensaje en pantalla: "Quetzalcóatl: Los sistemas de
*defensa se encuentran desactivados".
*■ Cuando el módulo se encuentre encendido se informará a
*través de un mensaje en pantalla: Quetzalcóatl: Los
*sistemas de defensa se encuentran activos".
 *
 *○ Debe proporcionar un método que permita cambiar el estado de
*apagado a encendido y viceversa.
*■ Cuando pasa de apagado a encendido deberá imprimir en
*pantalla: "Quetzalcóatl: Reactivando sistemas de defensa,
*tiempo estimado 1 minuto".
*■ Cuando el sistema se apaga deberá imprimir en pantalla:
*"Quetzalcóatl: Sistemas de defensa desactivados".
 *
 *Sistema manejador de Módulos(Coatlicue).
*Este sistema será el encargado de realizar el manejo de los módulos y deberá
*contar con las siguientes características:
*● Solo puede existir una instancia de Coatlicue.
*● Contará con una estructura que le permita añadir y/o quitar módulos
*al sistema. ● Un método que le permita añadir un módulo nuevo al
*sistema.
*● Un método que guarde el estado de todos los módulos y del mismo
*manejador (Ver punto 2).
*● Un método que le permita obtener una representación de todos los
*módulos manejados como un string separado por comas.
*Requerimientos:
*● Todos los componentes (Módulos y Coatlicue) del sistema de defensa
 *
 *deben contener atributos que representen su nombre, además de
*fecha y hora en que se crearon.
*● Todos los componentes (Módulos y Coatlicue) del sistema actual y
*futuros deberán tener la capacidad de guardar su estado
*○ Basta con imprimir a través de un log la estructura de la instancia
*como un String "Guardando el estado del componente:
*<Representación en String del componente>"
*■ Dónde: <Representación en String del componente>
*deberá contener el valor de todos sus atributos
*● La representación como string de Coatlicue sería:
*("Coatlicue", <Fecha y hora de instanciación>)
*■ Para los módulos deberá tener el formato (<name>,
*<creationDate>, <status>)
*● Por ejemplo para una instancia de Quetzalcoatl:
*("Quetzalcoatl1", <Fecha y hora de instanciación>,
*<false|true>)
 **/

case class Ixtlilton()extends Module (name="Ixtlilton"){
  def diagnostic(valor:String*): Unit ={
    if (estado) {
      for (v <- valor){
        println(s"Ejecutando diagnostico de ${v}...")
      }
    }else{
      println(s"Modulo ${name} apagado")
    }
  }


}
case class Yacatecuhtli() extends Module (name="Yacatecuhtli"){
  private var totalDrones:Integer = _
  private var territory:String = _
  def recognition(_totalDrones: Integer, _territory:String): Unit = {
    totalDrones=_totalDrones
    territory=_territory
    println(s"${name}:\nDesplegando ${totalDrones} drones de reconocimiento en el territorio ${territory}")
  }
}
case class Quetzalcoatl()extends Module (name="Quetzalcóatl"){
  override def changeEstado(): Unit = {
    setEstado(!estado)
    if (estado) {
      println(s"${name}: Reactivando sistemas de defensa, tiempo estimado 1 minuto.")
    } else {
      println(s"${name}: Sistemas de defensa desactivados")
    }
  }

  override def getEstado(): String = {
    if (estado) {
      s"${name}: Los sistemas de defensa se encuentran activos."
    } else {
      s"${name}: Los sistemas de defensa se encuentran desactivados."
    }
  }
  private  def setEstado(valor:Boolean):Unit={
    estado=valor
  }
}

class Module(var name:String){
  var estado: Boolean = true

  var creationDate: String = LocalDateTime.now().toString

  def changeEstado(): Unit ={
    setEstado(!estado)
  }

  def getEstado(): String ={
    if(estado){
      s"Modulo ${name} en funcionamiento"
    }else{
      s"Modulo ${name} apagado"
    }
  }
  private  def setEstado(valor:Boolean):Unit={
    estado=valor
  }

  def getCreationDate(): String ={
    "Fecha de creación " + creationDate
  }

  def getStructure():String={
    //s"Nombre: ${name}, Fecha y hora de creación ${creationDate}, Estado: ${estado}"
    s"${name},${creationDate},${estado}"
  }
}

object Coatlicue extends Module ("Coatlicue"){

  println("Esta primer sección muestra el correcto comportamiento de los puntos Modulo 1, Modulo2, Modulo3")
  /**
   * ******************
   */
  println("\n**********************\n")
  var ixt = Ixtlilton()
  println(ixt.getEstado())
  ixt.changeEstado()
  ixt.diagnostic("A","B","C","D","E")
  ixt.changeEstado()
  println(ixt.getEstado())
  ixt.diagnostic("A","B","C","D","E")
  /**
   * ******************
   */
  println("\n**********************\n")
  var yac = Yacatecuhtli()
  yac.recognition(50, "Estados Unidos")
  yac.changeEstado()
  println(yac.getEstado())
  yac.changeEstado()
  println(yac.getEstado())

  /**
   * ******************
   */
  println("\n**********************\n")
  var que = Quetzalcoatl()
  //yac.recognition(50, "Estados Unidos")
  que.changeEstado()
  println(que.getEstado())
  que.changeEstado()
  println(que.getEstado())

  var moduleList:ListBuffer[Module] = ListBuffer()

  def addModule(module:Module): Unit ={
    println(s"Agregando modulo ${module}")
    moduleList.addOne(module)
  }
  def removeModule(module:Module): Unit ={
    println(s"Eliminando modulo ${module}")
    moduleList.remove(moduleList.indexOf(module))
  }
  def getModules():Unit={
    println("Imprimiendo listado de modulos")
    println(moduleList)
    //moduleList.foreach(x=> print(x + ","))
  }
  override def getStructure(): String ={
    //s"Nombre: ${name}, Fecha y hora de creación ${creationDate}, Estado: ${estado}"
    s"${name},${creationDate}"
  }

  def getGeneralScructureModules():Unit={
    println("Imprimiendo Estructura general de los modulos:\n\n")
    //println(moduleList)
    println(getStructure())
    moduleList.foreach(x=> println(x.getStructure()))
  }

  System.out.println("=====================")
  System.out.println("Esta sección muestra el comportamiento del modulo Coatlicue")
  System.out.println("=====================")
  addModule(ixt)
  addModule(yac)
  addModule(que)
  getModules()
  removeModule(que)
  getModules()
  addModule(que)

  getGeneralScructureModules()
}


object Ejercicio4 extends App{
  Coatlicue
}
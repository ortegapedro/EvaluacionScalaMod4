package main.scala.luisHermenegildo
import scala.io.Source.fromFile
/**
 * Desarrollado por Luis Hermenegildo
 *
Ejercicio 1:
Una importante empresa inmobiliaria necesita una aplicación que sea capaz
de leer archivos csv para leer línea por línea el contenido y tomar dos
columnas de éste. Las columnas que se necesitan son: Location y Price.
Consideraciones:
● El archivo csv cuenta con cabecera y no es necesario tomarla en cuenta
al leer las líneas.
● El programa debe mostrar en pantalla solamente las dos
columnas.
● La columna Location contiene espacios en blanco, hay que
quitarlos.
● No puedes modificar el archivo csv de ninguna manera.
Para poder leer un archivo, necesitas importar la clase Source en el paquete
scala.io, para después hacer uso de su método fromFile que recibe el path al
archivo. El archivo a usar será RealEstate.csv, el cual estará en el classroom.

**/
object Ejercicio1 extends App {
  def parseFile(pathToFile:String)={
    val source = scala.io.Source.fromFile(pathToFile)
    val lines = try source.mkString.split("\n") finally source.close()
    for (line <- lines){
      if(line != lines(0)) {
        var columns = line.split(",")
        println(columns(1).replace(" ", "") + "," + columns(2))
      }
    }
  }

  var csvPath= "D:\\Documents\\Luis\\CIC\\BIG_DATA\\Documentos\\Modulo_4\\Examen\\EvaluacionScalaMod4\\src\\resources\\RealEstate.csv"
  parseFile(csvPath)
}

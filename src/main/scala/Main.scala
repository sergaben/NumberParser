import Logic.Converter

import scala.util.Random

/**
  *
  * @project NumberToWrittenEng
  * @author sergaben on 29/08/2018.
  *
  */

object Main extends App {

  val converter = new Converter
  val randomNumber = Random.nextInt(999999999)

  println(converter.printNumberAsText(randomNumber))

}

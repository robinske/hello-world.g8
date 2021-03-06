package $name$

import com.typesafe.config.{Config, ConfigFactory}
import scala.io.StdIn.readLine

object Main extends App {
  val config = ConfigFactory.load()
  val greeting = config.getString("my.special.greeting")
  val name = readLine("What is your name? ")

  println(s"\$greeting, \$name!")
}

package org.alma.genielogiciel.scalatextedit

/**
 * Created by Maxime on 10/11/14.
 */
class Clipboard extends Buffer[String] {

  def run(command : String): Unit = {
    current = command
    history += command
  }

}

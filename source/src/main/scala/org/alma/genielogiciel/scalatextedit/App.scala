package org.alma.genielogiciel.scalatextedit

import org.alma.genielogiciel.scalatextedit.command._

/**
 * Created by Maxime on 10/11/14.
 */
object App {
  
  def main(args : Array[String]) {
    val textEdit = new Workspace
    textEdit.run(new WriteCommand("lol"))
    textEdit.run(new WriteCommand("."))
    textEdit.run(new WriteCommand("-"))
    textEdit.run(new CancelCommand())
    textEdit.run(new WriteCommand("p"))
    textEdit.run(new CancelCommand())
    textEdit.run(new RedoCommand(1))
    textEdit.run(new WriteCommand("*"))
  }

}

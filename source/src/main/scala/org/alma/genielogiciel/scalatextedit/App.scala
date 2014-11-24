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
    textEdit.run(new CancelCommand(2))
    textEdit.run(new WriteCommand("-"))
    textEdit.run(new WriteCommand("poijuythop"))
    textEdit.run(new SelectionCursorCommand(3,6))
    textEdit.run(new CutCommand)
    textEdit.run(new WriteCommand("--"))
    textEdit.run(new SimpleCursorCommand(0))
    textEdit.run(new PasteCommand)
    textEdit.run(new WriteCommand("*"))
  }

}

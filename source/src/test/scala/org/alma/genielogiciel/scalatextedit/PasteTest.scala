package org.alma.genielogiciel.scalatextedit

import org.alma.genielogiciel.scalatextedit.command.{PasteCommand, CopyCommand, SelectionCursorCommand, WriteCommand}
import org.junit.Assert._
import org.junit.Test

/**
 * Created by Maxime on 29/11/14.
 */
@Test
class PasteTest {
  @Test
  def test() = {
    val textEdit = new Workspace
    textEdit.run(new WriteCommand(".."))
    textEdit.run(new SelectionCursorCommand(0, 2))
    textEdit.run(new CopyCommand)
    textEdit.run(new WriteCommand("aa"))
    assertEquals(textEdit.current,"aa")
    textEdit.run(new PasteCommand)
    assertEquals(textEdit.current,"aa..")
  }
}

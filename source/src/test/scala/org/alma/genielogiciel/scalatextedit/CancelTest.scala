package org.alma.genielogiciel.scalatextedit

import org.alma.genielogiciel.scalatextedit.command.{CancelCommand, SelectionCursorCommand, SimpleCursorCommand, WriteCommand}
import org.junit.Assert._
import org.junit.Test

/**
 * Created by Maxime on 29/11/14.
 */
@Test
class CancelTest {
  @Test
  def test() = {
    val textEdit = new Workspace
    textEdit.run(new WriteCommand(".."))
    textEdit.run(new WriteCommand("a"))
    textEdit.run(new CancelCommand)
    assertEquals(textEdit.current,"..")
    textEdit.run(new CancelCommand)
    textEdit.run(new WriteCommand("bb"))
    assertEquals(textEdit.current,"bb")
  }
}

package org.alma.genielogiciel.scalatextedit

import org.alma.genielogiciel.scalatextedit.command.{DeleteCommand, SelectionCursorCommand, SimpleCursorCommand, WriteCommand}
import org.junit.Assert._
import org.junit.Test

/**
 * Created by Maxime on 29/11/14.
 */
@Test
class DeleteTest {
  @Test
  def test() = {
    val textEdit = new Workspace
    textEdit.run(new WriteCommand(".a"))
    textEdit.run(new SimpleCursorCommand(1))
    textEdit.run(new DeleteCommand())
    assertEquals(textEdit.current,"a")
  }

  @Test
  def test1() = {
    val textEdit = new Workspace
    textEdit.run(new WriteCommand(".a"))
    textEdit.run(new SelectionCursorCommand(0,2))
    textEdit.run(new DeleteCommand())
    assertEquals(textEdit.current,"")
  }
}

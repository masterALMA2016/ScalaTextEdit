package org.alma.genielogiciel.scalatextedit

import org.alma.genielogiciel.scalatextedit.command.{SelectionCursorCommand, SimpleCursorCommand, WriteCommand}
import org.junit.Assert._
import org.junit.Test

/**
 * Created by Maxime on 29/11/14.
 */
@Test
class WriteTest {
  @Test
  def test() = {
    val textEdit = new Workspace
    textEdit.run(new WriteCommand(".."))
    assertEquals(textEdit.current,"..")
    textEdit.run(new SimpleCursorCommand(1))
    textEdit.run(new WriteCommand("o"))
    assertEquals(textEdit.current,".o.")
    textEdit.run(new SelectionCursorCommand(1,2))
    textEdit.run(new WriteCommand("p"))
    assertEquals(textEdit.current,".p.")
  }
}

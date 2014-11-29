package org.alma.genielogiciel.scalatextedit

import org.alma.genielogiciel.scalatextedit.command.{CutCommand, CopyCommand, SelectionCursorCommand, WriteCommand}
import org.junit.Assert._
import org.junit.Test

/**
 * Created by Maxime on 29/11/14.
 */
@Test
class CutTest {
  @Test
  def test() = {
    val textEdit = new Workspace
    textEdit.run(new WriteCommand(".aa."))
    textEdit.run(new SelectionCursorCommand(1, 3))
    textEdit.run(new CutCommand)
    assertEquals(textEdit.current,"..")
    assertEquals(textEdit.clipboad.current,"aa")
  }
}

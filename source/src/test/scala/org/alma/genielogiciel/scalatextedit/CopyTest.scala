package org.alma.genielogiciel.scalatextedit

import org.alma.genielogiciel.scalatextedit.command._
import org.junit.Assert._
import org.junit.Test

/**
 * Created by Maxime on 29/11/14.
 */
@Test
class CopyTest {
  @Test
  def test() = {
    val textEdit = new Workspace
    textEdit.run(new WriteCommand(".."))
    textEdit.run(new SelectionCursorCommand(0, 2))
    textEdit.run(new CopyCommand)
    assertEquals(textEdit.current,"..")
    assertEquals(textEdit.clipboad.current,"..")
  }
}

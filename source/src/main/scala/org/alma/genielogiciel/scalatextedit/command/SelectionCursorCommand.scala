package org.alma.genielogiciel.scalatextedit.command

import org.alma.genielogiciel.scalatextedit.{SelectionCursor, Workspace}

/**
 * Created by Maxime on 22/11/14.
 */
class SelectionCursorCommand(var start : Int, var end : Int) extends Command {
  def execute(w: Workspace): Unit = {
    w.cursor = new SelectionCursor(start, end)
  }
}
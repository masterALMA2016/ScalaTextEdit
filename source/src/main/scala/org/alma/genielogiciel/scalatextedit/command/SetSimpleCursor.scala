package org.alma.genielogiciel.scalatextedit.command

import org.alma.genielogiciel.scalatextedit.{SimpleCursor, Workspace}

/**
 * Created by Maxime on 22/11/14.
 */
class SetSimpleCursor(var pos : Int) extends Command {
  def execute(w: Workspace): Unit = {
    w.cursor = new SimpleCursor(pos)
  }
}

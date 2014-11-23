package org.alma.genielogiciel.scalatextedit.command

import org.alma.genielogiciel.scalatextedit.{SimpleCursor, Workspace}

/**
 * Created by Maxime on 22/11/14.
 */
class InitializeCommand extends Command{
  def execute(w: Workspace): Unit = {
    w.cursor = new SimpleCursor(0)
    w.current = ""
  }
}

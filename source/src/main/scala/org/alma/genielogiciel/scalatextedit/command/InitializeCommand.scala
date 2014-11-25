package org.alma.genielogiciel.scalatextedit.command

import org.alma.genielogiciel.scalatextedit.{CommandException, SimpleCursor, Workspace}

/**
 * Created by Maxime on 22/11/14.
 */
class InitializeCommand extends Command {
  def execute(w: Workspace): Unit = {
    w.cursor = new SimpleCursor(0)
    w.current = ""
  }

  override def remove(): Unit = {
    throw new CommandException("Impossible de supprimer cette action ou bien il n'y a pas d'action à supprimer")
  }
}

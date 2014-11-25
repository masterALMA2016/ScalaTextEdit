package org.alma.genielogiciel.scalatextedit.command

import org.alma.genielogiciel.scalatextedit.{SelectionCursor, SimpleCursor, Workspace}

/**
 * Created by Maxime on 22/11/14.
 */
abstract class DefaultCommand extends CancellableCommand {

  def execute(w : Workspace): Unit = {
    w.cursor match {
      case c: SimpleCursor => simpleExecute(c : SimpleCursor, w)
      case c: SelectionCursor => selectionExecute(c : SelectionCursor, w)
    }
  }

  def simpleExecute(cursor : SimpleCursor, w : Workspace): Unit

  def selectionExecute(cursor : SelectionCursor, w : Workspace): Unit

}

package org.alma.genielogiciel.scalatextedit

/**
 * Created by Maxime on 10/11/14.
 */
trait Command {

  def execute(cursor : Cursor, w : Workspace): String = {
    cursor match {
      case c: SimpleCursor => simpleExecute(c : SimpleCursor, w)
      case c: SelectionCursor => selectionExecute(c : SelectionCursor, w)
    }
  }

  def simpleExecute(cursor : SimpleCursor, w : Workspace): String

  def selectionExecute(cursor : SelectionCursor, w : Workspace): String

}

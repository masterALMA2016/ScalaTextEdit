package org.alma.genielogiciel.scalatextedit.command

import org.alma.genielogiciel.scalatextedit.{SelectionCursor, Workspace, SimpleCursor}

/**
 * Created by Maxime on 24/11/14.
 */
class PasteCommand  extends DefaultCommand {

  def simpleExecute(cursor : SimpleCursor, w : Workspace): Unit = {
    val t1 = w.current.substring(0, cursor.pos)
    val t2 = w.current.substring(cursor.pos, w.current.length)
    w.current = t1 + w.clipboad.current + t2;
    w.cursor = new SimpleCursor(w.clipboad.current.length)
  }

  def selectionExecute(cursor : SelectionCursor, w : Workspace): Unit = {
    val t1 = w.current.substring(0, cursor.start)
    val t2 = w.current.substring(cursor.end, w.current.length)
    w.current = t1 + w.clipboad.current + t2
    w.cursor = new SimpleCursor(w.clipboad.current.length)
  }

}
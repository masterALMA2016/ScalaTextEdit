package org.alma.genielogiciel.scalatextedit.command

import org.alma.genielogiciel.scalatextedit.{SelectionCursor, Workspace, SimpleCursor}

/**
 * Created by Maxime on 24/11/14.
 */
class CutCommand extends DefaultCommand {

  def simpleExecute(cursor : SimpleCursor, w : Workspace): Unit = {

  }

  def selectionExecute(cursor : SelectionCursor, w : Workspace): Unit = {
    val t1 = w.current.substring(0, cursor.start)
    val t2 = w.current.substring(cursor.end, w.current.length)
    w.clipboad.run(w.current.substring(cursor.start, cursor.end))
    w.current = t1 + t2
    w.cursor = new SimpleCursor(cursor.start)
  }

}
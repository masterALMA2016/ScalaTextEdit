package org.alma.genielogiciel.scalatextedit.command

import org.alma.genielogiciel.scalatextedit.{SelectionCursor, SimpleCursor, Workspace}

/**
 * Created by Maxime on 10/11/14.
 */
class WriteCommand(str : String) extends DefaultCommand {

  def simpleExecute(cursor : SimpleCursor, w : Workspace): Unit = {
    val t1 = w.current.substring(0, cursor.pos)
    val t2 = w.current.substring(cursor.pos, w.current.length)
    w.current = t1 + str + t2;
  }

  def selectionExecute(cursor : SelectionCursor, w : Workspace): Unit = {
    val t1 = w.current.substring(0, cursor.start)
    val t2 = w.current.substring(cursor.end, w.current.length)
    w.current = t1 + str + t2
  }

}

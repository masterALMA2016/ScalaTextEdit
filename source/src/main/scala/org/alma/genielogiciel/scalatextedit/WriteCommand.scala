package org.alma.genielogiciel.scalatextedit

/**
 * Created by Maxime on 10/11/14.
 */
class WriteCommand(str : String) extends Command {

  def simpleExecute(cursor : SimpleCursor, w : Workspace): String = {
    val t1 = w.current.substring(0, cursor.pos)
    val t2 = w.current.substring(cursor.pos, w.current.length)
    return t1 + str + t2;
  }

  def selectionExecute(cursor : SelectionCursor, w : Workspace): String = {
    val t1 = w.current.substring(0, cursor.start)
    val t2 = w.current.substring(cursor.end, w.current.length)
    return t1 + str + t2;
  }

}

package org.alma.genielogiciel.scalatextedit.command

import org.alma.genielogiciel.scalatextedit.{SelectionCursor, Workspace, SimpleCursor}

/**
 * Created by Maxime on 24/11/14.
 */
class CopyCommand extends DefaultCommand {

  def simpleExecute(cursor : SimpleCursor, w : Workspace): Unit = {

  }

  def selectionExecute(cursor : SelectionCursor, w : Workspace): Unit = {
    w.clipboad.run(w.current.substring(cursor.start, cursor.end))
  }

}

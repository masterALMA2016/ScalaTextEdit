package org.alma.genielogiciel.scalatextedit

/**
 * Created by Maxime on 10/11/14.
 */
class Workspace extends Buffer[Command] {
  private def clipboad = new Clipboard

  var cursor : Cursor = new SimpleCursor(0)

  def run(command : Command): Unit = {
    current = command.execute(cursor, this)
    history :+= command
    println(current)
  }

}

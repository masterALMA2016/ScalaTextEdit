package org.alma.genielogiciel.scalatextedit

/**
 * Created by Maxime on 11/11/14.
 */
class SimpleCursor(var pos : Int) extends Cursor {
  def update(w :Workspace) : Unit = {
    if(pos > w.current.length)
      pos = w.current.length
  }
}

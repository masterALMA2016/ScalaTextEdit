package org.alma.genielogiciel.scalatextedit

/**
 * Created by Maxime on 11/11/14.
 */
class SelectionCursor(var start : Int, var end : Int) extends Cursor {

  def update(w :Workspace) : Unit = {
    if(start > w.current.length && end > w.current.length)
      w.cursor = new SimpleCursor(w.current.length)
    else {
      if(start > w.current.length)
        start =  w.current.length
      else {
        if(end > w.current.length)
          end =  w.current.length
      }
    }
  }

}

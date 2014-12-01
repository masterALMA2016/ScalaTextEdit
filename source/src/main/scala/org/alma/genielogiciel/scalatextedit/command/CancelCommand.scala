package org.alma.genielogiciel.scalatextedit.command

import org.alma.genielogiciel.scalatextedit.{CommandException, Workspace}

/**
 * Created by Maxime on 22/11/14.
 */
class CancelCommand(var cancelNext : Int) extends UncancelableCommand with UnrecordableCommand {

  def this() {
    this(1)
  }

  def execute(w: Workspace): Unit = {
    var t = 1;
    for ( a <- 0 until w.history.length) {
      val id = w.history.length-t-a
      if (cancelNext > 0 && w.history(id).isCancelable) {
        w.history(id).remove()
        w.history.remove(id)
        cancelNext -= 1
        t -= 1;
      }
    }
    w.executeAll();
  }
}

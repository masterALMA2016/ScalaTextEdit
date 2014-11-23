package org.alma.genielogiciel.scalatextedit.command

import org.alma.genielogiciel.scalatextedit.Workspace

/**
 * Created by Maxime on 22/11/14.
 */
class CancelCommand(var cancelNext : Int) extends Command with ObservableCommand{

  def this() {
    this(1)
  }

  def execute(w: Workspace): Unit = {
    for ( a <- 0 until w.history.length) {
      if (w.history(w.history.length-1-a).isInstanceOf[CancellableCommand] && cancelNext > 0 && w.history(w.history.length-1-a).isRun) {
        w.history(w.history.length-1-a).isRun = false
        cancelNext -= 1
      }
    }
    for (command <- w.history) {
      if(command.isRun && !command.isInstanceOf[CancelCommand]) {
        command.execute(w)
      }
    }
  }
}

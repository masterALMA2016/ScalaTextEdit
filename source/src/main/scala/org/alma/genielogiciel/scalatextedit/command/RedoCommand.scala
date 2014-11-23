package org.alma.genielogiciel.scalatextedit.command

import org.alma.genielogiciel.scalatextedit.{CommandException, Workspace}

/**
 * Created by Maxime on 22/11/14.
 */
class RedoCommand(var redoNext : Int) extends Command with ObservableCommand{
  def this() {
    this(1)
  }

  def execute(w: Workspace): Unit = {
    if (!w.history(w.history.length-1).isInstanceOf[RedoCommand] && !w.history(w.history.length-1).isInstanceOf[CancelCommand])
      throw new CommandException("Impossible de faire un redo, cette fonction est possible après une commande d'annulation ou de redo")
    var start = 0
    for ( a <- 0 until w.history.length) {
      if (w.history(w.history.length-1-a).isInstanceOf[CancelCommand] && start == 0) {
        start = w.history.length-1-a
      }
    }
    for ( a <- 0 until start) {
      if (redoNext > 0 && w.history(start-1-a).isInstanceOf[CancellableCommand] && !w.history(start-1-a).isRun) {
        w.history(start-1-a).isRun = true
        redoNext -= 1
      }
    }
    for (command <- w.history) {
      if(command.isRun && !command.isInstanceOf[CancelCommand] && !command.isInstanceOf[RedoCommand]) {
        command.execute(w)
      }
    }
  }
}

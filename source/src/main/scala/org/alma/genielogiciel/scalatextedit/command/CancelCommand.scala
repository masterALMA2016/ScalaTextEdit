package org.alma.genielogiciel.scalatextedit.command

import org.alma.genielogiciel.scalatextedit.{CommandException, Workspace}

/**
 * Created by Maxime on 22/11/14.
 */
class CancelCommand(var cancelNext : Int) extends Command with ObservableCommand{

  def this() {
    this(1)
  }

  def execute(w: Workspace): Unit = {
    var t = 1;
    for ( a <- 0 until w.history.length) {
      val id = w.history.length-t-a
      if (cancelNext > 0) {
        if(w.history(id).isInstanceOf[UncancellableCommand])
          throw new CommandException("Impossible de supprimer cette action ou bien il n'y a pas d'action à supprimer")
        if(w.history(id).isInstanceOf[CancellableCommand])
          cancelNext -= 1
        w.history.remove(id)
        t -= 1;
      }
    }
    w.executeAll();
  }
}

package org.alma.genielogiciel.scalatextedit

import org.alma.genielogiciel.scalatextedit.command.{CancelCommand, InitializeCommand, Command}

/**
 * Created by Maxime on 10/11/14.
 */
class Workspace extends Buffer[Command] with Observable[Workspace]{
  var clipboad = new Clipboard

  var cursor : Cursor = null

  {
    var init = new InitializeCommand
    init.execute(this)
    history += init
  }

  def run(command : Command): Unit = {
    command.execute(this)
    this.notifyObservers()
    history += command
  }

  def executeAll(): Unit = {
    for (command <- this.history) {
      if(command.isCancelable)
        command.execute(this)
    }
  }


}

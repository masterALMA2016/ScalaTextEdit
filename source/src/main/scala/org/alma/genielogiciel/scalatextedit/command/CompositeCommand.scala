package org.alma.genielogiciel.scalatextedit.command

import org.alma.genielogiciel.scalatextedit.Workspace

/**
 * Created by Maxime on 22/11/14.
 */
class CompositeCommand extends Command {

  var compose: Seq[Command] = Seq.empty

  def execute(w: Workspace): Unit = {
    for (command <- compose) {
      command.execute(w)
    }
  }

  def add(command : Command): Unit = {
    compose :+ command
  }
}

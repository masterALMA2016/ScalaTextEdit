package org.alma.genielogiciel.scalatextedit.command

import org.alma.genielogiciel.scalatextedit.Workspace

/**
 * Created by Maxime on 10/11/14.
 */
trait Command {

  var isRun = true

  def execute(w : Workspace): Unit

}

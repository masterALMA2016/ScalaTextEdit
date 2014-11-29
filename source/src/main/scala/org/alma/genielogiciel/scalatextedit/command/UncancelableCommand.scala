package org.alma.genielogiciel.scalatextedit.command

/**
 * Created by Maxime on 29/11/14.
 */
trait UncancelableCommand extends Command {
  override val isCancelable = false
}

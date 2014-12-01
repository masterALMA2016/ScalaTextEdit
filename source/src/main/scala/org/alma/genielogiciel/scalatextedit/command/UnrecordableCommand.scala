package org.alma.genielogiciel.scalatextedit.command

/**
 * Created by Maxime on 01/12/14.
 */
trait UnrecordableCommand extends Command {
  override val isRecordable = false
}
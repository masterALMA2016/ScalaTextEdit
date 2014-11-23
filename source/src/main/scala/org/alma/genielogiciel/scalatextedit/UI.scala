package org.alma.genielogiciel.scalatextedit

/**
 * Created by Maxime on 23/11/14.
 */
class UI extends Observer[Workspace]{
  def receiveUpdate(subject: Workspace): Unit = {
    println(subject.current)
  }
}

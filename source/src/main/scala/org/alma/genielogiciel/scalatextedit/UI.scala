package org.alma.genielogiciel.scalatextedit

/**
 * Created by Maxime on 23/11/14.
 */
class UI extends Observer[Workspace]{
  def receiveUpdate(w: Workspace): Unit = {
    println(w.current)
  }
}

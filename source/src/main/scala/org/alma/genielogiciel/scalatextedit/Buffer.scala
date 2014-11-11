package org.alma.genielogiciel.scalatextedit

/**
 * Created by Maxime on 10/11/14.
 */
abstract class Buffer[T] {

  var history: Seq[T] = Seq.empty
  var current = ""

  def run(command: T)

}

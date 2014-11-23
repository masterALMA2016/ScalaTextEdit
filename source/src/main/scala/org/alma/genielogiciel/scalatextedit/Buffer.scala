package org.alma.genielogiciel.scalatextedit

import scala.collection.mutable.ListBuffer

/**
 * Created by Maxime on 10/11/14.
 */
abstract class Buffer[T] {

  var history: ListBuffer[T] = new ListBuffer[T]()
  var current = ""

  def run(command: T)

}

package org.alma.genielogiciel.scalatextedit

/**
 * Created by Maxime on 23/11/14.
 */
trait Observer[S] {
  def receiveUpdate(subject: S);
}

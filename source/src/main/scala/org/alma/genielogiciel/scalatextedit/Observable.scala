package org.alma.genielogiciel.scalatextedit

import org.alma.genielogiciel.scalatextedit.Observer

/**
 * Created by Maxime on 22/11/14.
 */
trait Observable[S] {
  this: S =>
  private var observers: List[Observer[S]] = Nil
  def addObserver(observer: Observer[S]) = observers = observer :: observers

  def notifyObservers() = observers.foreach(_.receiveUpdate(this))
}

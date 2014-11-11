package org.alma.genielogiciel.scalatextedit

/**
 * Created by Maxime on 10/11/14.
 */
object App {
  
  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)
  
  def main(args : Array[String]) {
    println( "Hello World!" )
    val textedit = new Workspace
    textedit.run(new WriteCommand("lol"))
    textedit.cursor = new SelectionCursor(1,2)
    textedit.run(new WriteCommand("."))

  }

}

// src/main/scala/progscala2/traits/ui/Observer.scala
package progscala2.traits.observer

trait Observer[-State] {
  def receiveUpdate(state: State): Unit
}

trait Subject[State] {
  private var observers: List[Observer[State]] = Nil

  def addObserver(observer: Observer[State]): Unit =
    observers ::= observer

  def notifyObservers(state: State): Unit =
    observers foreach (_.receiveUpdate(state))
}

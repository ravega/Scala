package ravega.store

import scala.scalajs.js
import js.annotation.JSExport
import org.scalajs.dom
import scala.scalajs.js.annotation.JSExportTopLevel

object StoreMain {
	def main(args: Array[String]): Unit = {
			println("Hello world!")

			val paragraph = dom.document.createElement("p")
			paragraph.innerHTML = "<strong>It works!</strong>"
			dom.document.getElementById("playground").appendChild(paragraph)

			val p = paragraph.asInstanceOf[ElementExt]
	}

	def appendPar(targetNode: dom.Node, text: String): Unit = {
			val parNode = dom.document.createElement("p")
			val textNode = dom.document.createTextNode(text)
			parNode.appendChild(textNode)
			targetNode.appendChild(parNode)
	}

	@JSExportTopLevel("addClickedMessage")
	def addClickedMessage(): Unit = {
			appendPar(dom.document.body, "You clicked the button!")
	}
}
/*
@js.native
trait EventName extends js.Object {
  type EventType <: dom.Event
}

object EventName {
  def apply[T <: dom.Event](name: String): EventName { type EventType = T } =
    name.asInstanceOf[EventName { type EventType = T }]

  val onmousedown = apply[dom.MouseEvent]("onmousedown")
}

@js.native
trait ElementExt extends js.Object {
  def addEventListener(name: EventName)(
      f: js.Function1[name.EventType, _]): Unit
}

object StoreMain extends js.JSApp {
  def main(): Unit = {
    val paragraph = dom.document.createElement("p")
    paragraph.innerHTML = "<strong>It works!</strong>"
    dom.document.getElementById("playground").appendChild(paragraph)

    val p = paragraph.asInstanceOf[ElementExt]
  }

  /** Computes the square of an integer.
   *  This demonstrates unit testing.
   */
  def square(x: Int): Int = x*x
}
*/
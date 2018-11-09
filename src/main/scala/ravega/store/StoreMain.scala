package ravega.store

import scala.scalajs.js
import js.annotation.JSExport
import org.scalajs.dom
import org.scalajs.dom.html
import scalatags.JsDom.all._
import scalajs.js.annotation.JSExport
import scala.scalajs.js.annotation.JSExportTopLevel

object StoreMain {
  
  var bookList = new MockData();
   
	def main(args: Array[String]): Unit = {
			println("Start")

			dom.document.getElementById("actiondiv").appendChild(renderActions)
		  dom.document.getElementById("bookdiv").appendChild(renderBooks)
	}

	def renderActions = div(id := "alist")(
					div(input(
				    `type`:="text",
				    `id`:="bookname",
				    placeholder:="Boook name"
				  ), input(
				    `type`:="text",
				    `id`:="bookprice",
				    placeholder:="€"
				  ))
				).render

	def renderBooks = div(id := "blist")(
					//h1("My books:"),
					//p("Check following books."),
	    table(style:="border:1px solid black;")(
	        tr(
	            th("Name"),
	            th("Price")),
      for (book <- bookList.books) yield tr(
       		  td(book.name),
       		  td(book.price)
       	)
			)).render

	@JSExportTopLevel("addClickedMessage")
	def addClickedMessage(): Unit = {
	    val bookName = dom.document.getElementById("bookname").asInstanceOf[html.Input].value.toString
	    val bookPrice = dom.document.getElementById("bookprice").asInstanceOf[html.Input].value.toInt
	    val b = new Book(bookName, bookPrice)
	    bookList.books += b
	    println("Added: " + b.toString())
	    
	    dom.document.getElementById("bookdiv").removeChild(dom.document.getElementById("blist"))
	    dom.document.getElementById("bookdiv").appendChild(renderBooks)
	}
}
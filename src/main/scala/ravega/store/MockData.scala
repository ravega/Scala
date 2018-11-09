package ravega.store

import scala.collection.mutable.ListBuffer

class MockData {
  var books: ListBuffer[Book] = ListBuffer( new Book("Linux", 10), new Book("Java 8", 30) )
}
package ravega.store

class Book(var name: String, var price: Int) {
  
  override
  def toString(): String = {
    return "Book name: " + name + " is " + price + "€"
  }
}
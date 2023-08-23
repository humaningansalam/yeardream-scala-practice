import jdk.jfr.DataAmount

//Class
class Book(var title: String, var author: String)

val book1 = new Book("title", "author")
println(book1.title,book1.author)
val book2 = new Book(title = "titile", author = "author")
println(book2.title,book2.author)
book2.title = "new title"
println(book2.title, book2.author)


class Book(val title: String, val author: String)
val book2 = new Book(author = "author", title = "title")
println(book2.title, book2.author)
//book2.title = "new title"
println(book2.title, book2.author)



//traints

trait Car {
  val name: String

  def engineStart(): Unit = println("Engine Start")

  def engineStop(): Unit
}

class Sedan(val name: String) extends Car {
  def engineStop(): Unit = println("Engine Stop")
}


class Suv(val name: String) extends Car {
  override def engineStart() = println("Engine Start by custom")

  def engineStop() = println("Engine Stop")
}

trait PaymentModule{
  def collectPayment(amount: Int): Unit
}

class Bus(val name: String) extends Car with PaymentModule{
  override def engineStop(): Unit = println("Engine Stop")

  override def collectPayment(amount: Int): Unit = println(s"paid ${amount} won")
}

val sedan: Car = new Sedan("sonata")
val suv: Car = new Suv("GV80")
val bus: Car = new Bus("Tayo")

bus.asInstanceOf[PaymentModule].collectPayment(12000)

val cars = List(sedan, suv, bus)

cars.foreach(it =>{
  println(s"----${it.name}")
  it.engineStart()
  it.engineStop()

  it match {
    case module: PaymentModule=>
      module.collectPayment(1600)
    case _ =>
  }
})




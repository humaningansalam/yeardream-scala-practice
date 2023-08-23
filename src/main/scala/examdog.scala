package org.yeardream.scala

class Dog(name: String) {
  def bark = println("bark! bark!")
}

object Dog {
  val age = 2
  def barkable = true
  def apply(name: String) = new Dog(name)
}


object examdog {
  def main(args: Array[String]): Unit = {
    val dog = Dog("dog1")
    val dogClass = dog.getClass
    dogClass.getDeclaredFields.foreach(println)
    dogClass.getDeclaredMethods.foreach(println)
  }

}

//option
def upperString(value: String): Option[String] = {
  val _value = Option.apply(value)
  if(_value.nonEmpty) {
    if (_value.get.trim.isEmpty) None
    else Some(_value.get.toUpperCase)
  } else None
}
upperString(null)
upperString("").isEmpty
upperString("").isDefined
// NoSuchElementException upperString("").get
upperString("").getOrElse("default")
upperString("val").isEmpty
upperString("val").isDefined
println(upperString("val").get)


val list = List(Some(1), None, Some(2), null)
for (Some(i) <- list) yield i

//either
def upperString(value: String): Either[String, String] = {
  val _value = Option.apply(value)
  if(_value.nonEmpty) {
    if (_value.get.trim.isEmpty) Left("Value cannot be empty")
    else Right(_value.get.toUpperCase)
  } else Left("Value cannot be null")
}

upperString(null)
// NoSuchElementException
upperString("")
upperString("").getOrElse("default")
upperString("val")


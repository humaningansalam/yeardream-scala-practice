println(List(1,2,3))
println(List(1,2,3).toString())

val originList = List(1,2,3)
val plusOneList = originList.map(_.toString + "hi")
val oddList = originList.filter(_ % 2 == 1)
println(oddList)

originList ne plusOneList

originList.groupBy(_ % 2)

val words = List("I", "am", "a", "boy")
words.reduce((prev, next) => prev + " " + next)

val wordList = List("apple", "basket", "candy") // 5, 6, 5
val lengthAccum: (Int, String) => Int = (accum, word) => accum + word.length
val letterCount = wordList.aggregate(0)(lengthAccum, _ + _)



//Array
Array(1,2,3) :+ 4
4 +: Array(1,2,3)

Array(1,2,3).toSeq
Array(1,2,3).toIndexedSeq




var myMatrix = Array.ofDim[Int](3, 3)

// build a matrix
for (i <- 0 to 2) {
  for (j <- 0 to 2) {
    myMatrix(i)(j) = j;
  }
}

// Print two dimensional array
for (i <- 0 to 2) {
  for (j <- 0 to 2) {
    print(" " + myMatrix(i)(j));
  }
  println();
}


val matrixFill = Array.fill(3, 2)(0)
val matrixTabulate = Array.tabulate(3, 5) { case (_, c) => c }

//def evenElems[T](xs: Vector[scala.reflect.ClassTag]): Array[T] = {
//  val arr = new Array[T]((xs.length + 1) / 2)
//  for (i <- 0 until xs.length by 2)
//    arr(i / 2) = xs(i)
//  arr
//}
//
//evenElems(Vector(1, 2, 3, 4))

//Extract 기능
val tup = ("hello world", 42)
tup match {
  case (s,i) =>
    println("the string was " + s)
    println("the number was " + i)
}

val xs = List(1, 2, 3, 4, 5, 6)
xs match {
  case h :: t => println(h :: t)
  case _ => println("not in list")
  // h is the head: 1
  // t is the tail: 2,3,4,5,6
  // The :: above is also an example of matching with an INFIX TYPE
}

case class Person(name: String, age: Int)

val p = Person("John Doe", 42)
p match {
  //only extracting the name here, the match would fail if the age wasn't 42
  case Person(name, 42) => println("matching: " + name)
  case _ => println("this person is not aged 42.")
}


def example(anything: Int): String = anything match {
  // anything 이 0 이면 호출됩니다.
  case 0 => "Matched 0!"

  // anything 이 1 이면 호출됩니다.
  case 1 => "Matched 1!"

  // anything 이 0도 1도 아닐 때 디폴트로 호출됩니다.
  case _ => "Oops! No match!"
}

val case0: String = example(0)
println(case0) // "Matched 0!"

val case1: String = example(1)
println(case1) // "Matched 1!"

val case2: String = example(2)
println(case2) // "Oops! No match!"

//val casestring0: Int = example(0) // Not allowed!
//val casestring0: String = example("0") // Not allowed!


//반복문
val nums: List[Int] = List(1,2,3,4,5)

for (num <- nums) println(num)

nums.foreach(it => println(it))
nums.foreach(println(_))
nums.foreach(println)


val numbers = Map(
  "one" -> 1,
  "two" -> 2,
  "three" -> 3
)
for ((key, value) <- numbers) println(s"Number $key : $value")

wordList.zip(0 until wordList.size).foreach(println)

//반복식
val doubleNumbersWithYield = for (num <- nums) yield num * 2
println(doubleNumbersWithYield)

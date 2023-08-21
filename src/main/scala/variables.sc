var name = "john"
println(name)
name = "42"

//val name = "jhone"
//name = "new jhone"

val name = "jhone" + "aria"

val list: List[Any] = List(
  "a string",
  732,
  () => "an anonymous function returning a string"
)
list.foreach(element => println(element))

val intList: List[Any] = List(1,2,3, "4")
intList.foreach(println)

val x: Long = 987654321
val y: Float = x.toFloat
val face: Char = '☺'
val number: Int = face.toInt // 9786


type Row = Vector[Int]
type Matrix = Vector[Row]

//산술 연산자
var a: Int = 3
var b: Int = 5
println(a + b)
println(a - b)
println(a * b)
println(a / b)
println(a % b)


//대입 연산자
a += b
println(a)
a -= b
println(a)
a *= b
println(a)
a /= b
println(a)
a %= b
println(a)

//관계 연산자
val num1 = 10
val num2 = 10
val num3 = 20

println(num1 == num2)
println(num1 != num2)
println(num1 > num2)
println(num1 >= num2)
println(num1 < num3)
println(num1 <= num3)

//eq, ne
case class PersonCaseClass(name: String, age: Int)
val firstCaseClassInstance = PersonCaseClass("Donald", 66)
val secondCaseClassInstance = PersonCaseClass("Donald", 66)
firstCaseClassInstance == secondCaseClassInstance // true
firstCaseClassInstance != secondCaseClassInstance // false
firstCaseClassInstance eq secondCaseClassInstance // false
firstCaseClassInstance ne secondCaseClassInstance // true

//논리 연산자
val f = false
if(f && false){
  println("jello")
}else{
  println("world")
}

val t: Boolean = true
val f: Boolean = false
println(t && t)
println(t && f)
println(f && f)
println(t || t)
println(t || f)
println(f || f)
println(!t)
println(!f)
println(!(t || f))


// 비트 연산자
var a: Int = 2 // 2진수(0010)
var b: Int = 6 // 2진수(0110)
println(a & b)
println(a | b)
println(a ^ b)
println(~b)
println(a << 1)
println(a >> 1)


//연산자 처리 순서
// 1. () []
// 2. ! ~
// 3. * / %
// 4. + -
// 5. >> <<
// 6. < <= > >=
// 7. == !=
// 8. &
// 9. ^
// 10. |
// 11. &&
// 12. ||
// 13. 대입 연산자 (= += -= ...)



//Operator Overloading
case class Vec(x: Double, y: Double){
  def +(that: Vec) = Vec(this.x + that.x, this.y + that.y)
}
val vector1 = Vec(1.0, 1.0)
val vector2 = Vec(2.0, 2.0)
val vector3 = vector1 + vector2
vector3.x
vector3.y

case class MyBool(x: Boolean) {
  def &&(that: MyBool): MyBool = if (x) that else this
  def ||(that: MyBool): MyBool = if (x) this else that
  def unary_!(): MyBool = MyBool(!x)
}
val bool1 = MyBool(true)
val bool2 = MyBool(false)
bool1 && bool2
bool1 || bool2
!bool1
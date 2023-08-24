/*
반복문을 이용해서 Fibonnaci 수열을 담은 Array를 만들어 보세요.

def fibonnaci(size: Int) = Array[Int]

- 아래의 코드가 모두 true 가 나와야함
fibonnaci(-1).isEmpty
fibonnaci(0).isEmpty
fibonnaci(1).toSeq == List(0)
fibonnaci(2).toSeq == List(0, 1)
fibonnaci(5).toSeq == List(0, 1, 1, 2, 3)
fibonnaci(10).toSeq == List(0, 1, 1, 2, 3, 5, 8, 13, 21, 34)
*/

val nums: List[Int] = List(1,2,3,4,5)

/*
val doubleNumbersWithYield = for (num <- nums) yield num * 2
println(doubleNumbersWithYield)
// 출력: List(2, 4, 6, 8, 10)

val nums: List[Int] = List(1,2,3,4,5)
for (num <- nums if num >= 4) println(num)


def fibonnaci(size: Int): Array[Int]={
  println(size)
  Array.empty[Int]
}
fibonnaci(-1).isEmpty
fibonnaci(0).isEmpty
fibonnaci(1).toSeq == List(0)
fibonnaci(2).toSeq == List(0, 1)
fibonnaci(5).toSeq == List(0, 1, 1, 2, 3)
fibonnaci(10).toSeq == List(0, 1, 1, 2, 3, 5, 8, 13, 21, 34)

 */

def fibonnaci(size: Int): Array[Int]={
  println(size)
  if (size<=0) Array.empty[Int]
  else if (size==1) Array(0)
  else{

    var ary = Array(0,1)
    for (i <- 2 until size){
      ary = ary :+ (ary(i - 1) + ary(i - 2))
    }
    ary
  }
}

fibonnaci(-1).isEmpty
fibonnaci(0).isEmpty
fibonnaci(1).toSeq == List(0)
fibonnaci(2).toSeq == List(0, 1)
fibonnaci(5).toSeq == List(0, 1, 1, 2, 3)
fibonnaci(10).toSeq == List(0, 1, 1, 2, 3, 5, 8, 13, 21, 34)

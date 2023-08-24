/*
- 2차원 행렬을 나타내는 타입 Matrix 를 선언하고, Matrix의 곱셈을 표현하는 operator 를 정의해보세요.
- hint
alias 에 대한 생성자

type Row = Array[Int]
Row(1,1) // fail
def Row(xs: Int*) = Array(xs: _*) // alias type 에 대한 생성자역할을 하는 함수
Row(1,1)

alias type 에 대한 operator overloading - implicit class 를 이용 (scala 2.x )

implicit class MatrixOperators(_this: Matrix) {
  def *(other: Matrix): Option[Matrix] = {
    // your implementaion
  }
}
 */



//실패ㅠㅠ
/*
- 문제
    1. 사람은 자식, 부모님, 조부모님이 있다.
    2. 모든 사람은 이름, 나이, 현재 장소정보(x,y좌표)가 있다.
    3. 모든 사람은 걸을 수 있다. 장소(x, y좌표)로 이동한다.
    4. 자식과 부모님은 뛸 수 있다. 장소(x, y좌표)로 이동한다.
    5. 조부모님의 기본속도는 1이다. 부모의 기본속도는 3, 자식의 기본속도는 5이다.
    6. 뛸때는 속도가 기본속도대비 +2 빠르다.
    7. 수영할때는 속도가 기본속도대비 +1 빠르다.
    8. 자식만 수영을 할 수 있다. 장소(x, y좌표)로 이동한다.

    위 요구사항을 만족하는 클래스들을 바탕으로, Main 함수를 다음 동작을 출력(`System.out.println`)하며 실행하도록 작성하시오. 이동하는 동작은 각자 순서가 맞아야 합니다.

    1. 모든 종류의 사람의 인스턴스는 1개씩 생성한다.
    2. 모든 사람의 처음 위치는 x,y 좌표가 (0,0)이다.
    3. 모든 사람의 이름, 나이, 속도, 현재위치를 확인한다.
    4. 걸을 수 있는 모든 사람이 (1, 1) 위치로 걷는다.
    5. 뛸 수 있는 모든 사람은 (2,2) 위치로 뛰어간다.
    6. 수영할 수 있는 모든 사람은 (3, -1)위치로 수영해서 간다.
 */

class Person(val name: String, val age: Int){

  var position_X: Int = 0
  var position_Y: Int = 0
  val speed: Int = 1

  def walk(posX: Int, posY: Int): Unit = {
    position_X = posX
    position_Y = posY
    println(s"speed: $speed, location: ($position_X, $position_Y)")
  }

  def run(posX: Int, posY: Int): Unit = {
    position_X = posX
    position_Y = posY
    println(s"speed: ${speed+2}, location: ($position_X, $position_Y)")
  }

  def swim(posX: Int, posY: Int): Unit = {
    position_X = posX
    position_Y = posY
    println(s"speed: ${speed+1}, location: ($position_X, $position_Y)")
  }

  def meme(): Unit = {
    println(s"name: $name, age: $age, speed: $speed, position: ($position_X, $position_Y)")
  }
}



class Child(name: String, age: Int) extends Person(name, age) {
  override val speed: Int = 5
}


class Parent(name: String, age: Int) extends Person(name, age) {
  override val speed: Int =  3  // Override the default speed to 5 for the child


  override def swim(posX: Int, posY: Int): Unit = {
    println("Parent don't swim")
  }
}



class GrandParent(name: String, age: Int) extends Person(name, age) {
  override val speed: Int =  1  // Override the default speed to 5 for the child

  override def run(posX: Int, posY: Int): Unit = {
    println("GrandParent don't run")
  }

  override def swim(posX: Int, posY: Int): Unit = {
    println("GrandParent don't swim")
  }
}


val child = new Child("Child", 10)
val parent = new Parent("Parent", 35)
val grandparent = new GrandParent("Grandparent", 70)


child.meme()
parent.meme()
grandparent.meme()

child.walk(1,1)
parent.walk(1,1)
grandparent.walk(1,1)

child.run(2,2)
parent.run(2,2)
grandparent.run(2,2)

child.swim(3,-1)
parent.swim(3,-1)
grandparent.swim(3,-1)


child.meme()
parent.meme()
grandparent.meme()

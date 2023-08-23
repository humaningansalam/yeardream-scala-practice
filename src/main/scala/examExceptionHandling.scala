package org.yeardream.scala

import java.io.{FileNotFoundException, IOException}
import scala.io.{BufferedSource, Source}

object examExceptionHandling {
  def main(args: Array[String]): Unit = {
    var file: BufferedSource = null
    try {
      // 파일을 읽어오는 코드 호출 -> FileNotFoundException 발생
                  val filename = "./UnknownFile"
                  file = Source.fromFile(filename)
                  for (line <- file.getLines) {
                    println(line)
                  }

      // 다음 커맨드로 미리 포트를 열어놓는다.
      // python3 -m http.server --cgi 8080
      // BindException 발생
      //      val socket = new ServerSocket(8080)
      //      socket.accept()

      // 직접 Exception 발생
      //       throw new Exception("My Custom Exception")

    } catch {
      case e: FileNotFoundException =>
        println("File not found")
        println(e)
      case e: IOException =>
        println("IO exception occurred")
        println(e)
      case e: Throwable =>
        println(e)
        println("default")
    } finally {
      if (file != null) {
        file.close()
      }
      // 에러 캐치를 하고 나서 실행시키고 싶은 코드
      // 예) 데이터베이스 연결 종료
    }
  }

}

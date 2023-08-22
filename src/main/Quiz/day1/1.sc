/*
다음 주어진 List 에 있는 단어의 수와, 총 문자의 수를 한번에 계산하는 함수를 collection 을 이용해서 계산하세요
val wordList = List("apple", "basket", "candy")// 5, 6, 5
*/

val wordList = List("apple", "basket", "candy")

val wordCount = wordList.length
val lengthAccum: (Int, String) => Int = (accum, word) => accum + word.length
val letterCount = wordList.aggregate(0)(lengthAccum, _ + _)

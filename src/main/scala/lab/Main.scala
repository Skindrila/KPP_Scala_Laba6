package lab

import scala.collection.mutable

object Main {
  def indexMul(list: List[Int]): mutable.MutableList[Int] = {
    val result = mutable.MutableList[Int]()
    for (i <- 0 until list.length) {
      if (list.indexOf(i) % 2 == 0)
        list(i) * 10
    }
    result
  }
  
  def stringToInt(list: List[String]): List[Int] = {
    list.foldLeft(List[Int]()){
      (result: List[Int], stringEl: String) =>
        result ::: List(stringEl.toInt)
    }
  }

  def split(list: List[String]): List[Char] = {
    list.flatMap(_.toString).toList
  }
}

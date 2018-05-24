import lab.Main
import org.scalatest._

import scala.collection.mutable

class ScalaTest extends FlatSpec with Matchers {
  it should "Index multiply" in {
    val list = List[Int](1,2,3,4,5,6)
    val result = mutable.MutableList[Int]()
    assert(Main.indexMul(list) == result)
  }

  it should "String to Integer" in {
    val list = List[String]("1", "2", "3", "4", "5", "6")
    assert(Main.stringToInt(list) == 21)
  }

  it should "Split String" in {
    val list = List[String]("a2", "3", "4e")
    assert(Main.split(list) == List('a', '2', '3', '4', 'e'))
  }

}


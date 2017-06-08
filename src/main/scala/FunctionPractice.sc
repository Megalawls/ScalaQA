import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.ListBuffer
var calculator = (input:ArrayBuffer[Int]) =>{
  for(x <- 0 to input.length-1){
    for(y <- (0) to input.length-1){if(x != y) {
        println(input(x) + " + " + input(y) + " = " + (input(x) + input(y)))
        println(input(x) + " - " + input(y) + " = " + (input(x) - input(y)))
        println(input(x) + " / " + input(y) + " = " + (input(x) / input(y)))
        println(input(x) + " * " + input(y) + " = " + (input(x) * input(y)))
      var collection = ArrayBuffer[Int]()
      collection += input(x)*input(y)
      collection += input(x)/input(y)
      collection += input(x)+input(y)
      collection += input(x)-input(y)
      collection.toList

     // collection.foreach(item=> collection.contains())

    }

      }
    }
}

var input = ArrayBuffer[Int](3, 5, 15)
calculator(input)
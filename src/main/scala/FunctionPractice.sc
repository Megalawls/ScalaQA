import scala.collection.mutable.ArrayBuffer

var calculator = (input:ArrayBuffer[Int]) =>{
  for(x <- 0 to input.length-1){
    for(y <- 0 to input.length-1){if(x != y) {
      for(z <- 0 to input.length-1) {

       if (input(x)+input(y) == input(z)) println(input(x) + " + " + input(y) + " = " + (input(x) + input(y)))
        if (input(x)-input(y) == input(z))println(input(x) + " - " + input(y) + " = " + (input(x) - input(y)))
        if (input(x)/input(y) == input(z))println(input(x) + " / " + input(y) + " = " + (input(x) / input(y)))
        if (input(x)*input(y) == input(z))println(input(x) + " * " + input(y) + " = " + (input(x) * input(y)))
      }
    }

      }
    }
}

var input = ArrayBuffer[Int](3, 5, 15)
calculator(input)
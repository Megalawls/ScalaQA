object ScalaBasics1 {

  def main(args: Array[String]): Unit = {
    Greetings("Hello World")
    println(Greetings2("Dan"))
    println(TypeInference("10923.123"))
    Strings("electricboogaloo", 5)
    Strings2("Hello", " World", 'e', 'u')
    println(Operators(true, 0, 50))
    Iteration("This String", 5)
    Iteration2('a', 5)
    FizzBuzz("Fizz", "Buzz", 20)
  }

  def Greetings(string: String) = {
    println(string)
  }

  def Greetings2(name: String): String = {
    "Hello " + name
  }

  def TypeInference(thing: Any) = {
    thing
  }

  def Strings(string: String, int: Int): Unit ={
    var len = string.length
    var fromEnd = len - int
    var newString = string.substring(fromEnd, len)
    println(newString)
  }

  def Strings2(string1: String, string2: String, char1: Char, char2: Char): Unit ={
    var string = string1 concat string2
    println(string replace(char1, char2))
  }

  def Operators(add: Boolean, int1: Int, int2: Int): Any ={
    if(int1 == 0){int2}
    else if(int2 == 0){int1}
    else if(add){int1+int2}
    else if(!add){int1*int2}
  }

  def Iteration(string: String, int: Int) = {
    var int2 = int
    while(int2 > 0){
      println(string)
      int2 -= 1
    }
  }

  def Iteration2(char: Char, int: Int) = {
    var number = int
    for(x <-1 to number by 1){
      for(x <- 1 to number  by 1){
        print(char)
      }
      println(" ")
    }
  }

  def FizzBuzz(string1: String, string2: String, int: Int) = {
    for(x <- 1 to int){
      if(x % 3 == 0 && x% 5 == 0){println(string1 concat(string2))}
      if(x % 3 == 0){println(string1)}
      if(x % 5 == 0){println(string2)}
      else{println(x)}
    }
  }

}

import java.util.TimeZone.getAvailableIDs

object ScalaBasics1 {

  def main(args: Array[String]): Unit = {
//    Greetings("Hello World")
//    println(Greetings2("Dan"))
//    println(TypeInference("10923.123"))
//    Strings("electricboogaloo", 5)
//    Strings2("Hello", " World", 'e', 'u')
//    println(Operators(true, 0, 50))
//    Iteration("This String", 5)
//    Iteration2('a', 5)
//    FizzBuzz("Fizz", "Buzz", 20)
//    println(matchConditionals("add", 10, 20))
//    var integers = Array(2, 10)
//    println(matchSwapper(integers))
//    getAvailableIDs().map(a=>a.split("/")).filter(_.length>1).grouped(10).toArray.map(a=>println(a(0)(1)))
            //Splits instances in the map with a / by the / into an array, leaving some of the instances in the array as an array.
            //Filters the array to exclude those that have not been split, ie, those that have only one think in their array
            //Groups these by ten, populating arrays with them, then prints out the second thing in said array
//    blackJack(23, 11)
//    uniqueSum(12, 2, 9)
//    println(isTooHot(70, true))
//    beerPriceOptional(23.0, 22.0, Some(2))
    greetings("Dave")

}

  def Greetings(string: String) = { //Method
    println(string)
  }

  var greetings = (name: String) =>{
    println(s"Hello, $name")
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

  def matchConditionals(x: String, y: Int, z: Int) = x.toLowerCase match{
      case "add" => y + z
      case "subtract" => y - z
      case "multiply" => y * z
      case "divide" => y / z
      case _ => "Please give add, subtract, multiply, or divide, along with two commas"
  }

   def matchSwapper(any: Any) = any match{
    case Array(a, b) => (b, a)
    case List(a, b) => (b, a)
    case (a, b) => (b, a)
    case _ => "Please provide either an Array, a List, or a Tuple"
  }

  def blackJack(a: Int, b: Int) = {
    if(a <= 0 && b <= 0){println("Please provide two integers larger than zero")}
    else if(a > 21 && b > 21){println("0")}
    else if((a > b || b > 21) && a <= 21){println(a)}
    else if((b > a || a > 21) && b <= 21){println(b)}
  }

  def uniqueSum(a: Int, b: Int, c: Int) = {
  if(a==b && b==c){println(0)}
  else if(a==b){println(c)}
  else if(b==c){println(a)}
  else if(a==c){println(b)}
    else{println(a+b+c)}
  }

  def isTooHot(temp: Int, isSummer: Boolean): Boolean = {
    if(isSummer && (temp <= 100 && temp >= 60)){false}
    else if(!isSummer && (temp <= 90 && temp >= 60)){false}
    else{true}
  }
  def beerPriceOptional(quantity: Double, price: Double, discount: Option[Double] = Some(0)): Double = (quantity * price) - discount.get

}

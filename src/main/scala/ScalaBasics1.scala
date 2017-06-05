object ScalaBasics1 {

  def main(args: Array[String]): Unit = {
    Greetings("Hello World")
    println(Greetings2("Dan"))
    println(TypeInference("10923.123"))
    Strings("electricboogaloo", 5)
    Strings2("Hello", " World", 'e', 'u')
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

}

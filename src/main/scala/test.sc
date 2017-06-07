//import scala.collection.mutable.Map
//
//val morseCode: Map[Char, String] = Map()
//morseCode += ('a' -> ".-")
//morseCode += ('b' -> "-...")
//morseCode += ('c' -> "-.-.")
//morseCode += ('d' -> "-..")
//morseCode += ('e' -> ".")
//morseCode += ('f' -> "..-.")
//morseCode += ('g' -> "--.")
//morseCode += ('c' -> "-.-.")
//
//morseCode.keys.foreach{ i =>
//  println(i + morseCode(i))
//
//}
//
//println(morseCode.keys)

def morseToEnglish(x: String) = x match {
  case "a" => ".-"
  case "b" => "-.."
  case "c" => "-.-."
  case "d" => "-.."
  case "e" => ""
  case _ => "Please give add, subtract, multiply, or divide, along with two commas"
}
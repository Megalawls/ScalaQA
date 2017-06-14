import scala.collection.mutable.ArrayBuffer

object OfflineExercise{

  def main(args: Array[String]): Unit = {
    //println(stutter("What the fuck did you just fucking say about me, you little bitch? I’ll have you know I graduated top of my class in the Navy Seals, and I’ve been involved in numerous secret raids on Al-Quaeda, and I have over 300 confirmed kills. I am trained in gorilla warfare and I’m the top sniper in the entire US armed forces. You are nothing to me but just another target. I will wipe you the fuck out with precision the likes of which has never been seen before on this Earth, mark my fucking words. You think you can get away with saying that shit to me over the Internet? Think again, fucker. As we speak I am contacting my secret network of spies across the USA and your IP is being traced right now so you better prepare for the storm, maggot. The storm that wipes out the pathetic little thing you call your life. You’re fucking dead, kid. I can be anywhere, anytime, and I can kill you in over seven hundred ways, and that’s just with my bare hands. Not only am I extensively trained in unarmed combat, but I have access to the entire arsenal of the United States Marine Corps and I will use it to its full extent to wipe your miserable ass off the face of the continent, you little shit. If only you could have known what unholy retribution your little “clever” comment was about to bring down upon you, maybe you would have held your fucking tongue. But you couldn’t, you didn’t, and now you’re paying the price, you goddamn idiot. I will shit fury all over you and you will drown in it. You’re fucking dead, kiddo"))
    //println(sanwidge("asdsrgbreadyou smell like dog buns reeeeeeeeeeebread  wqeioufygbres"))
    //println(differenceIsEqual(2, 6, 4))
    //println(bunnies(4))
    //println(fibonacci(5))
    //diamante(15, '@')
    //println(endsInLy("smeelll"))
    cleanString("mmeeeee  reeeeeeeee ftttasssss")
  }
    //Task One - Complete
  def stutter(input: String): String = {
    var chararray = input.toCharArray()
    var result: String = ""
    for(i <- 0 to chararray.length-1){
      result += chararray(i)
      result += chararray(i)
    }
    result
  }

    //Task Two - Complete
  def sanwidge(input: String): String = {
      var result: Array[String] = input.split("bread")
    if(result.length == 3)result(1)
    else ""
  }

    //Task Three - Complete
    val ordered = Array[Int](0, 0, 0)
  def differenceIsEqual(x: Int, y: Int, z: Int): Boolean ={
    if(x >= y && x>= z){
      ordered(0) = x
      if(y >= z){
        ordered(1) = y
        ordered(2) = z
      }else{ordered(1) = z; ordered(2) = y}
    }else{differenceIsEqual(y, z, x)}

    if((ordered(0) - ordered(1) == ordered(1) - ordered(2))){true}else{false}
  }

    //Task Four - Complete
  var fibonacciSeq = ArrayBuffer[Int](0, 1)
  //should be 0, 1, 1, 2, 3, 5, 8, 13, 21
  var count = 0

  def fibonacci(n: Int): Int ={
    if(n > 0){
      fibonacciSeq += ((fibonacciSeq(count) + fibonacciSeq(count+1)))
      count += 1
      val n2 = n-1
      fibonacci(n2)
    }else (fibonacciSeq(fibonacciSeq.max - 4)) //-4 accounts for the sequence being initialised with two values, and the array starting from zero when I want the nth number to start from one
  }

    //Task Five - Complete
    var ears = 0
  def bunnies(wabbits: Int): Int ={
    ears += 2
    if(wabbits != 1){bunnies(wabbits - 1)}
    else ears
  }

    //Task Six

    //Task Seven
  def endsInLy(input: String): Boolean ={
    val length = input.length
    if((input.charAt(length-1) == 'y' && input.charAt(length-2) == 'l'))true
    else false
  }
    //Task Eight - Failed this miserably
  var resultString: String = ""

  def cleanString(string: String): Unit = {
    if(resultString.isEmpty){resultString += string.charAt(0); cleanString(string.toCharArray.tail.toString)}
    else if(string.toCharArray.head != string.charAt(0)){resultString += string.toCharArray.head; cleanString(string.toCharArray.tail.toString)}
    else cleanString(string.toCharArray.tail.toString)
  }

    //Task Nine - creates a diamond of height*2 filled with a given character
  def diamante(height: Int, char: Char): Unit = {
    diamanteTop(height, char)
    diamanteBottom(height, char)
      }

  def diamanteTop(height: Int, char: Char): Unit = {
    for(i <- 1 to height){
      var lineToPrint = ""
      for(x<-1 to (height-i))lineToPrint += " "
      lineToPrint += "/"
      for(x<-1 to ((i*2)-2)) lineToPrint += char
      lineToPrint += "\\"
      for(x<-1 to (height-i))lineToPrint += " "
      println(lineToPrint)
    }
  }

  def diamanteBottom(height: Int, char: Char): Unit = {
    for(i <- 1 to height){
      var lineToPrint = ""
      for(x<-1 to ((i+1)-2))lineToPrint += " "
      lineToPrint += "\\"
      for(x<-1 to (height-i)*2) lineToPrint += char
      lineToPrint += "/"
      for(x<-1 to ((i+1)-2))lineToPrint += " "
      println(lineToPrint)
    }
  }

    //Task Ten

  def diamanteHollow(height: Int): Unit = {
    diamanteTop(height)
    diamanteBottom(height)
  }

  def diamanteTop(height: Int): Unit = {
    for(i <- 1 to height){
      var lineToPrint = ""
      for(x<-1 to (height-i))lineToPrint += " "
      lineToPrint += "/"
      for(x<-1 to ((i*2)-2)) lineToPrint += " "
      lineToPrint += "\\"
      for(x<-1 to (height-i))lineToPrint += " "
      println(lineToPrint)
    }
  }

  def diamanteBottom(height: Int): Unit = {
    for(i <- 1 to height){
      var lineToPrint = ""
      for(x<-1 to ((i+1)-2))lineToPrint += " "
      lineToPrint += "\\"
      for(x<-1 to (height-i)*2) lineToPrint += " "
      lineToPrint += "/"
      for(x<-1 to ((i+1)-2))lineToPrint += " "
      println(lineToPrint)
    }
  }




}
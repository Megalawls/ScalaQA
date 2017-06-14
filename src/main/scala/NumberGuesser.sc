import scala.util.Random

object Main {
  def main(args: Array[String]): Unit = {
    startNumberGuessing(scala.io.StdIn.readLine().toInt)
  }

  def startNumberGuessing(userNumber : Int): Unit = {
    var guessed = false
    var lowestBoundary = 0
    var highestBoundary = 100
    var followupguess : Option[String] = None

    do {
      val guess = lowestBoundary + Random.nextInt(highestBoundary - lowestBoundary + 1)
      println("Guessing at: " + guess)
      guessed = userNumber == guess
      if (!guessed) {
        def checkhigherlower() : Unit = scala.io.StdIn.readLine() match {
          case "higher" if guess < userNumber => lowestBoundary = guess + 1
          case "lower" if guess > userNumber => highestBoundary = guess - 1
          case "boiling" if math.abs(guess - userNumber) == 1 => {
            lowestBoundary = math.min(lowestBoundary, guess - 1)
            highestBoundary = math.min(highestBoundary, guess + 1)
            followupguess = Option("boiling")
          }
          case "freezing" if math.abs(guess - userNumber) > 50 => {
            if (guess - userNumber < 0) lowestBoundary += 50
            else highestBoundary -= 50
          }
          case _ => {println("Lying or invalid command"); checkhigherlower()}
        }

        followupguess match {
          case Some(command) if command == "boiling" => {
            if (guess > userNumber) println("Wasn't higher, so it must be: " + (guess - 2))
            else println("Wasn't lower, so it must be: " + (guess + 2))
            guessed = true
          }
          case None => {println("Is it higher, lower, boiling or freezing?", lowestBoundary, highestBoundary); checkhigherlower()}
        }
      }
    } while (!guessed)
  }
}

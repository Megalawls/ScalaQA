var input = "100 120\n297 90\n66 110\n257 113\n276 191\n280 129\n219 163\n254 193\n86 153\n206 147\n71 137\n104 40\n238 127\n52 146\n129 197\n144 59\n157 124\n210 59\n11 54\n268 119\n261 121\n12 189\n186 108\n174 21\n77 18\n54 90\n174 52\n16 129\n59 181\n290 123\n248 132"

def golidlockschairs(inputString : String) : Unit = {
  val data = inputString.split("\n").map(string => string.split(" "))
  val criteria = (data(0)(0).toInt, data(0)(1).toInt)

  def compareSeats(seats : Array[Array[String]], index : Int): Unit = seats.isEmpty match {
    case true => {}
    case _ => {
      if (seats.head(0).toInt >= criteria._1 && seats.head(1).toInt <= criteria._2) println("#" + index)
      compareSeats(seats.tail, index + 1)
    }
  }

  compareSeats(data.tail, 1)
}

golidlockschairs(input)
golidlockschairs("100 80\n30 50\n130 75\n90 60\n150 85\n120 70\n200 200\n110 100")

import scala.collection.mutable.ArrayBuffer

class Garage {
  var isOpen: Boolean = false
  var vehicleList: ArrayBuffer[Vehicle] = ArrayBuffer.empty
  var employeeList: ArrayBuffer[Employee] = ArrayBuffer.empty

  //Adding vehicle using method overloading because I wanted to practice it
  def addVehicle(make: String, model: String, reg: String): Unit = {
    vehicleList += new Motorbike(make, model, reg)
  }

  def addVehicle(make: String, model: String, reg: String, wheels: Int): Unit = {
    vehicleList += new Car(make, model, reg, wheels)
  }

  def newEmployee(fName: String, lName: String, contactNo: String, employeeType: String): Unit = {
    employeeList += Employee(fName, lName, contactNo, employeeType)
  }

  //Removing vehicles by ID or Type
  def removeVehicle[T](typeID: String): Unit = {
    typeID.toLowerCase() match {
      case "car"              => vehicleList = vehicleList.filter(!_.isInstanceOf[Car])
      case "motorbike"        => vehicleList = vehicleList.filter(!_.isInstanceOf[Motorbike])
      case typeID: String     => vehicleList = vehicleList.filter(_.reg.toLowerCase() != typeID.toLowerCase())
    }
  }
  //Fix Vehicle and prepare bill for cost for each part.
  def fixVehicle(reg: String): Unit = {
    var costToFix: Double = 0
    vehicleList.find(a => a.reg == reg).foreach(vehicle => {
      vehicle.vehicleParts.foreach(part => {
        if (part.isBroken) {
          part.isBroken = false
          costToFix += part.costToFix
          println("Cost to fix " + part.name + " = " + part.costToFix)
        }
      })
    })
    println("Total Cost = " + costToFix)
  }

  def openGarage(): Unit ={
    if(!isOpen){isOpen = true}
  }

  def closeGarage(): Unit ={
    if(isOpen){isOpen = false}
  }
}

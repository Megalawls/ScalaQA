import scala.collection.mutable.ArrayBuffer

class Garage {

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
    typeID.toLowerCase() match{
      case "car"          =>    vehicleList = vehicleList.filter(!_.isInstanceOf[Car])
      case "motorbike"    =>    vehicleList = vehicleList.filter(!_.isInstanceOf[Motorbike])
      case typeID: String =>    vehicleList = vehicleList.filter(_.reg.toLowerCase() != typeID.toLowerCase())
    }
  }

  //def fixVehicle()


}

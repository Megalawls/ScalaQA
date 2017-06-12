import scala.collection.mutable.ArrayBuffer

abstract class Vehicle(vehicleType: String, make: String, model: String, reg: String){
  case class Part(name: String, isBroken: Boolean, costToFix: Double, quantity: Int) // Create a full parts list with boolean car/bike
  var vehicleParts = new ArrayBuffer[Part]

  override def toString = s"$vehicleType - $make $model - Reg:$reg \nParts: $vehicleParts"

  def populateParts(wheels: Int): Unit = {

  }
}

case class Car(make: String, model: String, reg: String) extends Vehicle(vehicleType = "Car", make, model, reg)

case class Motorbike(vehicleType: String, make: String, model: String, reg: String) extends Vehicle(vehicleType = "Motorbike", make, model, reg)
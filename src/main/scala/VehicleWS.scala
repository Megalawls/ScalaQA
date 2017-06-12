import scala.collection.mutable.ArrayBuffer

abstract class Vehicle(vehicleType: String, make: String, model: String, reg: String){
  case class Part(name: String, isBroken: Boolean, costToFix: Double, quantity: Int) // Create a full parts list with boolean car/bike
  var carParts = new ArrayBuffer[Part]
}

case class Car(vehicleType: String, make: String, model: String, reg: String) extends Vehicle(vehicleType = "Car", make, model, reg)


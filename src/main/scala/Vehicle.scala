import scala.collection.mutable.ArrayBuffer

abstract case class Vehicle(vehicleType: String, make: String, model: String, reg: String) {
  var vehicleParts: ArrayBuffer[Any] = ArrayBuffer.empty
//  def getMake = make
//  def getModel = model
//  def getReg = reg
}

case class Part(name: String, costToFix: Double) {
  var isBroken: Boolean = false
}

class Car(make: String, model: String, reg: String, wheels: Int) extends Vehicle(vehicleType = "Car", make, model, reg) {
  Car.populateParts(wheels, vehicleParts)

  override def toString = s"Car - $make $model - Reg:$reg \nParts: $vehicleParts"
}

object Car {
  var populateParts = (wheels: Int, array: ArrayBuffer[Any]) => {
    array += Part("Boot", 50.00)
    array += Part("Engine", 300)
    array += Part("Windscreen", 150)
    array += Part("Gearbox", 200)
    for(_ <- 1 to wheels){
    array += Part("Wheel", 125)}
  }
}

class Motorbike(make: String, model: String, reg: String) extends Vehicle(vehicleType = "Motorbike", make, model, reg) {
  var wheels: Int = 2
  Motorbike.populateParts(vehicleParts)

  override def toString = s"Motorbike - $make $model - Reg:$reg \nParts: $vehicleParts"
}

object Motorbike {
  var populateParts = (array: ArrayBuffer[Any]) => {
    array += Part("Engine", 300)
    array += Part("Windscreen", 150)
    array += Part("Gearbox", 200)
    array += Part("Wheel", 125)
    array += Part("Wheel", 125)
  }
}
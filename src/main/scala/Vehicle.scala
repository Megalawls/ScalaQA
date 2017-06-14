import scala.collection.mutable.ArrayBuffer

abstract case class Vehicle(vehicleType: String, make: String, model: String, reg: String) {
  var vehicleParts: ArrayBuffer[Part] = ArrayBuffer.empty
}

case class Part(var name: String, var costToFix: Double, var isBroken: Boolean)

class Car(make: String, model: String, reg: String, wheels: Int) extends Vehicle(vehicleType = "Car", make, model, reg) {
  Car.populateParts(wheels, vehicleParts)

  override def toString = s"Car - $make $model - Reg:$reg \nParts: $vehicleParts"
}

object Car {
  var populateParts = (wheels: Int, array: ArrayBuffer[Part]) => {
    array += Part("Boot", 50.00, false)
    array += Part("Engine", 300, false)
    array += Part("Windscreen", 150, false)
    array += Part("Gearbox", 200, false)
    for(_ <- 1 to wheels){
    array += Part("Wheel", 125, false)}
  }
}

class Motorbike(make: String, model: String, reg: String) extends Vehicle(vehicleType = "Motorbike", make, model, reg) {
  var wheels: Int = 2
  Motorbike.populateParts(vehicleParts)

  override def toString = s"Motorbike - $make $model - Reg:$reg \nParts: $vehicleParts"
}

object Motorbike {
  var populateParts = (array: ArrayBuffer[Part]) => {
    array += Part("Engine", 300, false)
    array += Part("Windscreen", 150, false)
    array += Part("Gearbox", 200, false)
    array += Part("Wheel", 125, false)
    array += Part("Wheel", 125, false)
  }
}

object Runner extends App{
  val myGarage = new Garage

  val Employee1 = Employee("Dave", "Davies", "07983238185", "Mechanic")
  println(Employee1.toString())

  val Employee2 = Employee("Steven", "Stevies", "07983238185", "Mechanic")
  println(Employee2.toString())

  myGarage.addVehicle("Toyota", "Prius", "SE19 1JT", 4)
  println(myGarage.vehicleList.toString())

  myGarage.removeVehicle("")
  println(myGarage.vehicleList.toString())
}

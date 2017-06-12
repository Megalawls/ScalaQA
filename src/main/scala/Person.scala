
abstract class Person(fName: String, lName: String, contactNo: String)

 case class Employee(fName: String, lName: String, contactNo: String, employeeType: String) extends Person(fName, lName, contactNo) {
  val id: Int = Employee.nextID()

  override def toString = s"$fName $lName, \nEmployee No:  $id, Employee Type: $employeeType"
}

object Employee {
  var employeeId = 0

  def nextID(): Int = {
    employeeId += 1
    employeeId
  }
}

case class Customer(fName: String, lName: String, contactNo: String, customerNo: Int) extends Person(fName, lName, contactNo) {
  override def toString = s"$fName $lName, \nCustomer No:  $customerNo, Phone: $customerNo"
}

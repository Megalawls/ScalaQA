
println(beerPrice(5, 5.00))

def beerPrice(quantity: Int, price: Double, discount: Double = 0.00): Double ={
  (quantity * price) - discount
}
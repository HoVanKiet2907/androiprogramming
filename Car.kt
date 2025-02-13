// Car Class
class Car(val name: String, val price: Double)

// Customer Class
class Customer(val name: String) {
    fun buyCar(car: Car): String {
        return "$name bought a ${car.name} for \$${car.price}"
    }
}

// Function to calculate total payment
fun calculateTotalPayment(price: Double): Double {
    val tax = when {
        price <= 20000 -> 0.05  // 5% tax for price <= 20,000
        price <= 50000 -> 0.1   // 10% tax for 20,001 to 50,000
        else -> 0.15            // 15% tax for price > 50,000
    }
    return price + (price * tax)
}

fun displayCars(cars: List<Car>) {
    println("Available Cars:")
    for (car in cars) {
        println("- ${car.name}: \$${car.price}")
    }
}

fun main() {
    // List of Cars
    val cars = listOf(
        Car("Toyota Corolla", 18000.0),
        Car("Honda Accord", 30000.0),
        Car("BMW X5", 60000.0)
    )

    // Display available cars
    displayCars(cars)
    // Create a customer
    val customer = Customer("kiet")

    // Choose a car
    val chosenCar = cars[2]

    // Customer buys the car
    println(customer.buyCar(chosenCar))

    // Calculate and display the total payment
    val totalPayment = calculateTotalPayment(chosenCar.price)
    println("Total payment including tax: \$${"% .2f".format(totalPayment)}")
}

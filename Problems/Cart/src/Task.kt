fun main() {
    val productType = readLine()!!
    val price = readLine()!!
    val product = createProduct(productType, price.toInt())
    println(totalPrice(product))
}

open class Product(val price: Int) {
    open val productTax = 0.0
}

class HeadPhone(price: Int) : Product(price) {
    override val productTax = .11
}

class SmartPhone(price: Int) : Product(price) {
    override val productTax = .15
}

class TV(price: Int) : Product(price) {
    override val productTax = .17
}

class Laptop(price: Int) : Product(price) {
    override val productTax = .19
}

fun totalPrice(product: Product) = (product.price * (1 + product.productTax)).toInt()

fun createProduct(productType: String, price: Int) =
    when (productType) {
        "headphones" -> HeadPhone(price)
        "smartphone" -> SmartPhone(price)
        "tv" -> TV(price)
        "laptop" -> Laptop(price)
        else -> Product(0)
    }

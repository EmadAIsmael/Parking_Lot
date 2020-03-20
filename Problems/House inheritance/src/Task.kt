fun main() {
    val rooms = readLine()!!
    val price = readLine()!!
    val house = createHouse(rooms.toInt(), price.toInt())
    println(totalPrice(house))
}

open class House(val rooms: Int, val price: Int) {
    fun basePrice(): Int = if (price < 0) 0 else if (price > 1_000_000) 1_000_000 else price
    open fun finalPrice() = 0
}

class Cabin(rooms: Int, price: Int) : House(rooms, price) {
    val coefficient = 1

    override fun finalPrice(): Int = basePrice() * coefficient
}

class Bungalow(rooms: Int, price: Int) : House(rooms, price) {
    val coefficient = 1.2

    override fun finalPrice(): Int = (basePrice() * coefficient).toInt()
}

class Cottage(rooms: Int, price: Int) : House(rooms, price) {
    val coefficient = 1.25

    override fun finalPrice(): Int = (basePrice() * coefficient).toInt()
}

class Mansion(rooms: Int, price: Int) : House(rooms, price) {
    val coefficient = 1.4

    override fun finalPrice(): Int = (basePrice() * coefficient).toInt()
}

class Palace(rooms: Int, price: Int) : House(rooms, price) {
    val coefficient = 1.6

    override fun finalPrice(): Int = (basePrice() * coefficient).toInt()
}

fun createHouse(rooms: Int, price: Int): House =
    when (rooms) {
        1 -> Cabin(rooms, price)
        2, 3 -> Bungalow(rooms, price)
        4 -> Cottage(rooms, price)
        5, 6, 7 -> Mansion(rooms, price)
        8, 9, 10 -> Palace(rooms, price)
        else -> if (rooms < 1) Cabin(rooms, price) else if (rooms > 10) Palace(rooms, price) else House(rooms, price)
    }

fun totalPrice(house: House): Int {
    return house.finalPrice()
}

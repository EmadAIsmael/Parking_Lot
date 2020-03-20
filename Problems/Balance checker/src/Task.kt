import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    var balance = scanner.nextInt()
    while (scanner.hasNextInt()) {
        val purchase = scanner.nextInt()
        when {
            balance >= purchase -> balance -= purchase
            balance < purchase -> {
                println("Error, insufficient funds for the purchase. You have $balance, but you need $purchase.")
                return
            }
        }
    }
    println("Thank you for choosing us to manage your account! You have $balance money.")
}

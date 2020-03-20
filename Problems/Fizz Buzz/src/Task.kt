import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val from = scanner.nextInt()
    val to = scanner.nextInt()

    for (e in from..to) {
        println(
            when {
                e % 15 == 0 -> "FizzBuzz"
                e % 3 == 0 -> "Fizz"
                e % 5 == 0 -> "Buzz"
                else -> e
            }
        )
    }
}
